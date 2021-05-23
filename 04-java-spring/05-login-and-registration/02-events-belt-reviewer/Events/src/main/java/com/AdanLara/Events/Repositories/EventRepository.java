package com.AdanLara.Events.Repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.AdanLara.Events.Models.Event;

public interface EventRepository extends CrudRepository <Event,Long> {
	
	List<Event> findAll();

	List<Event> findByLocation(String location);
	
	List<Event> findByLocationIsNot(String location);
}
