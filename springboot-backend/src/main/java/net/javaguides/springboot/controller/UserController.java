package net.javaguides.springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import net.javaguides.springboot.model.User;
import net.javaguides.springboot.repository.UserRepository;


//We need to have a class that has all the API:s methods
//This is a way of saying that this class is going to handle requests
//Second annotation is a way of mapping web request (HTTP) to handle methods

@CrossOrigin(origins ="http://localhost:3000")
@RestController
@RequestMapping("api/")
public class UserController {
	//here, I think we are defining all the rest API:s requests. GET, POST, PUSH, PUT, PATCH
	//= CRUD. CREATE, READ, UPDATE, DELETE
	
	//In normal cases we need to create an instance of the userRepository
	//spring IOC container takes care of creating the bean that we needed
	//A bean is a object that is instantiated, assembled and managed by the IOC container
	//the bean that we need is UserRepository. So we need to tell the Spring to (1)[@Component]create a instance of
	//the class, and (2)[@Autowired] take the UserRepository and give it the UserController class
	//The userRepository is the Bean. 
	
	@Autowired
	private UserRepository userRepository;
	
	//GET
	//type to map HTTP GET request.
	//here we developed a easy rest endpoint which is "user" that will return list of users to the client
	@GetMapping("users")
	public List<User> getUsers(){
		return this.userRepository.findAll();
		
	}

}
