package com.karunesh.springdemo;

public class HappyFortuneService implements FortuneService {

	@Override
	public String getForturne() {
		return "Today is your lucky day!";
	}

}
