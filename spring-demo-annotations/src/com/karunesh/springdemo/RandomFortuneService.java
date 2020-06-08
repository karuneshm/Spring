package com.karunesh.springdemo;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class RandomFortuneService implements FortuneService {

	private String[] data = {
			"Beware",
			"Dilligence",
			"Jounery"		
	};
	
	private Random myRandom = new Random();
	
	@Override
	public String getFortune() {
		// TODO Auto-generated method stub
		int index = myRandom.nextInt(data.length);
		return data[index];
	}

}
