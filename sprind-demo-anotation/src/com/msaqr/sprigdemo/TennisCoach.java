package com.msaqr.sprigdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("tennisBean")
public class TennisCoach implements Coach{
	private FortuenService fortuen;
	
	@Value("${foo.email}")
	String email;
	
	
	///constructor Injection 
//	@Autowired
//	public TennisCoach(FortuenService fortuen) {
//	
//		this.fortuen=fortuen;
//	}
	
	@Override
	public String getDailyWorkout() {
		
		return "the tennis is best sport";
	}

	@Override
	public String getDailyFortune() {
		
		return fortuen.getFortuene();
	}
	
	/// SETTER INJECTION	
//	@Autowired
//	public void setFortuen(FortuenService fortuen) {
//		this.fortuen = fortuen;
//	}
//	
	/// method injection
	@Autowired
	public void doSomeStaff(FortuenService fortuen) {
		this.fortuen = fortuen;
	}

	
	
}
