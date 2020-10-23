package com.deloitte.repository;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import com.deloitte.model.Event;

public interface EventRepository extends MongoRepository<Event, Integer>{

	@Query("{'regDate' : {$lte : ?0, $gt : ?1}}")
	List<Event> findEventBetweenDateRange(LocalDate next7days, LocalDate currentDate);

}
