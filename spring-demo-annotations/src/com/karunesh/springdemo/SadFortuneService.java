package com.karunesh.springdemo;

import org.springframework.stereotype.Component;


public class SadFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		return "Today is a sad day";
	}

}
