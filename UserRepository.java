package com.datatrans.mongo.springbootmongodb.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.datatrans.mongo.springbootmongodb.document.Users;

public interface UserRepository extends MongoRepository<Users, Integer> {

	
	
}
