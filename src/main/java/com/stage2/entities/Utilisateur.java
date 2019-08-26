package com.stage2.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the UTILISATEUR database table.
 * 
 */
@Entity
@Table(name="UTILISATEUR")
@NamedQuery(name="Utilisateur.findAll", query="SELECT u FROM Utilisateur u")
public class Utilisateur implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private UtilisateurPK id;

	@Column(name="CODE_OP", length=50)
	private String codeOp;

	@Temporal(TemporalType.DATE)
	@Column(name="DATE_CREATION")
	private Date dateCreation;

	@Temporal(TemporalType.DATE)
	@Column(name="DATE_INIT_PASS")
	private Date dateInitPass;

	@Column(name="F_ACTIF", nullable=false, precision=10)
	private BigDecimal fActif;

	@Column(name="F_ADMIN", nullable=false, precision=10)
	private BigDecimal fAdmin;

	@Column(name="F_ADMIN_CENTRAL", nullable=false, precision=10)
	private BigDecimal fAdminCentral;

	@Column(name="F_ADMIN_MINISTERE", precision=10)
	private BigDecimal fAdminMinistere;

	@Column(name="F_ADMIN_STRUCTURE", precision=10)
	private BigDecimal fAdminStructure;

	@Column(name="F_BIENS", precision=10)
	private BigDecimal fBiens;

	@Column(name="F_CONNECT", precision=10)
	private BigDecimal fConnect;

	@Column(name="F_ELIGIBLE", precision=10)
	private BigDecimal fEligible;

	@Column(name="F_SERVICES", precision=10)
	private BigDecimal fServices;

	@Column(name="F_SUPER_USER", precision=10)
	private BigDecimal fSuperUser;

	@Column(name="F_TRAVAUX", precision=10)
	private BigDecimal fTravaux;

	@Column(name="F_USER", precision=10)
	private BigDecimal fUser;

	@Column(name="F_USER_CONS", precision=10)
	private BigDecimal fUserCons;

	@Column(name="FLAG_PASS")
	private BigDecimal flagPass;

	@Column(name="FLAG_SITE", precision=10)
	private BigDecimal flagSite;

	@Column(name="ID_SITE", precision=10)
	private BigDecimal idSite;

	/*@Column(name="ID_STRUCTURE", precision=10)
	private BigDecimal idStructure;*/
	@OneToMany
	private List<Structure> structures;

	@Column(length=100)
	private String mail;

	@Column(name="N_CIN", length=8)
	private String nCin;

	@Column(name="NOM_PRENOM", length=250)
	private String nomPrenom;

	@Column(name="NOM_PRENOM_AR", length=250)
	private String nomPrenomAr;

	@Column(length=1000)
	private String obs;

	@Column(name="OBS_AR", length=500)
	private String obsAr;

	@Column(nullable=false, length=100)
	private String password;

	@Column(name="PASSWORD_MAIL_SMTP", length=500)
	private String passwordMailSmtp;

	@Column(name="USER_MAIL_SMTP", length=500)
	private String userMailSmtp;

	public Utilisateur() {
	}

	public UtilisateurPK getId() {
		return this.id;
	}

	public void setId(UtilisateurPK id) {
		this.id = id;
	}

	public String getCodeOp() {
		return this.codeOp;
	}

	public void setCodeOp(String codeOp) {
		this.codeOp = codeOp;
	}

	public Date getDateCreation() {
		return this.dateCreation;
	}

	public void setDateCreation(Date dateCreation) {
		this.dateCreation = dateCreation;
	}

	public Date getDateInitPass() {
		return this.dateInitPass;
	}

	public void setDateInitPass(Date dateInitPass) {
		this.dateInitPass = dateInitPass;
	}

	public BigDecimal getFActif() {
		return this.fActif;
	}

	public void setFActif(BigDecimal fActif) {
		this.fActif = fActif;
	}

	public BigDecimal getFAdmin() {
		return this.fAdmin;
	}

	public void setFAdmin(BigDecimal fAdmin) {
		this.fAdmin = fAdmin;
	}

	public BigDecimal getFAdminCentral() {
		return this.fAdminCentral;
	}

	public void setFAdminCentral(BigDecimal fAdminCentral) {
		this.fAdminCentral = fAdminCentral;
	}

	public BigDecimal getFAdminMinistere() {
		return this.fAdminMinistere;
	}

	public void setFAdminMinistere(BigDecimal fAdminMinistere) {
		this.fAdminMinistere = fAdminMinistere;
	}

	public BigDecimal getFAdminStructure() {
		return this.fAdminStructure;
	}

	public void setFAdminStructure(BigDecimal fAdminStructure) {
		this.fAdminStructure = fAdminStructure;
	}

	public BigDecimal getFBiens() {
		return this.fBiens;
	}

	public void setFBiens(BigDecimal fBiens) {
		this.fBiens = fBiens;
	}

	public BigDecimal getFConnect() {
		return this.fConnect;
	}

	public void setFConnect(BigDecimal fConnect) {
		this.fConnect = fConnect;
	}

	public BigDecimal getFEligible() {
		return this.fEligible;
	}

	public void setFEligible(BigDecimal fEligible) {
		this.fEligible = fEligible;
	}

	public BigDecimal getFServices() {
		return this.fServices;
	}

	public void setFServices(BigDecimal fServices) {
		this.fServices = fServices;
	}

	public BigDecimal getFSuperUser() {
		return this.fSuperUser;
	}

	public void setFSuperUser(BigDecimal fSuperUser) {
		this.fSuperUser = fSuperUser;
	}

	public BigDecimal getFTravaux() {
		return this.fTravaux;
	}

	public void setFTravaux(BigDecimal fTravaux) {
		this.fTravaux = fTravaux;
	}

	public BigDecimal getFUser() {
		return this.fUser;
	}

	public void setFUser(BigDecimal fUser) {
		this.fUser = fUser;
	}

	public BigDecimal getFUserCons() {
		return this.fUserCons;
	}

	public void setFUserCons(BigDecimal fUserCons) {
		this.fUserCons = fUserCons;
	}

	public BigDecimal getFlagPass() {
		return this.flagPass;
	}

	public void setFlagPass(BigDecimal flagPass) {
		this.flagPass = flagPass;
	}

	public BigDecimal getFlagSite() {
		return this.flagSite;
	}

	public void setFlagSite(BigDecimal flagSite) {
		this.flagSite = flagSite;
	}

	public BigDecimal getIdSite() {
		return this.idSite;
	}

	public void setIdSite(BigDecimal idSite) {
		this.idSite = idSite;
	}
