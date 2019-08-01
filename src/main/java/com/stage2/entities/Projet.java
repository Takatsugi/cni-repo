package com.stage2.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the PROJET database table.
 * 
 */
@Entity
@Table(name="PROJET")
@NamedQuery(name="Projet.findAll", query="SELECT p FROM Projet p")
public class Projet implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(unique=true, nullable=false, precision=10)
	private long id;

	@Column(name="intitule", length=100)
	private String intitule;

	public Projet() {
	}

	public Projet(String intitule) {
		this.intitule = intitule;
	}

	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getIntitule() {
		return this.intitule;
	}

	public void setIntitule(String intitule) {
		this.intitule = intitule;
	}

}