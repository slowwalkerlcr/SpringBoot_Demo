package com.springboot.lvcr;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.springboot.lvcr.listener.MyAppFailedEventListener;
import com.springboot.lvcr.listener.MyAppPreparedEventListener;
import com.springboot.lvcr.listener.MyAppReadyEventListener;
import com.springboot.lvcr.listener.MyAppStartedEventListener;
import com.springboot.lvcr.listener.MyAppStartingEventListener;

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
		// SpringApplication.run(AppStarter.class, args);
		SpringApplication application = new SpringApplication(AppStarter.class);
		application.addListeners(new MyAppStartingEventListener(),
				new MyAppStartedEventListener(),
				new MyAppPreparedEventListener(),
				new MyAppFailedEventListener(),
				new MyAppReadyEventListener());
		application.run(args);
	}
}
