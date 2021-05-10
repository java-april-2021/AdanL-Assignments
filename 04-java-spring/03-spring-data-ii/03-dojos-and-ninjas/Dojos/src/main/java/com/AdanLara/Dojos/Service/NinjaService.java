package com.AdanLara.Dojos.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.AdanLara.Dojos.Models.Ninja;
import com.AdanLara.Dojos.Repository.NinjaRepository;


@Service
public class NinjaService {

		@Autowired
		private NinjaRepository nRepo;
		
			//get all Ninjas
			public List<Ninja> getAllNinja() {
				return nRepo.findAll();
			}
			//get one Ninja
			public Ninja getNinja(Long id) {
				return this.nRepo.findById(id).orElse(null);
			}
			//delete Ninja
			public void deleteNinja(Long id) {
				this.nRepo.deleteById(id);
			}
			//update and save
			public Ninja saveNinja(Ninja n) {
				return this.nRepo.save(n);
			}
	}


