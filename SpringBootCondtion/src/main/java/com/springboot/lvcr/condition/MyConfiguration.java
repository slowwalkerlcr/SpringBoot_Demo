package com.springboot.lvcr.condition;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
//@ConditionalOnProperty(prefix = "user",value = "enabled",havingValue="true")
public class MyConfiguration {
	
	
	/*@Value("${github.aaa:#{null}}")
	private String githubAaa;*/
	
	
	@Autowired
	@Qualifier("aaGithub")
	private GitHub aagitHub;
	
	@Autowired
	@Qualifier("bbGithub")
	private GitHub bbgitHub;
	
	@Autowired
	@Qualifier("ccGithub")
	private GitHub ccgitHub;
	
	@Bean
	public TestA testA(){
		TestA testA = new TestA();
		return testA;
	}
	
	
//	@ConditionalOnProperty(prefix = "github",value = "aaa" ,matchIfMissing=false)
//	@ConditionalOnProperty(prefix = "user",value = "enabled",havingValue="false")
	@Bean
	public TestB testB(){
		TestB testb = new TestB();
		return testb;
	}
	
	

}
