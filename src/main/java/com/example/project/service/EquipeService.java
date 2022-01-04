package com.example.project.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.project.model.Equipe;


@Service
public interface EquipeService {

	List<Equipe> getEquipe();
	
	Equipe saveEquipe(Equipe equipe);
	
	Equipe getSingleEquipe(Long id_eq);
	
    void deleteEquipe(Long id);
	
    Equipe updateEquipe(Equipe equipe);
    
    // List<Equipe> getMemberOfEquipe(Long id_eq);
	
	// List<Equipe> getUserByNameEq(String NameEq);
	
}
