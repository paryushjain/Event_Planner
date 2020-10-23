package com.deloitte.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.deloitte.model.BookingDetails;

public interface BookingDetailsRepository extends MongoRepository<BookingDetails,String>{

	
}
