package com.example.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

/**
 * 基类
 * @author Qiurz
 *
 * @param <T>
 */
@Repository
public interface BaseMapper<T> {

	int insert(T t);
	
	int update(T t);
	
	T select(T t);
	
	List<T> selectAll();
}
