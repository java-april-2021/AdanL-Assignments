package com.AdanLara.relationships.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.AdanLara.relationships.Models.License;
import com.AdanLara.relationships.Models.Person;
import com.AdanLara.relationships.Repository.LicenceRepository;
import com.AdanLara.relationships.Repository.PersonRepository;

@Service

public class PersonService {
	@Autowired
	private PersonRepository pRepo;
	
	@Autowired
	private LicenceRepository lRepo;
	
	//get all 
	public List<Person> getAll() {
		return this.pRepo.findAll();
	}
	
	//Create and update
	public Person savePerson(Person person) {
		return this.pRepo.save(person);
	}
	
	//get one
	public Person getPerson(Long id) {
		return this.pRepo.findById (id).orElse(null);
	}
	
	// delete
	
	public void deletePerson(Long id) {
		this.pRepo.deleteById(id);
	}
	//make license
	public License saveLicense(License l) {
		l.setNumber(this.generateLicenseNumber());
		return this.lRepo.save(l);
	}
	
	public int generateLicenseNumber() {
		License l = lRepo.findTopByOrderByNumberDesc();
		if(l == null)
			return 1;
		int largestNumber = l.getNumber();
		largestNumber++;
		return (largestNumber);
	}
	
}
