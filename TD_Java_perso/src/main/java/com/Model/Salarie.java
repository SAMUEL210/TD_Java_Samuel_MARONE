package com.Model;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Salarie")
public class Salarie {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", nullable = false, unique = true)
	private int id;
	
	@Column(name = "nom", nullable = true, unique = false, length = 50)
	private String nom;
	
	@Column(name = "prenom", nullable = true, unique = false, length = 50)
	private String prenom;
	
	@Column(name = "salaire", nullable = true, unique = false)
	private Double salaire;
	
	@Column(name = "experience", nullable = true, unique = false, length = 11)
	private int experience;
	
//	@OneToOne
//	@JoinColumn(name="compte_id")
//	private Directeur directeur;

	
	public Salarie() {
		super();
	}

	public Salarie(String nom, String prenom, Double salaire, int experience) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.salaire = salaire;
		this.experience = experience;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public Double getSalaire() {
		return salaire;
	}

	public void setSalaire(Double salaire) {
		this.salaire = salaire;
	}

	public int getExperience() {
		return experience;
	}

	public void setExperience(int experience) {
		this.experience = experience;
	}

//	public Directeur getDirecteur() {
//		return directeur;
//	}
//
//	public void setDirecteur(Directeur directeur) {
//		this.directeur = directeur;
//	}
	
	

}
	
	
