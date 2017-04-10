package com.springboot.lvcr;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 
 * TODO SpringBoot 启动
 * 
 * @Date 2017年4月9日 下午9:53:50
 * @author Administrator
 * @version
 */
@SpringBootApplication
public class AppStarter {

	public static void main(String[] args) {
		SpringApplication.run(AppStarter.class, args);
		
		/*Properties properties = new Properties();
		InputStream in = AppStarter.class.getClassLoader().getResourceAsStream("application.properties");
		try {
			properties.load(in);
		} catch (IOException e) {
			e.printStackTrace();  
			
		}
		SpringApplication app = new SpringApplication(AppStarter.class);
		app.setDefaultProperties(properties);
		app.run(args);*/
		
	}
}
