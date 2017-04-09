package com.springboot.lvcr;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.springboot.lvcr.properties.GitHubBean;

/**
 * 
 * TODO ADD REASON 
 * @Date  2017年4月9日 下午10:58:02   	 
 * @author Administrator  
 * @version
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = { AppStarter.class })
public class GitHubBeanTest {


	@Autowired
	private GitHubBean gitHubBean;

	@Test
	public void test1() throws Exception {
		
		System.out.println("url:"+gitHubBean.getUrl());
		System.out.println("username:"+gitHubBean.getUsername());
		System.out.println("password:"+gitHubBean.getPassword());

	}
}
