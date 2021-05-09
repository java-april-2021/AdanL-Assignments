package com.AdanLara.relationships.Controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.AdanLara.relationships.Models.License;
import com.AdanLara.relationships.Models.Person;
import com.AdanLara.relationships.Service.PersonService;

@Controller
public class MainController {
	@Autowired
	private PersonService pServ;
	
	@GetMapping("/")
	public String main(Model viewModel) {
		List<Person> person= pServ.getAll();
		viewModel.addAttribute("persons", person);
		return "/ShowAll.jsp";
		
	}
	
	
	@GetMapping("/add")
	public String add(@ModelAttribute("person") Person person) {
		return "/Index.jsp";
	}
	
	@PostMapping("/add")
	public String addPerson(@Valid @ModelAttribute("person") Person person, BindingResult result) {
		if(result.hasErrors()) {
			return "/Index.jsp";
		}
		
		this.pServ.savePerson(person);
		return "redirect:/";
	}
	
	@GetMapping("/{id}")
	public String show(@PathVariable("id") Long id, Model viewModel) {

		Person per= pServ.getPerson(id);
		viewModel.addAttribute("person",per);
		return "/Profile.jsp";
	}
	@GetMapping("/license")
	public String license(Model viewModel, @ModelAttribute("license") License license) {
		viewModel.addAttribute("person",this.pServ.getAll());
		return "/license.jsp";
	}
	
	
	@PostMapping("/add/license")
	public String newLicense(@Valid @ModelAttribute("license") License license, BindingResult result) {
		
		if(result.hasErrors()) {
			return"/license.jsp";
		}
		this.pServ.saveLicense(license);
		return "redirect:/license";
	}
}
