package com.deloitte.model;

import java.time.LocalDate;
import java.time.LocalTime;

import org.springframework.data.mongodb.core.mapping.Document;


@Document(collection="Event")
public class Event {
	
	private String eventName;
	private String eventDescription;
	private String eventLocation;
	private String eventCity;
	private String eventType;
	private String regDate;
	private int availabeSeats;
	private String eventDate;
	
	
	
	
	
	public String getEventDate() {
		return eventDate;
	}




	public void setEventDate(String eventDate) {
		this.eventDate = eventDate;
	}




	public String getRegDate() {
		return regDate;
	}




	public void setRegDate(String regDate) {
		this.regDate = regDate;
	}




	public int getAvailabeSeats() {
		return availabeSeats;
	}




	public void setAvailabeSeats(int availabeSeats) {
		this.availabeSeats = availabeSeats;
	}




	public String getImage() {
		return image;
	}




	public void setImage(String image) {
		this.image = image;
	}




	//private LocalTime startTime;
	//private LocalTime endTime;
	//private LocalDate date;
	private String queries;
	private double eventId;
	//private SupportExecutive supportExecutive;
	private String image;
	
	

	  public String getEventName() { return eventName; }
	 


	
	  public double getEventId() {
		return eventId;
	}




	public void setEventId(double eventId) {
		this.eventId = eventId;
	}




	public String getEventDescription() {
		return eventDescription;
	}




	public void setEventDescription(String eventDescription) {
		this.eventDescription = eventDescription;
	}




	public String getEventLocation() {
		return eventLocation;
	}




	public void setEventLocation(String eventLocation) {
		this.eventLocation = eventLocation;
	}




	public String getEventCity() {
		return eventCity;
	}




	public void setEventCity(String eventCity) {
		this.eventCity = eventCity;
	}




	public String getEventType() {
		return eventType;
	}




	public void setEventType(String eventType) {
		this.eventType = eventType;
	}



	/*
	 * public LocalTime getStartTime() { return startTime; }
	 * 
	 * 
	 * 
	 * 
	 * public void setStartTime(LocalTime startTime) { this.startTime = startTime; }
	 * 
	 * 
	 * 
	 * 
	 * public LocalTime getEndTime() { return endTime; }
	 * 
	 * 
	 * 
	 * 
	 * public void setEndTime(LocalTime endTime) { this.endTime = endTime; }
	 * 
	 * 
	 * 
	 * 
	 * public LocalDate getDate() { return date; }
	 * 
	 


	public void setDate(LocalDate date) {
		this.date = date;
	}

*/


	public String getQueries() {
		return queries;
	}




	public void setQueries(String queries) {
		this.queries = queries;
	}




	public void setEventName(String eventName) { this.eventName = eventName; }
	 
}
