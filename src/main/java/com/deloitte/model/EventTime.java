package com.deloitte.model;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="EventTime")
public class EventTime {

	private double eventId;
	
	private String timeId;
	
	private String time;
	
	private int availableSeats;

	public double getEventid() {
		return eventId;
	}

	public void setEventid(double eventid) {
		this.eventId = eventid;
	}

	public String getTimeId() {
		return timeId;
	}

	public void setTimeId(String timeId) {
		this.timeId = timeId;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public int getAvailableSeats() {
		return availableSeats;
	}

	public void setAvailableSeats(int availableSeats) {
		this.availableSeats = availableSeats;
	}
	
	
	
	
}
