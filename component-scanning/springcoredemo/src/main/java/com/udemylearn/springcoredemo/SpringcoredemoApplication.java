package com.udemylearn.springcoredemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// explicitly list base packages to scan
@SpringBootApplication(scanBasePackages = { "com.udemylearn.springcoredemo", "util" }) // names of packages we would used

public class SpringcoredemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringcoredemoApplication.class, args);
	}

}
