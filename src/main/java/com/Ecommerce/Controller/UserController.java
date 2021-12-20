package com.Ecommerce.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Ecommerce.Entity.User;
import com.Ecommerce.Repository.userRepository;

@RestController
public class UserController {

	@Autowired(required = false)
	public User user;
	
	@Autowired(required = false)
	public userRepository userRepo;
	
	@RequestMapping(value="/addUser")
	public User addUser(@RequestBody User user) {
		userRepo.save(user);
		return user;
		
	}
}
