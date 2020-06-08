package com.karunesh.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationBeanScopeDemoApp {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

		Coach theCoach = context.getBean("tennisCoach", Coach.class);
		
		
		Coach alphaCoach = context.getBean("tennisCoach", Coach.class);
		
		
		boolean result = (theCoach == alphaCoach);
		
		System.out.println("Pointing to same object :" +result);
		
		System.out.println(theCoach);
		
		System.out.println(alphaCoach);
		
		context.close();
				

	}

}
