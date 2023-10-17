package com.udemylearn.springcoredemo.common;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
//@Primary
public class TennisCoach implements Coach {
	public TennisCoach() {
		System.out.println("In constructor: " + getClass().getSimpleName());
	}
	@Override
	public String getDailyWorkout() {
		return "Practice tennis for 1 smash per 2 menit!";
	}
}
