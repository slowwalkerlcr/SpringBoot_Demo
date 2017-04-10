package com.springboot.lvcr;

/**
 * 
 * @TODO ADD REASON
 * @Date 2017年4月10日 下午5:16:10
 * @author Edison_lv
 * @version
 */
public class PersonService {
	private PersonServiceProperties properties;

	public PersonService(PersonServiceProperties properties) {
		this.properties = properties;
	}

	public PersonService() {

	}

	public String getPersonName() {
		return properties.getName();
	}

	public int getPersonAge() {
		return properties.getAge();
	}

	public String getPersonSex() {
		return properties.getSex();
	}
}
