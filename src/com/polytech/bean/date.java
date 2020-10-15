package com.polytech.bean;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class date implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int jour;
	private int mois;
	private double annee;
	
	public date() {
		// TODO Auto-generated constructor stub
	}

	public date(int jour, int mois, double annee) {
		super();
		this.jour = jour;
		this.mois = mois;
		this.annee = annee;
	}

	public int getJour() {
		return jour;
	}

	public void setJour(int jour) {
		this.jour = jour;
	}

	public int getMois() {
		return mois;
	}

	public void setMois(int mois) {
		this.mois = mois;
	}

	public double getAnnee() {
		return annee;
	}

	public void setAnnee(double annee) {
		this.annee = annee;
	}

	@Override
	public String toString() {
		return "date [jour=" + jour + ", mois=" + mois + ", annee=" + annee + "]";
	}
	
	
	
	
	
}
