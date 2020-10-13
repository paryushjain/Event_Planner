package com.deloitte.repository;

import java.util.Date;
import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import com.deloitte.model.Event;

public interface EventRepository extends MongoRepository<Event, Integer>{

	@Query("{regDate : {$lt : ?0, $gte : ?1}}")
	List<Event> findEventBetweenDateRange(Date next7days, Date currentDate);
}
