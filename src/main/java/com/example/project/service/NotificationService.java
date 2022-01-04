package com.example.project.service;

import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Service;

import com.example.project.model.notification;
@Service
public interface NotificationService {

	List<notification> getNotification();

	notification getSingleNotification(long id_notif);

	notification saveNotification(@Valid notification notification);

	notification updateNotification(notification notification);

	void deleteNotification(long id_notif);
	
}
