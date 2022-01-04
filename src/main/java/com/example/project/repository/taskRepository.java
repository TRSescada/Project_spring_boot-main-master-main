package com.example.project.repository;

import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;
import org.springframework.stereotype.Repository;

import com.example.project.model.task;
@Repository
public interface taskRepository extends JpaRepositoryImplementation<task,Long>{
}

