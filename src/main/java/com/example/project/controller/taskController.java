package com.example.project.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.project.service.taskService;


@RestController
@RequestMapping()
@Controller
public class taskController {
	
	
	private taskService tService;

	public taskService gettService() {
		return tService;
	}

	public void settService(taskService tService) {
		this.tService = tService;
	}




}
