package com.stage2.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the PROFIL database table.
 * 
 */
@Entity
@Table(name="PROFIL")
@NamedQuery(name="Profil.findAll", query="SELECT p FROM Profil p")
public class Profil implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(unique=true, nullable=false, precision=10)
	private long id;

	@Column(name="COD_APP", nullable=false, length=2)
	private String codApp;

	@Column(name="DES_PROFIL", nullable=false, length=100)
	private String desProfil;

	@Column(name="DES_PROFIL_AR", length=100)
	private String desProfilAr;

	@Column(name="F_CONSULTATION", nullable=false, precision=10)
	private BigDecimal fConsultation;

	@Column(name="FLAG_DELEG", precision=11)
	private BigDecimal flagDeleg;

	@Column(name="FLAG_MSTR", precision=11)
	private BigDecimal flagMstr;

	@Column(name="ID_STRUCTURE", precision=10)
	private BigDecimal idStructure;

	@Column(length=500)
	private String mission;

	@Column(name="MISSION_AR", length=500)
	private String missionAr;

	public Profil() {
	}

	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getCodApp() {
		return this.codApp;
	}

	public void setCodApp(String codApp) {
		this.codApp = codApp;
	}

	public String getDesProfil() {
		return this.desProfil;
	}

	public void setDesProfil(String desProfil) {
		this.desProfil = desProfil;
	}

	public String getDesProfilAr() {
		return this.desProfilAr;
	}

	public void setDesProfilAr(String desProfilAr) {
		this.desProfilAr = desProfilAr;
	}

	public BigDecimal getFConsultation() {
		return this.fConsultation;
	}

	public void setFConsultation(BigDecimal fConsultation) {
		this.fConsultation = fConsultation;
	}

	public BigDecimal getFlagDeleg() {
		return this.flagDeleg;
	}

	public void setFlagDeleg(BigDecimal flagDeleg) {
		this.flagDeleg = flagDeleg;
	}

	public BigDecimal getFlagMstr() {
		return this.flagMstr;
	}

	public void setFlagMstr(BigDecimal flagMstr) {
		this.flagMstr = flagMstr;
	}

	public BigDecimal getIdStructure() {
		return this.idStructure;
	}

	public void setIdStructure(BigDecimal idStructure) {
		this.idStructure = idStructure;
	}

	public String getMission() {
		return this.mission;
	}

	public void setMission(String mission) {
		this.mission = mission;
	}

	public String getMissionAr() {
		return this.missionAr;
	}

	public void setMissionAr(String missionAr) {
		this.missionAr = missionAr;
	}

}