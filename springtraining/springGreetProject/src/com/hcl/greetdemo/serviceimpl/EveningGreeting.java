package com.hcl.greetdemo.serviceimpl;

import com.hcl.greetdemo.service.GreetingService;

public class EveningGreeting implements GreetingService {
	
	public EveningGreeting() {
		System.out.println("------------------EveningGreeting---------------------");
	}

	@Override
	public void greetUser(String userName) {
		System.out.println(userName + " Good Evening");

	}

}
