package com.AdanLara.relationships.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.AdanLara.relationships.Models.Person;
import com.AdanLara.relationships.Service.PersonService;


@RestController
@RequestMapping("/api")
public class ApiController {
	@Autowired
	private PersonService pServ;

	//get all
	@GetMapping("")
	public List<Person> main() {
		return this.pServ.getAll();
	}
	//get one
	@GetMapping("/{id}")
	public Person findPerson(@PathVariable("id") Long id){
		return this.pServ.getPerson(id);
	}
	//update
	@PutMapping("/{id}")
	public Person updatePerson(@PathVariable("id") Long id, Person updatedPerson) {
		return this.pServ.savePerson(updatedPerson);
	}
	//create 
	@PostMapping("/")
	public Person createPeson(Person person) {
		return pServ.savePerson(person);
	}
	@GetMapping("/license")
	public String getLicense() {
		return "/license.jsp";
	}
}
