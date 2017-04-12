package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.test.context.ContextConfiguration;

@SpringBootApplication
@ContextConfiguration(locations="./applicationContext.xml")
public class DemoApplicationTests {

	public static void main(String[] args) {
		try {
			SpringApplication.run(DemoApplicationTests.class, args);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
