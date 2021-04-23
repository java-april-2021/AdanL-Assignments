package com.AdanLara.Routing.Controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DojoController {
	@RequestMapping("/dojo")
	public String theDojo() {
		return "The dojo is awesome!";
	}
	
	@RequestMapping("/dojo/{city}")
	public String dojoLocation (@PathVariable("city") String city) {
		switch(city) {
		case("Burbank"):
			return "Burbank Dojo is located in Southern California";
		case("San-Jose"):
			return "Burbank Dojo is located in Southern California";
		default:
			return String.format("sorry no dojo at %s", city);
		}
		
	}


}
