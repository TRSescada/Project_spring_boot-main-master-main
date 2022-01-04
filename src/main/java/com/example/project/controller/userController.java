package com.example.project.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.example.project.model.user;
import com.example.project.service.userService;

@RestController
@RequestMapping()
public class userController {
	 
	@Autowired
	private userService uService;
	
	@RequestMapping(value = "/users", method = RequestMethod.GET)
	public List<user> getUsers (){
		return uService.getUser();
	}
	
    @RequestMapping(value="/user/{id}",method=RequestMethod.GET)
    public user getUser (@PathVariable("id") long id) {
    	return uService.getSingleUser(id);
    }
    
    
    @PostMapping("/user")
    public user saveUser (@Valid @ModelAttribute("user") user User) {
    	return uService.saveUser(User);
    }
    @PutMapping("/user/{id}")
    public user updateUser (@PathVariable long id , @RequestBody user User) {
    	//User.setId(id);
    	return uService.updateUser(User);
    }
    
    @DeleteMapping("/user")
    public void deleteUser (@RequestParam("id")long id) {
    	uService.deleteUser(id);
    	
    }

    @GetMapping("/user/filterByNom")
    public List<user> getUserByNom( @RequestParam String nom){
    	return  uService.getUserBynom(nom);
    }
 

}