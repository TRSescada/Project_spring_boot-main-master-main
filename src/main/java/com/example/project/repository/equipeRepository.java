package com.example.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.project.model.Equipe;


@Repository
public interface equipeRepository extends JpaRepository<Equipe, Long > {

	
}
