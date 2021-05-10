package com.AdanLara.Dojos.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.AdanLara.Dojos.Service.DojoService;

@RestController

public class ApiController {
	@Autowired
	private DojoService dServ;
	
	@GetMapping("/")
	public String apiTest() {
		return "hello";
	}
}
