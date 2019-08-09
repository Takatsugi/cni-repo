package com.stage2.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the MARCHE_LOT database table.
 * 
 */
@Entity
@Table(name="MARCHE_LOT")
@NamedQuery(name="MarcheLot.findAll", query="SELECT m FROM MarcheLot m")
public class MarcheLot implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(unique=true, nullable=false, precision=10)
	private long id;

	@Column(name="CODE_CATEG_FE", length=100)
	private String codeCategFe;

	@Column(name="CODE_COND_FE", length=50)
	private String codeCondFe;

	@Column(name="CODE_DEV", length=100)
	private String codeDev;

	@Column(name="CODE_FE", length=100)
	private String codeFe;

	@Column(name="CODE_ZONE", length=50)
	private String codeZone;

	@Temporal(TemporalType.DATE)
	@Column(name="DT_ACT")
	private Date dtAct;

	@Temporal(TemporalType.DATE)
	@Column(name="DT_FIN")
	private Date dtFin;

	@Temporal(TemporalType.DATE)
	@Column(name="DT_FIN_PREV")
	private Date dtFinPrev;

	@Temporal(TemporalType.DATE)
	@Column(name="DT_REC_DEF")
	private Date dtRecDef;

	@Temporal(TemporalType.DATE)
	@Column(name="DT_REC_PROV")
	private Date dtRecProv;

	@Temporal(TemporalType.DATE)
	@Column(name="DT_RESIL")
	private Date dtResil;

	@Column(precision=10)
	private BigDecimal duree;

	@Column(name="FLAG_MULTI_ACTIVITE", precision=10)
	private BigDecimal flagMultiActivite;

	@Column(name="FLAG_MULTI_DEVISE", precision=10)
	private BigDecimal flagMultiDevise;

	@Column(name="FLAG_SOUS_LOT", precision=10)
	private BigDecimal flagSousLot;

	@Column(name="ID_LOT_PERE", precision=10)
	private BigDecimal idLotPere;

	@Column(name="ID_MARCHE_LOT_MYSQL", precision=10)
	private BigDecimal idMarcheLotMysql;

	@Column(name="ID_PROJET", precision=10)
	private BigDecimal idProjet;

	@Column(name="ID_REF_BUDG", length=100)
	private String idRefBudg;

	@Column(name="ID_REF_BUDG_FE", length=250)
	private String idRefBudgFe;

	@Column(name="ID_REF_BUDG_TRE", length=250)
	private String idRefBudgTre;

	@Column(name="MT_FE", precision=38, scale=2)
	private BigDecimal mtFe;

	@Column(name="MT_PRIX", precision=38, scale=2)
	private BigDecimal mtPrix;

	@Column(name="MT_PRIX_ACT", precision=38, scale=2)
	private BigDecimal mtPrixAct;

	@Column(name="MT_TRE", precision=38, scale=2)
	private BigDecimal mtTre;

	@Column(name="MT_TTC", precision=38, scale=4)
	private BigDecimal mtTtc;

	@Column(name="MT_TTC_ACT", precision=38, scale=4)
	private BigDecimal mtTtcAct;

	@Column(name="MT_TTC_CHG", precision=38, scale=4)
	private BigDecimal mtTtcChg;

	@Column(name="MT_TTC_CHG_ACT", precision=38, scale=4)
	private BigDecimal mtTtcChgAct;

	@Column(length=500)
	private String obs;

	@Column(name="OBS_AR", length=500)
	private String obsAr;

	@Column(precision=38, scale=2)
	private BigDecimal qt;

	@Column(name="REF_COMPT_ANALYT", precision=10)
	private BigDecimal refComptAnalyt;

	@Column(name="REF_COMPT_GENERAL", precision=10)
	private BigDecimal refComptGeneral;

	@Column(name="REFERENCE_PROJET", length=50)
	private String referenceProjet;

	@Column(name="TAUX_FE", precision=38, scale=2)
	private BigDecimal tauxFe;

	@Column(name="TAUX_FINAN", precision=38, scale=2)
	private BigDecimal tauxFinan;

	@Column(name="TAUX_REF", precision=38, scale=2)
	private BigDecimal tauxRef;

	@Column(name="TYPE_PRIX", precision=10)
	private BigDecimal typePrix;

	@Column(length=10)
	private String unite;

	@Column(name="ZONE_REFERENCE_PROJET", length=50)
	private String zoneReferenceProjet;

	//bi-directional one-to-one association to AoLot
	@OneToOne
	@JoinColumn(name="ID_AO_LOT", nullable=false)
	private AoLot aoLot;

	//bi-directional many-to-one association to Marche
	@ManyToOne
	@JoinColumn(name="ID_MARCHE", nullable=false)
	private Marche marche;

	@OneToMany()
	private List<FactureMarcheLot> factureMarcheLots;

	public MarcheLot() {
	}

	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
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

	public String getCodeDev() {
		return this.codeDev;
	}

	public void setCodeDev(String codeDev) {
		this.codeDev = codeDev;
	}

	public String getCodeFe() {
		return this.codeFe;
	}

	public void setCodeFe(String codeFe) {
		this.codeFe = codeFe;
	}

	public String getCodeZone() {
		return this.codeZone;
	}

	public void setCodeZone(String codeZone) {
		this.codeZone = codeZone;
	}

	public Date getDtAct() {
		return this.dtAct;
	}

	public void setDtAct(Date dtAct) {
		this.dtAct = dtAct;
	}

	public Date getDtFin() {
		return this.dtFin;
	}

	public void setDtFin(Date dtFin) {
		this.dtFin = dtFin;
	}

	public Date getDtFinPrev() {
		return this.dtFinPrev;
	}

	public void setDtFinPrev(Date dtFinPrev) {
		this.dtFinPrev = dtFinPrev;
	}

	public Date getDtRecDef() {
		return this.dtRecDef;
	}

	public void setDtRecDef(Date dtRecDef) {
		this.dtRecDef = dtRecDef;
	}

	public Date getDtRecProv() {
		return this.dtRecProv;
	}

	public void setDtRecProv(Date dtRecProv) {
		this.dtRecProv = dtRecProv;
	}

	public Date getDtResil() {
		return this.dtResil;
	}

	public void setDtResil(Date dtResil) {
		this.dtResil = dtResil;
	}

	public BigDecimal getDuree() {
		return this.duree;
	}

	public void setDuree(BigDecimal duree) {
		this.duree = duree;
	}

	public BigDecimal getFlagMultiActivite() {
		return this.flagMultiActivite;
	}

	public void setFlagMultiActivite(BigDecimal flagMultiActivite) {
		this.flagMultiActivite = flagMultiActivite;
	}

	public BigDecimal getFlagMultiDevise() {
		return this.flagMultiDevise;
	}

	public void setFlagMultiDevise(BigDecimal flagMultiDevise) {
		this.flagMultiDevise = flagMultiDevise;
	}

	public BigDecimal getFlagSousLot() {
		return this.flagSousLot;
	}

	public void setFlagSousLot(BigDecimal flagSousLot) {
		this.flagSousLot = flagSousLot;
	}

	public BigDecimal getIdLotPere() {
		return this.idLotPere;
	}

	public void setIdLotPere(BigDecimal idLotPere) {
		this.idLotPere = idLotPere;
	}

	public BigDecimal getIdMarcheLotMysql() {
		return this.idMarcheLotMysql;
	}

	public void setIdMarcheLotMysql(BigDecimal idMarcheLotMysql) {
		this.idMarcheLotMysql = idMarcheLotMysql;
	}

	public BigDecimal getIdProjet() {
		return this.idProjet;
	}

	public void setIdProjet(BigDecimal idProjet) {
		this.idProjet = idProjet;
	}

	public String getIdRefBudg() {
		return this.idRefBudg;
	}

	public void setIdRefBudg(String idRefBudg) {
		this.idRefBudg = idRefBudg;
	}

	public String getIdRefBudgFe() {
		return this.idRefBudgFe;
	}

	public void setIdRefBudgFe(String idRefBudgFe) {
		this.idRefBudgFe = idRefBudgFe;
	}

	public String getIdRefBudgTre() {
		return this.idRefBudgTre;
	}

	public void setIdRefBudgTre(String idRefBudgTre) {
		this.idRefBudgTre = idRefBudgTre;
	}

	public BigDecimal getMtFe() {
		return this.mtFe;
	}

	public void setMtFe(BigDecimal mtFe) {
		this.mtFe = mtFe;
	}

	public BigDecimal getMtPrix() {
		return this.mtPrix;
	}

	public void setMtPrix(BigDecimal mtPrix) {
		this.mtPrix = mtPrix;
	}

	public BigDecimal getMtPrixAct() {
		return this.mtPrixAct;
	}

	public void setMtPrixAct(BigDecimal mtPrixAct) {
		this.mtPrixAct = mtPrixAct;
	}

	public BigDecimal getMtTre() {
		return this.mtTre;
	}

	public void setMtTre(BigDecimal mtTre) {
		this.mtTre = mtTre;
	}

	public BigDecimal getMtTtc() {
		return this.mtTtc;
	}

	public void setMtTtc(BigDecimal mtTtc) {
		this.mtTtc = mtTtc;
	}

	public BigDecimal getMtTtcAct() {
		return this.mtTtcAct;
	}

	public void setMtTtcAct(BigDecimal mtTtcAct) {
		this.mtTtcAct = mtTtcAct;
	}

	public BigDecimal getMtTtcChg() {
		return this.mtTtcChg;
	}

	public void setMtTtcChg(BigDecimal mtTtcChg) {
		this.mtTtcChg = mtTtcChg;
	}

	public BigDecimal getMtTtcChgAct() {
		return this.mtTtcChgAct;
	}

	public void setMtTtcChgAct(BigDecimal mtTtcChgAct) {
		this.mtTtcChgAct = mtTtcChgAct;
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

	public BigDecimal getQt() {
		return this.qt;
	}

	public void setQt(BigDecimal qt) {
		this.qt = qt;
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

	public String getReferenceProjet() {
		return this.referenceProjet;
	}

	public void setReferenceProjet(String referenceProjet) {
		this.referenceProjet = referenceProjet;
	}

	public BigDecimal getTauxFe() {
		return this.tauxFe;
	}

	public void setTauxFe(BigDecimal tauxFe) {
		this.tauxFe = tauxFe;
	}

	public BigDecimal getTauxFinan() {
		return this.tauxFinan;
	}

	public void setTauxFinan(BigDecimal tauxFinan) {
		this.tauxFinan = tauxFinan;
	}

	public BigDecimal getTauxRef() {
		return this.tauxRef;
	}

	public void setTauxRef(BigDecimal tauxRef) {
		this.tauxRef = tauxRef;
	}

	public BigDecimal getTypePrix() {
		return this.typePrix;
	}

	public void setTypePrix(BigDecimal typePrix) {
		this.typePrix = typePrix;
	}

	public String getUnite() {
		return this.unite;
	}

	public void setUnite(String unite) {
		this.unite = unite;
	}

	public String getZoneReferenceProjet() {
		return this.zoneReferenceProjet;
	}

	public void setZoneReferenceProjet(String zoneReferenceProjet) {
		this.zoneReferenceProjet = zoneReferenceProjet;
	}

	public AoLot getAoLot() {
		return this.aoLot;
	}

	public void setAoLot(AoLot aoLot) {
		this.aoLot = aoLot;
	}

	public Marche getMarche() {
		return this.marche;
	}

	public void setMarche(Marche marche) {
		this.marche = marche;
	}

}