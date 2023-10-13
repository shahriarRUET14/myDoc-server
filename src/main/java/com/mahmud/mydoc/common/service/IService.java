package com.mahmud.mydoc.common.service;

import com.mahmud.mydoc.common.exception.AlreadyExistsDataException;
import com.mahmud.mydoc.common.exception.NoEntityFoundException;
import com.mahmud.mydoc.common.exception.SystemException;
import com.mahmud.mydoc.common.exception.UniqueCodeRequiredException;
import com.mahmud.mydoc.exception.PathNotFoundException;

import java.util.List;


public interface IService<T> {
	public List<T> get()throws NoEntityFoundException, PathNotFoundException,SystemException;
	public T get(Long componentId)throws NoEntityFoundException,SystemException;
	public T save(T entity) throws AlreadyExistsDataException, UniqueCodeRequiredException,SystemException ;
	public T modify(Long id, T entity)throws NoEntityFoundException, SystemException, UniqueCodeRequiredException, AlreadyExistsDataException;
	public void delete(Long id)throws NoEntityFoundException, SystemException;
	public T get(String uniqueCode) throws NoEntityFoundException, SystemException;
	public List<T> findPaginated(int pageNo, int pageSize);
}
