package com.example.project.service;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.project.model.notification;
import com.example.project.repository.NotificationRepository;
@Service
public class NotificationSerivceImpl implements NotificationService{
	@Autowired
	private NotificationRepository notifrepo;

	@Override
	public List<notification> getNotification() {
		// TODO Auto-generated method stub
		return notifrepo.findAll();
	}

	@Override
	public notification getSingleNotification(long id_notif) {
		Optional<notification> notif = notifrepo.findById(id_notif);
		if(notif.isPresent()) {
			return  notif.get();
		}
		 throw new RuntimeException(" comment not found for id"+ id_notif);
	}

	@Override
	public notification saveNotification(@Valid notification notification) {
		// TODO Auto-generated method stub
		return notifrepo.save(notification);
	}

	@Override
	public notification updateNotification(notification notification) {
		// TODO Auto-generated method stub
		return notifrepo.save(notification);
	}

	@Override
	public void deleteNotification(long id_notif) {
		// TODO Auto-generated method stub
		notifrepo.deletebyId(id_notif);
	}

	

}
