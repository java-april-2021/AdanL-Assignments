package com.AdanLara.Dojos.Controllers;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.AdanLara.Dojos.Models.Dojo;
import com.AdanLara.Dojos.Models.Ninja;
import com.AdanLara.Dojos.Service.DojoService;
import com.AdanLara.Dojos.Service.NinjaService;

@Controller
public class MainController {
	
	@Autowired
	private NinjaService nServ;
	@Autowired
	private DojoService dServ;
	
	//make a dojo
	@GetMapping("/dojo")
	public String makeDojo( @ModelAttribute("dojo") Dojo dojo) {
		return "/NewDojo.jsp";
	}
	
	@PostMapping("/dojo")
	public String saveDojo(@Valid @ModelAttribute("dojo") Dojo dojo, BindingResult result) {
		if(result.hasErrors()) {
			return "NewDojo.jsp";
		}
		this.dServ.saveDojo(dojo);
		return "redirect:/dojo";
	}
	//add ninja
	@GetMapping("/ninja")
	public String addNinja( @ModelAttribute("ninja") Ninja ninja, Model viewModel) {
		viewModel.addAttribute("dojo",this.dServ.getAllDojos());
		return "/NewNinja.jsp";
	}
	
	@PostMapping("/ninja")
	public String saveNinja(@Valid @ModelAttribute("ninja") Ninja ninja ,BindingResult result ) {
		if (result.hasErrors()) {
			return "/NewNinja.jsp";
		}
		this.nServ.saveNinja(ninja);
		return "redirect:/ninja";
	}
	
	//display roster
	@GetMapping("/dojo/{id}")
	public String dispayDojo(@PathVariable("id") Long id, Model viewModel) {
		
		viewModel.addAttribute("dojos",this.dServ.getDojo(id));
		return "Display.jsp";
	}
}
