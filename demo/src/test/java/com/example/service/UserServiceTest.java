package com.example.service;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.example.DemoApplicationTests;
import com.example.bean.User;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes=DemoApplicationTests.class)
//@ContextConfiguration(locations="./applicationContext.xml")
public class UserServiceTest {
	
	@Resource
	private UserService userService;

	@Test
	public void testSelectByPrimaryKey() {
		User user = userService.selectByPrimaryKey(1);
		System.out.println(user);
	}

}
