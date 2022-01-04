package com.example.project.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;



import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;


@Entity()
@Table(name="user")
public class user {
	
	@JsonIgnore
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private final long id;
	
	@NotNull(message="nom should not be null")
	@Column(name="nom")
	@JsonProperty("full_name")
	private final String nom;
	
	@NotNull(message="prenom should not be null")
	@Column(name="prenom")
	private final String prenom;
	
	@NotNull(message="tel should not be null")
	@Column(name="tel")
	private final String tel;
	
	@NotNull(message="Mail should not be null")
	@Column(name="mail")
	private final String mail;
	
    //Equipe join
    @ManyToMany(fetch = FetchType.LAZY,
            cascade = {
                CascadeType.PERSIST,
                CascadeType.MERGE
            })
    @JoinTable(name = "User_Equipe",
            joinColumns = { @JoinColumn(name = "id")},
            inverseJoinColumns = { @JoinColumn(name = "id_eq") })
    private List<Equipe> Equipes;
    
    //list join
    @OneToMany(mappedBy= "user")
    private List<list> lists;
    
    
  //commentaire join
    @OneToMany(mappedBy= "user_comm")
    private List<commentaire> commentaires;
    
    
	
	public user(long id, String nom, String prenom, String tel, String mail) {
		
		this.id = id;
		this.nom = nom;
		this.prenom = prenom;
		this.tel = tel;
		this.mail = mail;
	}

	public long getId() {
		return id;
	}

	public user() {
		this.id = 0;
		this.nom = "";
		this.prenom = "";
		this.tel = "";
		this.mail = "";
		
	}

	public String getNom() {
		return nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public String getTel() {
		return tel;
	}

	public String getMail() {
		return mail;
	}
	

}
