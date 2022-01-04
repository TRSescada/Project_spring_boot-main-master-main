package com.example.project.service;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.project.model.*;


@Service
public interface taskService {
	List<task> getNom_task();
 
     Long  getTaskId( Long id );
     
     void deletetask(Long id);
     
     task updatetask(task task);
     
     List<task> gettaskBynom(String nom);
}
