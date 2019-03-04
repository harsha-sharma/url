package com.datatrans.mongo.springbootmongodb.resource;



import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.datatrans.mongo.springbootmongodb.repository.UserRepository;
import com.datatrans.mongo.springbootmongodb.document.*;
@RestController
@RequestMapping(value="/rest/users")
public class UsersResources {
	
	
	private UserRepository userRepository;
	
	
	public UsersResources(UserRepository userRepository) {
		super();
		this.userRepository = userRepository;
	}

	@GetMapping("/all")
	public List<Users> getAll(){
			
		return userRepository.findAll();
		
		
	}

}
