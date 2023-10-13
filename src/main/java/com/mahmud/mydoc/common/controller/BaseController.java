package com.mahmud.mydoc.common.controller;

import com.mahmud.mydoc.common.service.IService;
import lombok.Setter;
import org.modelmapper.ModelMapper;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.List;
import java.util.stream.Collectors;

@Setter
public abstract class BaseController<T, E> {
	protected IService<E> service;
	
	private ModelMapper modelMapper;



	public E toEntity(T model){
		Type type = getClass().getGenericSuperclass();
		Type eType = ((ParameterizedType)type).getActualTypeArguments()[1];
		
		return (E) modelMapper.map(model,  eType );
		
	}
	
	public T fromEntity(E entity){
		Type type = getClass().getGenericSuperclass();
		Type tType = ((ParameterizedType)type).getActualTypeArguments()[0];
		
		return (T) modelMapper.map(entity,  tType);
		
	}
	
	public List<T> fromEntities(List<E> entities){
		Type type = getClass().getGenericSuperclass();
		Type tType = ((ParameterizedType)type).getActualTypeArguments()[0];
		
		return (List<T>) entities.stream()
				  .map(entity -> modelMapper.map(entity, tType))
				  .collect(Collectors.toList()); 
		
	}


	
}
