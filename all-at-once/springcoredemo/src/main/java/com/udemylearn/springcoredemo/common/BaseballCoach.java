package com.udemylearn.springcoredemo.common;

import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

@Component
//@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class BaseballCoach implements Coach {
	
	public BaseballCoach() {
		System.out.println("In constructor: " + getClass().getSimpleName());
	}
	
	// define our init method
//	@PostConstruct 
//	public void doMyStartupStuff() {
//		System.out.println("In doMyStartupStuff() : " +  getClass().getSimpleName());
//	}
//	// define our destroy method
//	@PreDestroy
//	public void doMyCleanupStuff() {
//		System.out.println("In doMyCleanupStuff() : " +  getClass().getSimpleName());
//	}
	
	@Override
	public String getDailyWorkout() {
		return "Practice balling for 5 hour!";
	}
}
