package com.example.project.repository;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;
import org.springframework.stereotype.Repository;


import com.example.project.model.notification;
@Repository
public interface NotificationRepository extends JpaRepositoryImplementation<notification,Long>{

	List<notification> findAll();


	Optional<notification> findById(long id_notif);


	notification save(@Valid notification notification);


	Object deletebyId(long id_notif);

}
