package com.springboot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.lvcr.mapper.MessageMapper;
import com.springboot.lvcr.model.Message;
@Service
public class MessageService implements IMessageService {

	@Autowired
	private MessageMapper messageMapper;

	@Override
	public List<Message> findMessage() {

		return messageMapper.findMessage();
	}

}
