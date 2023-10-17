package util;

import org.springframework.stereotype.Component;

@Component // mark the class as a spring bean, and make it available for dep. injection
public class CricketCoach implements Coach{

	@Override
	public String getDailiyWorkout() {
		return "Practice fast bowling for 15 minutes!!!!";
	}
	

}
