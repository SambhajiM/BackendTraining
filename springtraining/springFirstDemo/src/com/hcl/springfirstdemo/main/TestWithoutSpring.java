package com.hcl.springfirstdemo.main;

import com.hcl.springfirstdemo.util.Greeting;

public class TestWithoutSpring {
	public static void main(String[] args) {
		Greeting newGreeting = new Greeting();
		newGreeting.greet();
	}
}
