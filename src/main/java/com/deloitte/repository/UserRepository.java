package com.deloitte.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.deloitte.model.User;

public interface UserRepository extends MongoRepository<User, String>{

	public User findByUsername(String username);
}
