package com.deloitte.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.deloitte.model.Event;

public interface EventRepository extends MongoRepository<Event, Integer>{

}
