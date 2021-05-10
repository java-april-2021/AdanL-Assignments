package com.AdanLara.Dojos.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.AdanLara.Dojos.Models.Dojo;
import com.AdanLara.Dojos.Repository.DojoRepository;
import com.AdanLara.Dojos.Repository.NinjaRepository;


@Service
public class DojoService {
	
	@Autowired
	private NinjaRepository nRepo;
	@Autowired
	private DojoRepository dRepo;
	
	//get all Dojos
	public List<Dojo> getAllDojos() {
		return dRepo.findAll();
	}
	//get one Dojo
	public Dojo getDojo(Long id) {
		return this.dRepo.findById(id).orElse(null);
	}
	//delete Dojo
	public void deleteDojo(Long id) {
		this.dRepo.deleteById(id);
	}
	//update and save
	public Dojo saveDojo(Dojo d) {
		return this.dRepo.save(d);
	}
	
}