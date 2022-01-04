package com.example.project.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.project.model.list;

@Service
public interface listService {
	List<list> getNom_list();
	 
    Long  getListId( Long id );
    
    void deletelist(Long id);
    
    list updateListe(list list);
    
    List<list> getlistBynom(String nom);
}
