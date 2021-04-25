package com.AdanLara.Code.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class MainController {
	
	private Boolean correctPassword(String guess) {
		return guess.equals("bushido");
	}
	
	private String[] getTenets() {
		return new String[] {
			"Loyalty", "Courage", "Veracity", "Compassion", "Honor"
		};
	}

	@RequestMapping("/")
	public String page() {
		return "index.jsp";
	}
	
	@RequestMapping( value="/attempt", method=RequestMethod.POST)
	public String Attempt(@RequestParam(value="guess") String guess, Model viewModel, RedirectAttributes rAttributes){
		if(correctPassword(guess)){
			return "redirect:/code";
		}
		rAttributes.addFlashAttribute("error", "You need more training");
		return "redirect:/";
		}
	
	@RequestMapping("/code")
	public String Code( Model viewmodel) {
		viewmodel.addAttribute("tenets", getTenets());
		return "code.jsp";
	}
	
}