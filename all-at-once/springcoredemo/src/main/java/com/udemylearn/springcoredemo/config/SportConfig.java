package com.udemylearn.springcoredemo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.udemylearn.springcoredemo.common.Coach;
import com.udemylearn.springcoredemo.common.SwimCoach;

@Configuration
public class SportConfig {
	
	@Bean("aquatic")
	public Coach swimCoach() {
		return new SwimCoach();
	}
}
