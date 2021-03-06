package com.springboot.lvcr;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

/**
 * 
 * TODO SpringBoot 启动
 * 
 * @Date 2017年4月9日 下午9:53:50
 * @author Administrator
 * @version
 */
@SpringBootApplication
@ImportResource("applicationContext.xml") //指定需要加载的配置文件
public class AppStarter {

	public static void main(String[] args) {
		SpringApplication.run(AppStarter.class, args);
		
	}
}
