package com.springboot.lvcr;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 
 * @TODO ADD REASON
 * @Date 2017年4月10日 下午5:17:07
 * @author Edison_lv
 * @version
 */
@Configuration  // 配置注解
// 开启指定类的配置
@EnableConfigurationProperties(PersonServiceProperties.class)  
// 当PersonService这个类在类路径中时，且当前容器中没有这个Bean的情况下，开始自动配置
//@ConditionalOnClass(PersonService.class)
// 指定的属性是否有指定的值
//@ConditionalOnProperty(prefix = "person.proterties.set", value = "enabled", matchIfMissing = true)
public class PersonServiceAutoConfiguration {

	@Autowired
	private PersonServiceProperties properties;

	@Bean
	// 当容器中没有指定Bean的情况下，自动配置PersonService类
	@ConditionalOnMissingBean(PersonService.class)
	public PersonService personService() {
		PersonService personService = new PersonService(properties);
		return personService;
	}

}
