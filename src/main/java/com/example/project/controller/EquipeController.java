package com.example.project.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.project.model.Equipe;
import com.example.project.service.EquipeService;


@RestController
@Component
@RequestMapping()
public class EquipeController {

	@Autowired
	private EquipeService eService;
	
	@GetMapping("/equipe")
	public List<Equipe> getUsers (){
		return eService.getEquipe();
	}
	
	 @GetMapping("/equipe/{id}")
	    public Equipe getSingleEquipe (@PathVariable("id_eq") long id_eq) {
	    	return eService.getSingleEquipe(id_eq);
	    }
	    
	    
	    @PostMapping("/equipe")
	    public Equipe saveUser (@Valid @ModelAttribute("Equipe") Equipe equipe) {
	    	return eService.saveEquipe(equipe);
	    }
	    
	    @PutMapping("/equipe/{id}")
	    public Equipe updateEquipe (@PathVariable long id_eq , @RequestBody Equipe equipe) {
	    	//User.setId(id);
	    	return eService.updateEquipe(equipe);
	    }
	    
	    @DeleteMapping("/equipe")
	    public void deleteEquipe(@RequestParam("id_eq")long id_eq) {
	    	eService.deleteEquipe(id_eq);
	    	
	    }
		
}
