package com.mahmud.mydoc.common.service;

import com.mahmud.mydoc.common.exception.AlreadyExistsDataException;
import com.mahmud.mydoc.common.exception.NoEntityFoundException;
import com.mahmud.mydoc.common.exception.SystemException;
import com.mahmud.mydoc.common.exception.UniqueCodeRequiredException;
import com.mahmud.mydoc.common.model.BaseEntity;
import com.mahmud.mydoc.common.repository.IRepository;
import com.mahmud.mydoc.exception.PathNotFoundException;
import jakarta.transaction.Transactional;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;

import java.util.List;

@Setter
@Slf4j
public abstract class BaseService<T> implements IService<T> {
	protected IRepository<T, Long> repository;
	
	@Override
	public T get(Long componentId) throws NoEntityFoundException, PathNotFoundException,SystemException{
		try {
			if(repository.findByComponentId(componentId)==null)
				throw new NoEntityFoundException("Entity with component ID: "+componentId +" not found");
			return repository.getOne(componentId);
		} 
		catch (NoEntityFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw e;
		}

		catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new SystemException(e.getMessage());
		}
	}
	
	@Override
	public T get(String uniqueCode) throws NoEntityFoundException, SystemException {
		T entity = null;
		try {
			entity = repository.findByUniqueCode(uniqueCode);
			if(entity==null)
				throw new NoEntityFoundException("Entity with unique code: "+uniqueCode +" not found");
			return entity;
			
		}
		catch (NoEntityFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw e;
		}
		catch (Exception e) {
			throw new SystemException(e);
		}
	}
	
	public List<T> get() throws NoEntityFoundException,PathNotFoundException, SystemException{
		
		List<T> entities=null;
		
		try {
			entities = repository.findAll();
			if(entities.size()==0)
				throw new NoEntityFoundException("No data found");
			return entities;
			
		} catch (NoEntityFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw e;
		}catch (PathNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw e;
		}catch (Exception e) {
			// TODO Auto-generated catch block
			throw new SystemException(e);
		}
	}
	@Transactional
	public T save(T entity) throws AlreadyExistsDataException, UniqueCodeRequiredException, SystemException{
		log.info(entity.toString());
		try {


			if(this.checkUniqueCodeDuplicacy(entity))
				throw new AlreadyExistsDataException("Entity Already Exists", ((BaseEntity)entity).getUniqueCode());
			else if(((BaseEntity)entity).getUniqueCode()==null)
				throw new UniqueCodeRequiredException("Unique Code Can not be Null");
			return repository.save(entity);
		}
		catch (AlreadyExistsDataException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw e;
		}catch (UniqueCodeRequiredException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw e;
		}catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new SystemException(e.getMessage());
		}
	}
	@Transactional
	public T modify(Long id, T entity) throws NoEntityFoundException, UniqueCodeRequiredException, AlreadyExistsDataException, SystemException{
		try {
			if(repository.findByComponentId(id)==null)
				throw new NoEntityFoundException("Can not modify. Entity with component ID: "+id +" not found");
			else {
				if(this.checkUniqueCodeDuplicacy(entity))
					throw new AlreadyExistsDataException("Entity Already Exists", ((BaseEntity)entity).getUniqueCode());
				else if(((BaseEntity)entity).getUniqueCode()==null)
					throw new UniqueCodeRequiredException("Unique Code Can not be Null");
			}
			return repository.save(entity);
		} 
		catch (NoEntityFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw e;
		}catch (AlreadyExistsDataException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw e;
		}catch (UniqueCodeRequiredException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw e;
		}
		catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new SystemException(e.getMessage());
		}
		
	}

	public List<T> findPaginated(int pageNo, int pageSize) {
		Pageable paging = PageRequest.of(pageNo, pageSize);
		Page<T> pagedResult = repository.findAll(paging);
		return pagedResult.toList();
	}
	
	public void delete(Long id)throws NoEntityFoundException, SystemException {
		
		try {
			if(repository.findByComponentId(id)==null)
				throw new NoEntityFoundException("Entity with component ID: "+id +" not found");
			repository.deleteById(id);
		} 
		catch (NoEntityFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw e;
		}
		catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new SystemException(e.getMessage());
		}

	}
	
	protected boolean checkUniqueCodeDuplicacy(T entity) throws Exception {
		boolean isExist = false;
		try {
			T existingEntity = repository.findByUniqueCode(((BaseEntity)entity).getUniqueCode());
			if (existingEntity != null) {
				isExist = true;
			}
		} catch (Exception e) {
			throw e;
		}
		return isExist;
	}
} 
