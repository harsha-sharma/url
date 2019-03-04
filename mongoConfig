package com.datatrans.mongo.springbootmongodb.config;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import com.datatrans.mongo.springbootmongodb.document.Users;
import com.datatrans.mongo.springbootmongodb.repository.UserRepository;

@EnableMongoRepositories(basePackageClasses=UserRepository.class)
@Configuration


public class MongodbConfig {
	
	@Bean
	CommandLineRunner commandLineRunner(UserRepository userRepository) {
		return args -> { 
			userRepository.save(new Users(1,"harsh","devops",154000L));
			userRepository.save(new Users(2,"dhawal","aws",254000L));
			userRepository.save(new Users(3,"chirag","azure",154000L));
			userRepository.save(new Users(4,"arpan","tablue",154000L));
			
			
		};
	}
	

}
