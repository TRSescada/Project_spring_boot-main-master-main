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
@Table(name="list")
public class list {

	
	@JsonIgnore
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private final long id;
	
	@NotNull(message="nom_task should not be null")
	@Column(name="nom_task")
	@JsonProperty("nom_list")
	private final String nom_list;

	
	
	@ManyToOne
	@JoinColumn(name="user_id")
	private user user;
	
	//Task join
    @OneToMany(mappedBy= "list")
    private List<task> tasks;
    
	
	
	
	public list() {
		this.id = 0;
		this.nom_list = "";
		
	}

	public long getId() {
		return id;
	}

	public String getNom_list() {
		return nom_list;
	}
	
	
}
