package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource("applicationContext.xml")
public class DemoApplication {

	public static void main(String[] args) {
		try {
			SpringApplication.run(DemoApplication.class, args);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
