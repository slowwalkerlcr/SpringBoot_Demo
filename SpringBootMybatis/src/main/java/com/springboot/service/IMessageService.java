package com.springboot.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.springboot.lvcr.model.Message;

@Service
public interface IMessageService {
	public List<Message> findMessage();
}
