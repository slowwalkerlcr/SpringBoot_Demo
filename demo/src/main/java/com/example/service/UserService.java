package com.example.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.example.bean.User;
import com.example.mapper.UserMapper;

@Service
public class UserService {

	@Resource
	private UserMapper userMapper;
	
	public User selectByPrimaryKey(Integer id){
		User user = userMapper.selectByPrimaryKey(id);
		return user;
	}
	
	public List<User> selectAll(){
		List<User> lists = userMapper.selectAll();
		return lists;
	}

	public boolean hasUser(User user) {
		User u = userMapper.select(user);
		if (u == null) {
			System.out.println("用户和密码错误！");
			return false;
		}
		return true;
	}
}
