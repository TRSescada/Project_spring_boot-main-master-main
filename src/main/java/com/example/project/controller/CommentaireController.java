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
import com.example.project.model.commentaire;
import com.example.project.service.CommentaireService;

public class CommentaireController {
	@Autowired
	private CommentaireService commentaireservice;

	@GetMapping("/commentaire")
	public List<commentaire> getCommentiares (){
		return commentaireservice.getcommentaire();
	}
	
	 @GetMapping("/commentaire/{id}")
	    public Equipe getSinglecommentaire (@PathVariable("id_com") long id_eq) {
	    	return commentaireservice.getSinglecommentaire(id_eq);
	    }
	    
	    
	    @PostMapping("/commentaire")
	    public Equipe saveUser (@Valid @ModelAttribute("commentaire") commentaire commentaire) {
	    	return commentaireservice.saveCommentaire(commentaire);
	    }
	    
	    @PutMapping("/commentaire/{id}")
	    public commentaire updateCommentaire (@PathVariable long id_com , @RequestBody commentaire commentaire) {
	    	//User.setId(id);
	    	return commentaireservice.updatecommentaire(commentaire);
	    }
	    
	    @DeleteMapping("/commentaire")
	    public void deleteCommentaire(@RequestParam("id_com")long id_com) {
	    	commentaireservice.deleteCommentaire(id_com);
	    }
}
