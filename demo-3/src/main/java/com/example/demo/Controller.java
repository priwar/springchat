package com.example.demo;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


// http://localhsot:8080/health 
// http://localhost:8080/api/message - GET 
//http://localhost:8080/api/message/101 - GET
//http://localhost:8080/api/message/102 - GET
//http://localhost:8080/api/message - POST 

@RestController
@RequestMapping("/api")
public class Controller {

	private IUserDAO dao = new UserDAO(); 
	
	@GetMapping("/health")
	public String health() {
		return "Chat Service is UP... "; 
	}
	
	@GetMapping("/users")
	public List<User> getAllUsers() {
		System.out.println(dao.getAllUsers());
		return dao.getAllUsers(); 
	}
	
}

