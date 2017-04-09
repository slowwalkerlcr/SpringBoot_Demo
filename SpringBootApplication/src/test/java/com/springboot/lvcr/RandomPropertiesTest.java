package com.springboot.lvcr;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.springboot.lvcr.properties.RandomProperties;

/**
 * 
 * TODO 随机数演示
 * @Date  2017年4月9日 下午11:09:33   	 
 * @author Administrator  
 * @version
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = { AppStarter.class })
public class RandomPropertiesTest {

	@Autowired
	private RandomProperties randomProperties;

	@Test
	public void test1() throws Exception {
		System.out.println("随机字符串 : " + randomProperties.getSecret());
		System.out.println("随机int : " + randomProperties.getNumber());
		System.out.println("随机long : " + randomProperties.getBignumber());
		System.out.println("随机uuid" + randomProperties.getUuid());
		System.out.println("随机10以下 : "
				+ randomProperties.getNumberLessThanTen());
		System.out.println("随机10-20 : " + randomProperties.getNumberInRange());

	}
}
