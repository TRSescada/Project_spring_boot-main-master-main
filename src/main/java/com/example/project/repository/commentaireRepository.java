package com.example.project.repository;

import java.util.*;

import org.springframework.stereotype.Repository;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

import com.example.project.model.commentaire;
import com.example.project.model.task;
import com.example.project.model.user;

@Repository
public interface commentaireRepository {
	
	List< commentaire> findBynom(String commentaire);
	@Transactional
	@Modifying
	@Query("DELETE FROM commentaire WHERE id= :commentaire")
	Integer deleteUserByName(String commentaire);
	default void abs() {
		
	}

	List<commentaire> findAll();

	user save(user user);

	Optional<user> findById(Long id);

	void deleteById(Long id);
	task save(commentaire commentaire);
}