package com.springboot.lvcr.filter;

import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * springBoot web配置
 * 
 * @Date 2017年3月17日 下午4:48:08
 * @author Edison_lv
 * @version
 */
@Configuration
public class Webconfig {

	

	@Bean
	public FilterRegistrationBean testFilter() {
		FilterRegistrationBean registration = new FilterRegistrationBean();
		registration.setFilter(new TestFilter());
		registration.setAsyncSupported(true);
		registration.addUrlPatterns("*.action");
		return registration;
	}

}
