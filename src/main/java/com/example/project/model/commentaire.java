package com.example.project.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity()
@Table(name="commentaire")
public class commentaire {

	
	@Id()
	@GeneratedValue(strategy=GenerationType.AUTO)
	private final long id;
	
	
	@NotNull(message="contenu shoud not be null")
	@Column(name="contenu")
	private final String contenu;


	
	@ManyToOne
	@JoinColumn(name="task_id")
	private task task;
	
	@ManyToOne
	@JoinColumn(name="user_id")
	private user user_comm;
	
	public commentaire() {
		this.id = 0;
		this.contenu = "";
		
	}


	public commentaire(long id, @NotNull(message = "contenu shoud not be null") String contenu) {
		super();
		this.id = id;
		this.contenu = contenu;
	}


	public long getId() {
		return id;
	}


	public String getContenu() {
		return contenu;
	}


	public List<com.example.project.model.task> getCommentaireById() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	
	
	
}
