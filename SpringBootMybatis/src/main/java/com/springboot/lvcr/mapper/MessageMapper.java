package com.springboot.lvcr.mapper;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.springboot.lvcr.model.Message;

@Repository
public interface MessageMapper {
	public List<Message> findMessage();
}
