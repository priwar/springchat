package com.example.demo;

import java.util.List;

public interface IUserDAO {
	
	public boolean registerUser(User user);
	
	public boolean loginUser(String email,String password);
	
	public boolean getUser(String userId);
	
	public boolean changePassword(String email,String password);
	
	public boolean deleteUser(String email,String password);
	
	public List<User> getAllUsers();
	

}