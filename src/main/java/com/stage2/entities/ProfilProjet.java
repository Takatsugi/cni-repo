package com.stage2.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the PROFIL_PROJET database table.
 * 
 */
@Entity
@Table(name="PROFIL_PROJET")
@NamedQuery(name="ProfilProjet.findAll", query="SELECT p FROM ProfilProjet p")
public class ProfilProjet implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private ProfilProjetPK id;

	@Column(name="ACCES_COMPLET", nullable=false, precision=10)
	private BigDecimal accesComplet;

	@Column(name="ACCES_CONSULT", nullable=false, precision=10)
	private BigDecimal accesConsult;

	@Column(name="COD_APP", nullable=false, length=2)
	private String codApp;

	@Column(name="CODE_ACTIVITE", length=50)
	private String codeActivite;

	@Column(name="REFERENCE_PROJET", nullable=false, length=100)
	private String referenceProjet;

	//bi-directional many-to-one association to Profil
	@ManyToOne
	@JoinColumn(name="ID_PROFIL", nullable=false, insertable=false, updatable=false)
	private Profil profil;

	public ProfilProjet() {
	}

	public ProfilProjetPK getId() {
		return this.id;
	}

	public void setId(ProfilProjetPK id) {
		this.id = id;
	}

	public BigDecimal getAccesComplet() {
		return this.accesComplet;
	}

	public void setAccesComplet(BigDecimal accesComplet) {
		this.accesComplet = accesComplet;
	}

	public BigDecimal getAccesConsult() {
		return this.accesConsult;
	}

	public void setAccesConsult(BigDecimal accesConsult) {
		this.accesConsult = accesConsult;
	}

	public String getCodApp() {
		return this.codApp;
	}

	public void setCodApp(String codApp) {
		this.codApp = codApp;
	}

	public String getCodeActivite() {
		return this.codeActivite;
	}

	public void setCodeActivite(String codeActivite) {
		this.codeActivite = codeActivite;
	}

	public String getReferenceProjet() {
		return this.referenceProjet;
	}

	public void setReferenceProjet(String referenceProjet) {
		this.referenceProjet = referenceProjet;
	}

	public Profil getProfil() {
		return this.profil;
	}

	public void setProfil(Profil profil) {
		this.profil = profil;
	}

}