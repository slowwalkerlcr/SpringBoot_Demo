package com.springboot.lvcr.bean;

import java.io.Serializable;

public class User implements Serializable{
	
	/**  
	 * serialVersionUID:TODO(用一句话描述这个变量表示什么).  
	 */
	private static final long serialVersionUID = 4589915669531167383L;
	private String username;
	private Integer age;
	
	
	
	
	public User() {
		super();
	}
	public User(String username, Integer age) {
		super();
		this.username = username;
		this.age = age;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	
	
}
