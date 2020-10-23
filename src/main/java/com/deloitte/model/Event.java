package com.deloitte.model;

import java.util.Date;
import java.util.List;

import org.springframework.data.mongodb.core.mapping.Document;


@Document(collection="Event")
public class Event {
	
	private String eventName;
	private String eventDescription;
	private String eventLocation;
	private String eventCity;
	private String eventType;
	private Date startDate;
	private Date endDate;
	private List<EventTime> listOftimeslots;
	
	
	
	
	public List<EventTime> getListOftimeslots() {
		return listOftimeslots;
	}




	public void setListOftimeslots(List<EventTime> listOftimeslots) {
		this.listOftimeslots = listOftimeslots;
	}




	

	public String getImage() {
		return image;
	}




	public void setImage(String image) {
		this.image = image;
	}




	public Date getStartDate() {
		return startDate;
	}




	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}




	public Date getEndDate() {
		return endDate;
	}




	public void setEndDate(Date endDate) {
		this.endDate = endDate;
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



	public String getQueries() {
		return queries;
	}




	public void setQueries(String queries) {
		this.queries = queries;
	}




	public void setEventName(String eventName) { this.eventName = eventName; }
	 
}
