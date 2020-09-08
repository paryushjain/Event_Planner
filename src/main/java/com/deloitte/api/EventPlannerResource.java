package com.deloitte.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.deloitte.model.Event;
import com.deloitte.repository.EventRepository;

@RestController
public class EventPlannerResource {
	
	@Autowired
	private EventRepository eventRepository;
	
	@GetMapping("/getEvents")
	public List<Event> getEvents(){
		return eventRepository.findAll();
	}
	
	@PostMapping("/createEvent")
	public void createEvent(@RequestBody Event event){
		eventRepository.save(event);
	}

}
