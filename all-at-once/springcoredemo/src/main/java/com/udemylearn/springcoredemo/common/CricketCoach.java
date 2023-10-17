package com.udemylearn.springcoredemo.common;

import org.springframework.stereotype.Component;

@Component // mark the class as a spring bean, and make it available for dep. injection
public class CricketCoach implements Coach{
	public CricketCoach() {
		System.out.println("In constructor: " + getClass().getSimpleName());
	}
	@Override
	public String getDailyWorkout() {
		return "Practice fast bowling for 15 minutes! hehe";
	}
	

}
