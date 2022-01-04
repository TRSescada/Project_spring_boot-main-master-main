package com.example.project.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.project.model.user;
@Service
public interface userService {
	
	List<user> getUser();
    
	user saveUser(user User);
	
	user getSingleUser(Long id);
	
	void deleteUser(Long id);
	
	user updateUser(user User);
	
	List<user> getUserBynom(String nom);
	/*List<user> getUserByNameandTel(String nom,String tel);
	*/
}
