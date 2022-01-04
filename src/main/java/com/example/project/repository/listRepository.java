package com.example.project.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.example.project.model.list;

public interface listRepository extends JpaRepository<list, Long>
{
	
}
