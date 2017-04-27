package com.springboot.lvcr.condition;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GithubProperties {
	
	@Bean(name="aaGithub")
	@ConfigurationProperties(prefix ="aa.github")
	public GitHub aaGitHub() {
		return new GitHub();
	}
	
	
	@Bean(name="bbGithub")
	@ConfigurationProperties(prefix ="bb.github")
	public GitHub bbGitHub() {
		return new GitHub();
	}
	
	@Bean(name="ccGithub")
	@ConfigurationProperties(prefix ="cc.github")
	public GitHub ccGitHub() {
		return new GitHub();
	}

	
	
	
}
