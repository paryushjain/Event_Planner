package com.deloitte.model;

import java.time.LocalDate;
import java.time.LocalTime;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@Document(collection="Event")
public class Event {
	
	private String eventName;
	//private String eventDescription;
	//private String eventLocation;
	//private String eventCity;
	//private String eventType;
	//private LocalTime startTime;
	//private LocalTime endTime;
	//private LocalDate date;
	

}
