package com.AdanLara.relationships.Repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.AdanLara.relationships.Models.License;

@Repository
public interface LicenceRepository extends CrudRepository<License, Long>{

	public List<License> findAll();
	public License findTopByOrderByNumberDesc();
}
