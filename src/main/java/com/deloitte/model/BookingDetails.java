package com.deloitte.model;

import java.util.Date;

import org.springframework.data.mongodb.core.mapping.Document;


@Document(collection="BookingDetails")
public class BookingDetails {
	
	
	private double eventId;
	
	private String timeId;
	
	private String time;
	
	private Date bookingDate;
	
	private String location;
	
	private String eventName;
	
	private String seatsBooked;

	public double getEventId() {
		return eventId;
	}

	public void setEventId(double eventId) {
		this.eventId = eventId;
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

	public Date getBookingDate() {
		return bookingDate;
	}

	public void setBookingDate(Date bookingDate) {
		this.bookingDate = bookingDate;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getEventName() {
		return eventName;
	}

	public void setEventName(String eventName) {
		this.eventName = eventName;
	}

	public String getSeatsBooked() {
		return seatsBooked;
	}

	public void setSeatsBooked(String seatsBooked) {
		this.seatsBooked = seatsBooked;
	}
	
	
}
