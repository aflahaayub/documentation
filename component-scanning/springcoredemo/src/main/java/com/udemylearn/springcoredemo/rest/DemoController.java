package com.udemylearn.springcoredemo.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import util.Coach;

@RestController
public class DemoController {
	// define a private field for the dependency
	private Coach myCoach;
	
	// create constructor class for dep. injection
	@Autowired // this annotation tells spring to inject a dependency
	public DemoController(Coach theCoach) {
		myCoach = theCoach;
	}
	
	@GetMapping("/dailyworkout")
	public String getDailyWorkout() {
		return myCoach.getDailiyWorkout();
	}
	
}
