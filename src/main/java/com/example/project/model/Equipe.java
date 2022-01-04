package com.example.project.model;



import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;


@Entity()
@Table(name="Equipe")
public class Equipe {
	
	
	@Id()
	@Column(name="id_eq")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private final long id_eq;
	
	
	@NotNull(message="NameEq shoud not be null")
	@Column(name="NameEq")
	private final String NameEq;

	   @ManyToMany(fetch = FetchType.LAZY,
	            cascade = {
	                CascadeType.PERSIST,
	                CascadeType.MERGE
	            },
	            mappedBy = "Equipes")
    private Set<user> users = new HashSet<>();
    
	public Equipe() {
		this.id_eq = 0;
		this.NameEq = "";
	}
	
	
	public Equipe(long id, @NotNull(message = "NameEq shoud not be null") String nameEq) {
		super();
		this.id_eq = id;
		NameEq = nameEq;
	}


	
	public long getId() {
		return  id_eq;
	}


	public String getNameEq() {
		return NameEq;
	}


	
	
	

}
