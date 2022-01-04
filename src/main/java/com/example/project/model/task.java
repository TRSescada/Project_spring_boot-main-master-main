package com.example.project.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

@Entity()
@Table(name="task")
public class task {	
	@JsonIgnore
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private final long id;
	
	@NotNull(message="nom_taskshoud not be null")
	@Column(name="nom_task")
	@JsonProperty("nom_task")
	private final String nom_task;

	
	@ManyToOne
	@JoinColumn(name="list_id")
	private list list;
	
	//Commentaire join
    @OneToMany(mappedBy= "task")
    private List<commentaire> commentaire;
    
	
	public task() {
		this.id = 0;
		this.nom_task = "";
	
	}

	public long getId() {
		return id;
	}

	public String getNom_task() {
		return nom_task;
	}

	
	
	
	
	public task(long id, @NotNull(message = "nom_taskshoud not be null") String nom_task) {
		super();
		this.id = id;
		this.nom_task = nom_task;
	}
	
	
	
}
