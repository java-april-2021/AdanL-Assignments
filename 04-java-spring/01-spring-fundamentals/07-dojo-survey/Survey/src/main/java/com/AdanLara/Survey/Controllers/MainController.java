package com.AdanLara.Survey.Controllers;
import com.AdanLara.Survey.models.survey;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {
	
	@RequestMapping("/")
	public String Survey() {
		return "index.jsp";
	}
	
	
	@PostMapping( value="/submit")
	public String result(@RequestParam(value="name") String name, @RequestParam(value="Location") String location, @RequestParam(value="Language") String language, @RequestParam(value="comment") String comment, Model viewModel) {
		
		viewModel.addAttribute("result", new survey(name,location,language,comment));
			if(language.equals("Java")) {
				return "java.jsp";
			}
			else {
				return "result.jsp";
			}
		
	}

}
