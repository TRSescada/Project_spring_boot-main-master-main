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

import com.example.project.model.notification;
import com.example.project.service.NotificationSerivceImpl;

public class NotificationController {
	@Autowired
	private NotificationSerivceImpl notifService;

	@GetMapping("/Notification")
	public List<notification> getNotifications (){
		return notifService.getNotification();
	}
	
	 @GetMapping("/Notification/{id}")
	    public notification getSingleNotification (@PathVariable("id_not") long id_notif) {
	    	return notifService.getSingleNotification(id_notif);
	    }
	    
	    
	    @PostMapping("/Notification")
	    public notification saveNotification (@Valid @ModelAttribute("Notification") notification notification) {
	    	return notifService.saveNotification(notification);
	    }
	    
	    @PutMapping("/Notificaton/{id}")
	    public notification updateNotification (@PathVariable long id_not , @RequestBody notification notification) {
	    	//User.setId(id);
	    	return notifService.updateNotification(notification);
	    }
	    
	    @DeleteMapping("/Notification")
	    public void deleteNotification(@RequestParam("id_notif")long id_notif) {
	    	notifService.deleteNotification(id_notif);
	    }	
	

}
