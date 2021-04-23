package com.AdanLara.Routing.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class mainController {
	
	@RequestMapping("/")
	public String helloT() {
		return "Welcome to my website!";
	}
	@RequestMapping("/coding")
	public String hello() {
		return "Hello Coding Dojo!";
	}
	
	@RequestMapping("/python")
	public String helloP() {
		return "Python/Django was awesome!";
	}
	
	@RequestMapping("/java")
	public String helloJ() {
		return "java/Spring is better!";
	}
}
