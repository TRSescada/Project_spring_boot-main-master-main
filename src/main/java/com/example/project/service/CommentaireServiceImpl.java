package com.example.project.service;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.project.model.Equipe;
import com.example.project.model.commentaire;
import com.example.project.model.task;
import com.example.project.repository.commentaireRepository;
@Service
public class CommentaireServiceImpl implements CommentaireService{
	@Autowired
	private commentaireRepository commentaireRepo;
	private commentaire commentaire;


	@Override
	public void deleteCommentaire(Long id) {
		// TODO Auto-generated method stub
		commentaireRepo.deleteById(id);
	}

	@Override
	public List<commentaire> getcommentaireBynom(String commentaire) {
		// TODO Auto-generated method stub
		return commentaireRepo.findBynom(commentaire);
	}

	@Override
	public Long getCommentaireId(Long id) {
		// TODO Auto-generated method stub
		return commentaire.getId();
	}

	@Override
	public List<commentaire> getcommentaire() {
		// TODO Auto-generated method stub
		return commentaireRepo.findAll();
	}

	@Override
	public com.example.project.model.commentaire updatecommentaire(com.example.project.model.commentaire commentaire) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Equipe getSinglecommentaire(long id_eq) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Equipe saveCommentaire(com.example.project.model.@Valid commentaire commentaire) {
		// TODO Auto-generated method stub
		return null;
	}

}
