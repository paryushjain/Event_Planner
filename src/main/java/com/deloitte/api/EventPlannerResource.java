package com.deloitte.api;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.deloitte.model.BookingDetails;
import com.deloitte.model.Event;
import com.deloitte.model.User;
import com.deloitte.repository.BookingDetailsRepository;
import com.deloitte.repository.EventRepository;
import com.deloitte.repository.UserRepository;


@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class EventPlannerResource {

	@Autowired
	private MongoTemplate mongoTemplate;
	
	@Autowired
	private EventRepository eventRepository;
	
	@Autowired
	private UserRepository userRepository;
	
	
	@Autowired
	private BookingDetailsRepository bookingDetailsRepository;
	
	
	@GetMapping("/getEventDetails")
	public List<Event> getEvents(){
		return eventRepository.findAll();
	}
	
	@PostMapping("/createEvent")
	public void createEvent(@RequestBody Event event){
		eventRepository.save(event);
	}
	
	@PostMapping("/saveBookingDetails")
	public void saveBookingDetails(@RequestBody BookingDetails bookingDetails) {
		bookingDetailsRepository.save(bookingDetails);
	}
	
	@GetMapping("/fetchBookingDetails")
	public List<BookingDetails> fetchBookingDetails() {
		return bookingDetailsRepository.findAll();
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
	@GetMapping("/getEventsInAWeek")
	public List<Event> getEventsInAWeek() {
		LocalDate today = LocalDate.now();
		LocalDate week = today.plusDays(70);
		return eventRepository.findEventBetweenDateRange(week,today);
	}
	
	
	/**
	 * this is alternative way to the method getDataBetweenDays().It works
	 */
	/*
	 * @PostMapping("/getDataBetweenDate") public List<Event> getDataBetweenDate() {
	 * LocalDate today = LocalDate.now(); LocalDate week = today.plusDays(70); Query
	 * query = new
	 * Query().addCriteria(Criteria.where("regDate").gte(today).lte(week)); return
	 * mongoTemplate.find(query, Event.class); }
	 */
	
	
	@PostMapping("/getLoginDetails")
	public boolean getLoginDetails(@RequestBody User user) {
		User userDB = userRepository.findByUsername(user.getUsername());
		
		if(user.getUsername().equalsIgnoreCase(userDB.getUsername())&& user.getPassword().equals(userDB.getPassword()))
			return true;
		return false;
	}
	
}
