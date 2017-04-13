package com.springboot.lvcr.properties;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;


@Component
@ConfigurationProperties(prefix="app.github")
public class GitHubBean {
	
	private String url;
	
	private String username;
	
	private String password;
	
	private List<String> project = new ArrayList<String>();

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public List<String> getProject() {
		return project;
	}

	public void setProject(List<String> project) {
		this.project = project;
	}
	
	
	
	
	
	
	
	
	
}
