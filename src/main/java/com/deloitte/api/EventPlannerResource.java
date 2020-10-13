package com.deloitte.api;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.deloitte.model.Event;
import com.deloitte.model.User;
import com.deloitte.repository.EventRepository;
import com.deloitte.repository.UserRepository;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class EventPlannerResource {

	
	@Autowired
	private EventRepository eventRepository;
	
	@Autowired
	private UserRepository userRepository;
	
	@GetMapping("/getEventDetails")
	public List<Event> getEvents(){
		return eventRepository.findAll();
		
	}
	
	@PostMapping("/createEvent")
	public void createEvent(@RequestBody Event event){
		eventRepository.save(event);
	}
	
	/*
	 * @RequestMapping(value = "/getLoginDetails", method = RequestMethod.GET,
	 * produces = "application/json") public List<Employee> firstPage() { return
	 * employees; }
	 */
	
	/*
	 * @GetMapping("/getLoginDetails/{username}/{password}") public boolean
	 * getLoginDetails(@PathVariable String username, @PathVariable String password)
	 * { System.out.println("the details are "+ username);
	 * if((username.equals("abc"))&&(password.equals("abc"))) return true; return
	 * false; }
	 */

	/*
	 * @PostMapping("/getLoginDetails") public boolean getLoginDetails(@RequestBody
	 * User user) {
	 * if((user.getUsername().equals("abc"))&&(user.getPassword().equals("abc")))
	 * return true; return false; }
	 */
	
	// angular+mongo+springboot
	@PostMapping("/getDataBetweenDays")
	public List<Event> getDataBetweenDays() {
		Date date  = new Date();
		System.out.println(" time is "+ new Date(date.getTime()+20*24*60*60*1000) );
		return eventRepository.findEventBetweenDateRange(new Date(date.getTime()+7*24*60*60*1000), date);
	}
	
	
	@PostMapping("/getLoginDetails")
	public boolean getLoginDetails(@RequestBody User user) {
		User userDB = userRepository.findByUsername(user.getUsername());
		
		if(user.getUsername().equalsIgnoreCase(userDB.getUsername())&& user.getPassword().equals(userDB.getPassword()))
			return true;
		return false;
	}
	
}
