package com.example.project.service;

import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Service;

import com.example.project.model.Equipe;
import com.example.project.model.commentaire;
@Service
public interface CommentaireService {
	List<commentaire> getcommentaire(); 
    Long  getCommentaireId( Long id );
    
    void deleteCommentaire(Long id);
    
    commentaire updatecommentaire(commentaire commentaire);
    
    List<commentaire> getcommentaireBynom(String nom);
	Equipe getSinglecommentaire(long id_eq);
	Equipe saveCommentaire(@Valid commentaire commentaire);

	
}
