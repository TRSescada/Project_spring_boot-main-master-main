package com.example.project.service;


import java.util.List;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.project.model.user;
import com.example.project.repository.userRepository;

@Service
public class userServiceImpl implements userService {

	
    @Autowired 
	private userRepository uRepository;
	
	
	
	@Override
	public List<user> getUser() {
		
		return uRepository.findAll();
		
	}
	
	@Override
	public user saveUser(user User) {
		
		return uRepository.save(User);
		
	}

	@Override
	public user getSingleUser(Long id) {
		Optional<user> User = uRepository.findById(id);
		if(User.isPresent()) {
			return  User.get();
		}
		 throw new RuntimeException(" user not found for id"+ id);
				
	}

	@Override
	public void deleteUser(Long id) {
		 uRepository.deleteById(id);
		
	}

	@Override
	public user updateUser(user User) {
		
		return uRepository.save(User) ;
	}

	@Override
	public List<user> getUserBynom(String nom) {
		
		return uRepository.findBynom(nom);
	}


}
