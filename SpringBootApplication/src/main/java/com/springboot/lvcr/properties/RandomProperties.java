package com.springboot.lvcr.properties;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class RandomProperties {

	@Value("${my.secret}")
	private String secret;
	@Value("${my.number}")
	private Integer number;
	@Value("${my.bignumber}")
	private long bignumber;
	
	@Value("${my.uuid}")
	private String uuid;
	
	@Value("${my.number.less.than.ten}")
	private Integer numberLessThanTen;

	@Value("${my.number.in.range}")
	private Integer numberInRange;

	public String getSecret() {
		return secret;
	}

	public void setSecret(String secret) {
		this.secret = secret;
	}

	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	public long getBignumber() {
		return bignumber;
	}

	public void setBignumber(long bignumber) {
		this.bignumber = bignumber;
	}

	public Integer getNumberLessThanTen() {
		return numberLessThanTen;
	}

	public void setNumberLessThanTen(Integer numberLessThanTen) {
		this.numberLessThanTen = numberLessThanTen;
	}

	public Integer getNumberInRange() {
		return numberInRange;
	}

	public void setNumberInRange(Integer numberInRange) {
		this.numberInRange = numberInRange;
	}

	public String getUuid() {
		return uuid;
	}

	public void setUuid(String uuid) {
		this.uuid = uuid;
	}
	
	
	

}
