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
import org.springframework.web.bind.annotation.RequestParam;

import com.example.project.model.Equipe;
import com.example.project.model.list;
import com.example.project.service.EquipeService;
import com.example.project.service.listService;

public class listController {
	@Autowired
	private listService lService;
	private EquipeService eservice;
	
	@GetMapping("/list")
	public List<list> getlist (){
		return lService.getNom_list();
	}
	
	 @GetMapping("/equipe/{id}")
	    public Long getSingleEquipe (@PathVariable("id_eq") long id_eq) {
	    	return lService.getListId(id_eq);
	    }
	    
	    
	    @PostMapping("/equipe")
	    public Equipe saveUser (@Valid @ModelAttribute("Equipe") Equipe equipe) {
	    	return eservice.saveEquipe(equipe);
	    }
	    
	    @PutMapping("/equipe/{id}")
	    public Equipe updateEquipe (@PathVariable long id_eq , @RequestBody Equipe equipe) {
	    	//User.setId(id);
	    	return eservice.updateEquipe(equipe);
	    }
	    
	    @DeleteMapping("/equipe")
	    public void deleteEquipe(@RequestParam("id_eq")long id_eq) {
	    	eservice.deleteEquipe(id_eq);
	    	
	    }
		
}
	