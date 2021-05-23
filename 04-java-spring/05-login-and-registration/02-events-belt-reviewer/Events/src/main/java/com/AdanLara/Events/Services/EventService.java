package com.AdanLara.Events.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.AdanLara.Events.Models.Event;
import com.AdanLara.Events.Models.User;
import com.AdanLara.Events.Repositories.EventRepository;

@Service
public class EventService {
	@Autowired
	private EventRepository eRepo;
	
	//find all events
	public List getAllEvents() {
		return this.eRepo.findAll();
	}
	//find by location
	public List findEventsByLocation(String location) {
		return this.eRepo.findByLocation(location);
	}
	//find by other locations
	public List findEventsByOtherLocations(String location) {
		return this.eRepo.findByLocationIsNot(location);
	}
	
	//create event
	public Event createEvent(Event event) {
		return this.eRepo.save(event);
	}
	//get event
	public Event getEvent(Long id) {
		return this.eRepo.findById(id).orElse(null);
	}
	//add Attendee
	public void addAttendee(User user, Event event) {
		List <User> attendees = event.getAttendees();
		attendees.add(user);
		this.eRepo.save(event);
	}
	//add Attendee
		public void removeAttendee(User user, Event event) {
			List <User> attendees = event.getAttendees();
			attendees.remove(user);
			this.eRepo.save(event);
		}
	//delete event
	public void deleteEvent(Long id) {
		this.eRepo.deleteById(id);
	}
	
	
	
}
