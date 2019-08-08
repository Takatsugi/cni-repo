package com.stage2.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the APPEL_OFFRE database table.
 * 
 */
@Entity
@Table(name="APPEL_OFFRE")
@NamedQuery(name="AppelOffre.findAll", query="SELECT a FROM AppelOffre a")
public class AppelOffre implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(unique=true, nullable=false, precision=10)
	private long id;

	@Column(name="AVIS_BF", precision=10)
	private BigDecimal avisBf;

	@Column(name="CODE_ACTIVITE", length=50)
	private String codeActivite;

	@Column(name="CODE_CATEG_FE", length=100)
	private String codeCategFe;

	@Column(name="CODE_COND_FE", length=100)
	private String codeCondFe;

	@Column(name="CODE_FE", length=100)
	private String codeFe;

	@Column(name="CODE_OP", length=50)
	private String codeOp;

	@Column(name="CODE_OP_AG", length=50)
	private String codeOpAg;

	@Temporal(TemporalType.DATE)
	@Column(name="DATE_SAISIE")
	private Date dateSaisie= new Date();

	@Column(nullable=false, length=250)
	private String des;

	@Column(name="DES_AR", length=250)
	private String desAr;

	@Temporal(TemporalType.DATE)
	@Column(name="DT_NOTIF")
	private Date dtNotif;

	@Column(name="ETAT_SUIVI", nullable=false, length=1)
	private String etatSuivi;

	@Column(name="F_ACHAT_GROUP", precision=11)
	private long fAchatGroup=0;

	@Column(name="FLAG_AO", precision=10)
	private long flagAo=-1;

	@Column(name="FLAG_EN_DIFFICULTE", precision=10)
	private BigDecimal flagEnDifficulte;

	@Column(name="FLAG_FORFAIT_QUALITE", length=1)
	private String flagForfaitQualite;

	@Column(name="FLAG_HERITAGE_PPM", precision=10)
	private BigDecimal flagHeritagePpm;

	@Column(name="FLAG_MULTI_LOT", precision=10)
	private long flagMultiLot=0;

	@Column(name="FLAG_PRIORI", precision=10)
	private long flagPriori=1;

	@Column(name="FLAG_RELENCE", precision=10)
	private long flagRelence=-1;

	@Column(name="FLAG_SOUS_LOT", precision=10)
	private BigDecimal flagSousLot;

	@Column(name="FLAG_UNIQ_SEP", precision=10)
	private BigDecimal flagUniqSep;

	@Column(name="ID_MODE_PM", nullable=false, precision=10)
	private BigDecimal idModePm;

	@Column(name="ID_MYSQL", precision=10)
	private BigDecimal idMysql;

	@Column(name="ID_NATURE_AO", precision=10)
	private BigDecimal idNatureAo;

	@Column(name="ID_PPMD", precision=10)
	private BigDecimal idPpmd;

	//@Column(name="ID_PROJET", precision=10)
	//private long idProjet;

	@Column(name="ID_STR_AG", precision=11)
	private long idStrAg=0;

	@Column(name="ID_STRUCTURE", precision=10)
	private long idStructure;

	private BigDecimal idaoanc;

	@Column(name="MNT_AO", precision=38, scale=3)
	private BigDecimal mntAo;

	@Column(name="MNT_AO_FE", precision=38, scale=2)
	private BigDecimal mntAoFe;

	@Column(name="MNT_AO_TRE", precision=38, scale=2)
	private BigDecimal mntAoTre;

	@Column(length=500)
	private String obs;

	@Column(name="OBS_AR", length=500)
	private String obsAr;

	@Column(name="REF_AO", nullable=false, length=50)
	private String refAo;

	@Column(name="REF_COMPT_ANALYT", precision=10)
	private BigDecimal refComptAnalyt;

	@Column(name="REF_COMPT_GENERAL", precision=10)
	private BigDecimal refComptGeneral;

	@Column(name="REF_REQUETE", length=50)
	private String refRequete;

	@Column(name="REFERENCE_PROJET", length=50)
	private String referenceProjet;

	@Column(name="SS_PARAG", length=100)
	private String ssParag;

	@Column(name="TAUX_CHANGE", precision=38, scale=2)
	private long tauxChange=1;

	@Column(name="TAUX_FINAN", precision=38, scale=2)
	private long tauxFinan =100;

	@Column(name="TYPE_PRIX", precision=10)
	private BigDecimal typePrix;

	@ManyToOne(optional = false)
	@JoinColumn(name="ID_PROJET", nullable=false)
	private Projet projet;


	//bi-directional many-to-one association to AoLot
	/*@OneToMany(mappedBy="appelOffre")
	private List<AoLot> aoLots;
*/
	//bi-directional one-to-one association to Marche
	/*@OneToOne(mappedBy="appelOffre")
	private Marche marche;
*/
	public AppelOffre() {
	}

	public Projet getProjet() {
		return projet;
	}

	public void setProjet(Projet projet) {
		this.projet = projet;
	}

	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public BigDecimal getAvisBf() {
		return this.avisBf;
	}

	public void setAvisBf(BigDecimal avisBf) {
		this.avisBf = avisBf;
	}

	public String getCodeActivite() {
		return this.codeActivite;
	}

	public void setCodeActivite(String codeActivite) {
		this.codeActivite = codeActivite;
	}

	public String getCodeCategFe() {
		return this.codeCategFe;
	}

	public void setCodeCategFe(String codeCategFe) {
		this.codeCategFe = codeCategFe;
	}

	public String getCodeCondFe() {
		return this.codeCondFe;
	}

	public void setCodeCondFe(String codeCondFe) {
		this.codeCondFe = codeCondFe;
	}

	public String getCodeFe() {
		return this.codeFe;
	}

	public void setCodeFe(String codeFe) {
		this.codeFe = codeFe;
	}

	public String getCodeOp() {
		return this.codeOp;
	}

	public void setCodeOp(String codeOp) {
		this.codeOp = codeOp;
	}

	public String getCodeOpAg() {
		return this.codeOpAg;
	}

	public void setCodeOpAg(String codeOpAg) {
		this.codeOpAg = codeOpAg;
	}

	public Date getDateSaisie() {
		return this.dateSaisie;
	}

	public void setDateSaisie(Date dateSaisie) {
		this.dateSaisie = dateSaisie;
	}

	public String getDes() {
		return this.des;
	}

	public void setDes(String des) {
		this.des = des;
	}

	public String getDesAr() {
		return this.desAr;
	}

	public void setDesAr(String desAr) {
		this.desAr = desAr;
	}

	public Date getDtNotif() {
		return this.dtNotif;
	}

	public void setDtNotif(Date dtNotif) {
		this.dtNotif = dtNotif;
	}

	public String getEtatSuivi() {
		return this.etatSuivi;
	}

	public void setEtatSuivi(String etatSuivi) {
		this.etatSuivi = etatSuivi;
	}

	public long getFAchatGroup() {
		return this.fAchatGroup;
	}

	public void setFAchatGroup(long fAchatGroup) {
		this.fAchatGroup = fAchatGroup;
	}

	public long getFlagAo() {
		return this.flagAo;
	}

	public void setFlagAo(long flagAo) {
		this.flagAo = flagAo;
	}

	public BigDecimal getFlagEnDifficulte() {
		return this.flagEnDifficulte;
	}

	public void setFlagEnDifficulte(BigDecimal flagEnDifficulte) {
		this.flagEnDifficulte = flagEnDifficulte;
	}

	public String getFlagForfaitQualite() {
		return this.flagForfaitQualite;
	}

	public void setFlagForfaitQualite(String flagForfaitQualite) {
		this.flagForfaitQualite = flagForfaitQualite;
	}

	public BigDecimal getFlagHeritagePpm() {
		return this.flagHeritagePpm;
	}

	public void setFlagHeritagePpm(BigDecimal flagHeritagePpm) {
		this.flagHeritagePpm = flagHeritagePpm;
	}

	public long getFlagMultiLot() {
		return this.flagMultiLot;
	}

	public void setFlagMultiLot(long flagMultiLot) {
		this.flagMultiLot = flagMultiLot;
	}

	public long getFlagPriori() {
		return this.flagPriori;
	}

	public void setFlagPriori(long flagPriori) {
		this.flagPriori = flagPriori;
	}

	public long getFlagRelence() {
		return this.flagRelence;
	}

	public void setFlagRelence(long flagRelence) {
		this.flagRelence = flagRelence;
	}

	public BigDecimal getFlagSousLot() {
		return this.flagSousLot;
	}

	public void setFlagSousLot(BigDecimal flagSousLot) {
		this.flagSousLot = flagSousLot;
	}

	public BigDecimal getFlagUniqSep() {
		return this.flagUniqSep;
	}

	public void setFlagUniqSep(BigDecimal flagUniqSep) {
		this.flagUniqSep = flagUniqSep;
	}

	public BigDecimal getIdModePm() {
		return this.idModePm;
	}

	public void setIdModePm(BigDecimal idModePm) {
		this.idModePm = idModePm;
	}

	public BigDecimal getIdMysql() {
		return this.idMysql;
	}

	public void setIdMysql(BigDecimal idMysql) {
		this.idMysql = idMysql;
	}

	public BigDecimal getIdNatureAo() {
		return this.idNatureAo;
	}

	public void setIdNatureAo(BigDecimal idNatureAo) {
		this.idNatureAo = idNatureAo;
	}

	public BigDecimal getIdPpmd() {
		return this.idPpmd;
	}

	public void setIdPpmd(BigDecimal idPpmd) {
		this.idPpmd = idPpmd;
	}

	/*public long getIdProjet() {
		return this.idProjet;
	}

	public void setIdProjet(long idProjet) {
		this.idProjet = idProjet;
	}*/

	public long getIdStrAg() {
		return this.idStrAg;
	}

	public void setIdStrAg(long idStrAg) {
		this.idStrAg = idStrAg;
	}

	public long getIdStructure() {
		return this.idStructure;
	}

	public void setIdStructure(long idStructure) {
		this.idStructure = idStructure;
	}

	public BigDecimal getIdaoanc() {
		return this.idaoanc;
	}

	public void setIdaoanc(BigDecimal idaoanc) {
		this.idaoanc = idaoanc;
	}

	public BigDecimal getMntAo() {
		return this.mntAo;
	}

	public void setMntAo(BigDecimal mntAo) {
		this.mntAo = mntAo;
	}

	public BigDecimal getMntAoFe() {
		return this.mntAoFe;
	}

	public void setMntAoFe(BigDecimal mntAoFe) {
		this.mntAoFe = mntAoFe;
	}

	public BigDecimal getMntAoTre() {
		return this.mntAoTre;
	}

	public void setMntAoTre(BigDecimal mntAoTre) {
		this.mntAoTre = mntAoTre;
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

	public String getRefAo() {
		return this.refAo;
	}

	public void setRefAo(String refAo) {
		this.refAo = refAo;
	}

	public BigDecimal getRefComptAnalyt() {
		return this.refComptAnalyt;
	}

	public void setRefComptAnalyt(BigDecimal refComptAnalyt) {
		this.refComptAnalyt = refComptAnalyt;
	}

	public BigDecimal getRefComptGeneral() {
		return this.refComptGeneral;
	}

	public void setRefComptGeneral(BigDecimal refComptGeneral) {
		this.refComptGeneral = refComptGeneral;
	}

	public String getRefRequete() {
		return this.refRequete;
	}

	public void setRefRequete(String refRequete) {
		this.refRequete = refRequete;
	}

	public String getReferenceProjet() {
		return this.referenceProjet;
	}

	public void setReferenceProjet(String referenceProjet) {
		this.referenceProjet = referenceProjet;
	}

	public String getSsParag() {
		return this.ssParag;
	}

	public void setSsParag(String ssParag) {
		this.ssParag = ssParag;
	}

	public long getTauxChange() {
		return this.tauxChange;
	}

	public void setTauxChange(long tauxChange) {
		this.tauxChange = tauxChange;
	}

	public long getTauxFinan() {
		return this.tauxFinan;
	}

	public void setTauxFinan(long tauxFinan) {
		this.tauxFinan = tauxFinan;
	}

	public BigDecimal getTypePrix() {
		return this.typePrix;
	}

	public void setTypePrix(BigDecimal typePrix) {
		this.typePrix = typePrix;
	}

/*	public List<AoLot> getAoLots() {
		return this.aoLots;
	}

	public void setAoLots(List<AoLot> aoLots) {
		this.aoLots = aoLots;
	}

	public AoLot addAoLot(AoLot aoLot) {
		getAoLots().add(aoLot);
		aoLot.setAppelOffre(this);

		return aoLot;
	}

	public AoLot removeAoLot(AoLot aoLot) {
		getAoLots().remove(aoLot);
		aoLot.setAppelOffre(null);

		return aoLot;
	}
*/
	/*public Marche getMarche() {
		return this.marche;
	}

	public void setMarche(Marche marche) {
		this.marche = marche;
	}
*/
}