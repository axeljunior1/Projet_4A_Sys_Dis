package com.polytech.bean;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlRootElement;

@SuppressWarnings("serial")
@XmlRootElement
public class Personne implements Serializable{
	
	private String nom;
	private String prenom;
	private Double age;
	private date dateNaiss; 
	
	
	public Personne() {
		// TODO Auto-generated constructor stub
	}
	
	
	
	public Personne(String nom, String prenom, Double age, date dateNaiss) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.age = age;
		this.dateNaiss = dateNaiss;
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

	public Double getAge() {
		return age;
	}

	public void setAge(Double age) {
		this.age = age;
	}
 

	public date getDateNaiss() {
		return dateNaiss;
	}
 
	public void setDateNaiss(date dateNaiss) {
		this.dateNaiss = dateNaiss;
	}



	@Override
	public String toString() {
		return "Personne [nom=" + nom + ", prenom=" + prenom + ", age=" + age + ", dateNaiss=" + dateNaiss + "]";
	}


}
