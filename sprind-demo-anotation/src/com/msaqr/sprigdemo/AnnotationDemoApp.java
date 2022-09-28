package com.msaqr.sprigdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemoApp {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext c = new ClassPathXmlApplicationContext("applicationContext.xml");
		Coach coach = c.getBean("tennisBean", TennisCoach.class);
		
		System.out.println(coach.getDailyWorkout());
		System.out.println(coach.getDailyFortune());
		
		c.close();
	}

}
