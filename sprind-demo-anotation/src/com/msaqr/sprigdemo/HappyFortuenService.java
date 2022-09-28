package com.msaqr.sprigdemo;

import org.springframework.stereotype.Component;

@Component()
public class HappyFortuenService implements FortuenService {

	@Override
	public String getFortuene() {
		
		return "Autowiring is work";
	}

}