/*
	public BigDecimal getIdStructure() {
		return this.idStructure;
	}

	public void setIdStructure(BigDecimal idStructure) {
		this.idStructure = idStructure;
	}

 */

	public List<Structure> getStructures() {
		return structures;
	}

	public void setStructures(List<Structure> structures) {
		this.structures = structures;
	}

	public String getMail() {
		return this.mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public String getNCin() {
		return this.nCin;
	}

	public void setNCin(String nCin) {
		this.nCin = nCin;
	}

	public String getNomPrenom() {
		return this.nomPrenom;
	}

	public void setNomPrenom(String nomPrenom) {
		this.nomPrenom = nomPrenom;
	}

	public String getNomPrenomAr() {
		return this.nomPrenomAr;
	}

	public void setNomPrenomAr(String nomPrenomAr) {
		this.nomPrenomAr = nomPrenomAr;
	}

	public String getObs() {
		return this.obs;
	}

	public void setObs(String obs) {
		this.obs = obs;
	}

	public String getObsAr() {
		return this.obsAr;
	}

	public void setObsAr(String obsAr) {
		this.obsAr = obsAr;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getPasswordMailSmtp() {
		return this.passwordMailSmtp;
	}

	public void setPasswordMailSmtp(String passwordMailSmtp) {
		this.passwordMailSmtp = passwordMailSmtp;
	}

	public String getUserMailSmtp() {
		return this.userMailSmtp;
	}

	public void setUserMailSmtp(String userMailSmtp) {
		this.userMailSmtp = userMailSmtp;
	}

}