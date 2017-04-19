package com.springboot.lvcr.condition;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

/**
 * 
 * @TODO ADD REASON
 * @Date 2017年4月19日 下午4:53:06
 * @author Edison_lv
 * @version
 */
@Component
// classpath目录下有TestB，才去装配TestA
@ConditionalOnClass(TestB.class)
// 当容器中存在TestB，才去装配TestA
@ConditionalOnBean(TestB.class)
public class TestA {

	@Autowired
	private TestB testB;

	public TestA() {
		System.out.println("=====================new  TestA");
	}

}
