package com.AdanLara.HelloHuman.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {
	
	@RequestMapping("/")
	public String personalMessege(@RequestParam(value= "name", defaultValue="Human") String firstName, @RequestParam(value ="last") String lastName, Model viewModel) {
		viewModel.addAttribute("name", firstName);
		viewModel.addAttribute("last", lastName);
		return "pindex.jsp";
	
	}

}
