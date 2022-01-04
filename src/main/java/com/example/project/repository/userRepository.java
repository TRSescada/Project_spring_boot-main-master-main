package com.example.project.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.example.project.model.user;

@Repository
public interface userRepository extends JpaRepository<user, Long > {

	/*	Optional<user> findBynom(String nom);*/
	 List<user> findBynom(String nom);
	
/*	List<user> findByNameAndTel(String nom, String tel);*/
	
	@Transactional
	@Modifying
	@Query("DELETE FROM user WHERE nom= :name")
	Integer deleteUserByName(String name);
	}
