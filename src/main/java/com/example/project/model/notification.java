package com.example.project.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity()
@Table(name="notification")
public class notification {

	
	@Id()
	@GeneratedValue(strategy=GenerationType.AUTO)
	private final long id;
	
	
	@NotNull(message="contenu shoud not be null")
	@Column(name="contenu")
	private final String contenu;
	
	
	@NotNull(message="contenu shoud not be null")
	@Column(name="date_notf")
	private final Date date_notf;


	public notification() {
		this.id = 0;
		this.contenu = "";
		this.date_notf = null;
		
	}


	public long getId() {
		return id;
	}


	public String getContenu() {
		return contenu;
	}


	public Date getDate_notf() {
		return date_notf;
	}
	
	
	
	
	
}
