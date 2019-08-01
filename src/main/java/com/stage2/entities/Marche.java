package com.stage2.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the MARCHE database table.
 * 
 */
@Entity
@Table(name="MARCHE")
@NamedQuery(name="Marche.findAll", query="SELECT m FROM Marche m")
public class Marche implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(unique=true, nullable=false, precision=10)
	private long id;

	@Column(name="ANNEE_CP", precision=10)
	private BigDecimal anneeCp;

	@Column(name="CODE_ACT", length=50)
	private String codeAct;

	@Column(name="CODE_B_FOND", length=20)
	private String codeBFond;

	@Column(name="CODE_CATEG_FE", length=100)
	private String codeCategFe;

	@Column(name="CODE_COND_FE", length=50)
	private String codeCondFe;

	@Column(name="CODE_DEV", length=100)
	private String codeDev;

	@Column(name="CODE_FE", length=100)
	private String codeFe;

	@Column(name="CODE_OP", length=50)
	private String codeOp;

	@Column(name="CODE_OP_AG", length=50)
	private String codeOpAg;

	@Column(name="CODE_UNITE", length=20)
	private String codeUnite;

	@Column(name="CODE_ZONE", length=50)
	private String codeZone;

	@Temporal(TemporalType.DATE)
	@Column(name="DATE_COM")
	private Date dateCom;

	@Temporal(TemporalType.DATE)
	@Column(name="DATE_SAISIE")
	private Date dateSaisie;

	@Column(nullable=false, length=500)
	private String des;

	@Column(name="DES_AR", length=500)
	private String desAr;

	@Temporal(TemporalType.DATE)
	@Column(name="DT_ACT_MT")
	private Date dtActMt;

	@Temporal(TemporalType.DATE)
	@Column(name="DT_APPROB")
	private Date dtApprob;

	@Temporal(TemporalType.DATE)
	@Column(name="DT_FIN_PREV")
	private Date dtFinPrev;

	@Temporal(TemporalType.DATE)
	@Column(name="DT_NOTIF")
	private Date dtNotif;

	@Temporal(TemporalType.DATE)
	@Column(name="DT_ORDRE_SER")
	private Date dtOrdreSer;

	@Temporal(TemporalType.DATE)
	@Column(name="DT_RESIL")
	private Date dtResil;

	@Temporal(TemporalType.DATE)
	@Column(name="DT_SIGN")
	private Date dtSign;

	@Column(precision=10)
	private BigDecimal duree;

	@Column(name="DUREE_ECHEANCE", precision=10)
	private BigDecimal dureeEcheance;

	@Column(name="ETAT_SUIVI", length=1)
	private String etatSuivi;

	@Column(name="F_ACHAT_GROUP", precision=10)
	private BigDecimal fAchatGroup;

	@Column(name="F_DISABLE_MARCHE", precision=10)
	private BigDecimal fDisableMarche;

	@Column(name="FLAG_ALERTE", precision=10)
	private BigDecimal flagAlerte;

	@Column(name="FLAG_DECOUP_H", precision=10)
	private BigDecimal flagDecoupH;

	@Column(name="FLAG_MULTI_DEVISE", precision=10)
	private BigDecimal flagMultiDevise;

	@Column(name="FLAG_MULTI_LOT", precision=10)
	private BigDecimal flagMultiLot;

	@Column(name="FLAG_SOUS_LOT", precision=10)
	private BigDecimal flagSousLot;

	@Column(name="FLAG_SOUTR_MARCHE", precision=10)
	private BigDecimal flagSoutrMarche;

	@Column(name="FLAG_STRUCT_FRS", precision=10)
	private BigDecimal flagStructFrs;

	@Column(name="FLAG_TAUX_REF", precision=10)
	private BigDecimal flagTauxRef;

	@Column(name="FRS_AGENCE", length=250)
	private String frsAgence;

	@Column(name="FRS_BANQUE", length=250)
	private String frsBanque;

	@Column(name="FRS_RIB", length=20)
	private String frsRib;

	@Column(name="ID_ARRETE", precision=10)
	private BigDecimal idArrete;

	@Column(name="ID_FRS", precision=10)
	private BigDecimal idFrs;

	@Column(name="ID_FRS_RIB", precision=10)
	private BigDecimal idFrsRib;

	@Column(name="ID_MARCHE_MYSQL", precision=10)
	private BigDecimal idMarcheMysql;

	@Column(name="ID_PARAG", length=100)
	private String idParag;

	@Column(name="ID_PROJET", precision=10)
	private long idProjet;

	@Column(name="ID_STR_AG", precision=10)
	private BigDecimal idStrAg;

	@Column(name="ID_STRUCTURE", precision=10)
	private long idStructure;

	@Column(name="MT_ML", precision=38, scale=2)
	private BigDecimal mtMl;

	@Column(name="MT_TOTAL", precision=38, scale=8)
	private BigDecimal mtTotal;

	@Column(name="MT_TRESUPP", precision=38, scale=8)
	private BigDecimal mtTresupp;

	@Column(name="MT_TTC", precision=38, scale=4)
	private BigDecimal mtTtc;

	@Column(name="MT_TTC_ACT", precision=38, scale=4)
	private BigDecimal mtTtcAct;

	@Column(name="MT_TTC_CHG", precision=38, scale=2)
	private BigDecimal mtTtcChg;

	@Column(name="MT_TTC_CHG_ACT", precision=38, scale=2)
	private BigDecimal mtTtcChgAct;

	@Column(nullable=false, length=50)
	private String num;

	@Column(length=500)
	private String obs;

	@Column(name="OBS_AR", length=500)
	private String obsAr;

	@Column(precision=38, scale=2)
	private BigDecimal poids;

	@Column(name="REF_ADEB", length=50)
	private String refAdeb;

	@Column(name="REF_SIAD", length=50)
	private String refSiad;

	@Column(name="REFERENCE_PROJET", length=50)
	private String referenceProjet;

	@Column(name="TAUX_AVANC", precision=38, scale=3)
	private BigDecimal tauxAvanc;

	@Column(name="TAUX_AVANC2", precision=38, scale=2)
	private BigDecimal tauxAvanc2;

	@Column(name="TAUX_FINAN", precision=38, scale=2)
	private BigDecimal tauxFinan;

	@Column(name="TAUX_REF", precision=38, scale=8)
	private BigDecimal tauxRef;

	@Column(name="TYPE_PRIX", precision=10)
	private BigDecimal typePrix;

	//bi-directional one-to-one association to AppelOffre
	@OneToOne
	@JoinColumn(name="ID_AO")
	private AppelOffre appelOffre;

	//bi-directional many-to-one association to MarcheLot
	@OneToMany(mappedBy="marche")
	private List<MarcheLot> marcheLots;

	public Marche() {
	}

	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public BigDecimal getAnneeCp() {
		return this.anneeCp;
	}

	public void setAnneeCp(BigDecimal anneeCp) {
		this.anneeCp = anneeCp;
	}

	public String getCodeAct() {
		return this.codeAct;
	}

	public void setCodeAct(String codeAct) {
		this.codeAct = codeAct;
	}

	public String getCodeBFond() {
		return this.codeBFond;
	}

	public void setCodeBFond(String codeBFond) {
		this.codeBFond = codeBFond;
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

	public String getCodeUnite() {
		return this.codeUnite;
	}

	public void setCodeUnite(String codeUnite) {
		this.codeUnite = codeUnite;
	}

	public String getCodeZone() {
		return this.codeZone;
	}

	public void setCodeZone(String codeZone) {
		this.codeZone = codeZone;
	}

	public Date getDateCom() {
		return this.dateCom;
	}

	public void setDateCom(Date dateCom) {
		this.dateCom = dateCom;
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

	public Date getDtActMt() {
		return this.dtActMt;
	}

	public void setDtActMt(Date dtActMt) {
		this.dtActMt = dtActMt;
	}

	public Date getDtApprob() {
		return this.dtApprob;
	}

	public void setDtApprob(Date dtApprob) {
		this.dtApprob = dtApprob;
	}

	public Date getDtFinPrev() {
		return this.dtFinPrev;
	}

	public void setDtFinPrev(Date dtFinPrev) {
		this.dtFinPrev = dtFinPrev;
	}

	public Date getDtNotif() {
		return this.dtNotif;
	}

	public void setDtNotif(Date dtNotif) {
		this.dtNotif = dtNotif;
	}

	public Date getDtOrdreSer() {
		return this.dtOrdreSer;
	}

	public void setDtOrdreSer(Date dtOrdreSer) {
		this.dtOrdreSer = dtOrdreSer;
	}

	public Date getDtResil() {
		return this.dtResil;
	}

	public void setDtResil(Date dtResil) {
		this.dtResil = dtResil;
	}

	public Date getDtSign() {
		return this.dtSign;
	}

	public void setDtSign(Date dtSign) {
		this.dtSign = dtSign;
	}

	public BigDecimal getDuree() {
		return this.duree;
	}

	public void setDuree(BigDecimal duree) {
		this.duree = duree;
	}

	public BigDecimal getDureeEcheance() {
		return this.dureeEcheance;
	}

	public void setDureeEcheance(BigDecimal dureeEcheance) {
		this.dureeEcheance = dureeEcheance;
	}

	public String getEtatSuivi() {
		return this.etatSuivi;
	}

	public void setEtatSuivi(String etatSuivi) {
		this.etatSuivi = etatSuivi;
	}

	public BigDecimal getFAchatGroup() {
		return this.fAchatGroup;
	}

	public void setFAchatGroup(BigDecimal fAchatGroup) {
		this.fAchatGroup = fAchatGroup;
	}

	public BigDecimal getFDisableMarche() {
		return this.fDisableMarche;
	}

	public void setFDisableMarche(BigDecimal fDisableMarche) {
		this.fDisableMarche = fDisableMarche;
	}

	public BigDecimal getFlagAlerte() {
		return this.flagAlerte;
	}

	public void setFlagAlerte(BigDecimal flagAlerte) {
		this.flagAlerte = flagAlerte;
	}

	public BigDecimal getFlagDecoupH() {
		return this.flagDecoupH;
	}

	public void setFlagDecoupH(BigDecimal flagDecoupH) {
		this.flagDecoupH = flagDecoupH;
	}

	public BigDecimal getFlagMultiDevise() {
		return this.flagMultiDevise;
	}

	public void setFlagMultiDevise(BigDecimal flagMultiDevise) {
		this.flagMultiDevise = flagMultiDevise;
	}

	public BigDecimal getFlagMultiLot() {
		return this.flagMultiLot;
	}

	public void setFlagMultiLot(BigDecimal flagMultiLot) {
		this.flagMultiLot = flagMultiLot;
	}

	public BigDecimal getFlagSousLot() {
		return this.flagSousLot;
	}

	public void setFlagSousLot(BigDecimal flagSousLot) {
		this.flagSousLot = flagSousLot;
	}

	public BigDecimal getFlagSoutrMarche() {
		return this.flagSoutrMarche;
	}

	public void setFlagSoutrMarche(BigDecimal flagSoutrMarche) {
		this.flagSoutrMarche = flagSoutrMarche;
	}

	public BigDecimal getFlagStructFrs() {
		return this.flagStructFrs;
	}

	public void setFlagStructFrs(BigDecimal flagStructFrs) {
		this.flagStructFrs = flagStructFrs;
	}

	public BigDecimal getFlagTauxRef() {
		return this.flagTauxRef;
	}

	public void setFlagTauxRef(BigDecimal flagTauxRef) {
		this.flagTauxRef = flagTauxRef;
	}

	public String getFrsAgence() {
		return this.frsAgence;
	}

	public void setFrsAgence(String frsAgence) {
		this.frsAgence = frsAgence;
	}

	public String getFrsBanque() {
		return this.frsBanque;
	}

	public void setFrsBanque(String frsBanque) {
		this.frsBanque = frsBanque;
	}

	public String getFrsRib() {
		return this.frsRib;
	}

	public void setFrsRib(String frsRib) {
		this.frsRib = frsRib;
	}

	public BigDecimal getIdArrete() {
		return this.idArrete;
	}

	public void setIdArrete(BigDecimal idArrete) {
		this.idArrete = idArrete;
	}

	public BigDecimal getIdFrs() {
		return this.idFrs;
	}

	public void setIdFrs(BigDecimal idFrs) {
		this.idFrs = idFrs;
	}

	public BigDecimal getIdFrsRib() {
		return this.idFrsRib;
	}

	public void setIdFrsRib(BigDecimal idFrsRib) {
		this.idFrsRib = idFrsRib;
	}

	public BigDecimal getIdMarcheMysql() {
		return this.idMarcheMysql;
	}

	public void setIdMarcheMysql(BigDecimal idMarcheMysql) {
		this.idMarcheMysql = idMarcheMysql;
	}

	public String getIdParag() {
		return this.idParag;
	}

	public void setIdParag(String idParag) {
		this.idParag = idParag;
	}

	public long getIdProjet() {
		return this.idProjet;
	}

	public void setIdProjet(long idProjet) {
		this.idProjet = idProjet;
	}

	public BigDecimal getIdStrAg() {
		return this.idStrAg;
	}

	public void setIdStrAg(BigDecimal idStrAg) {
		this.idStrAg = idStrAg;
	}

	public long getIdStructure() {
		return this.idStructure;
	}

	public void setIdStructure(long idStructure) {
		this.idStructure = idStructure;
	}

	public BigDecimal getMtMl() {
		return this.mtMl;
	}

	public void setMtMl(BigDecimal mtMl) {
		this.mtMl = mtMl;
	}

	public BigDecimal getMtTotal() {
		return this.mtTotal;
	}

	public void setMtTotal(BigDecimal mtTotal) {
		this.mtTotal = mtTotal;
	}

	public BigDecimal getMtTresupp() {
		return this.mtTresupp;
	}

	public void setMtTresupp(BigDecimal mtTresupp) {
		this.mtTresupp = mtTresupp;
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

	public String getNum() {
		return this.num;
	}

	public void setNum(String num) {
		this.num = num;
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

	public BigDecimal getPoids() {
		return this.poids;
	}

	public void setPoids(BigDecimal poids) {
		this.poids = poids;
	}

	public String getRefAdeb() {
		return this.refAdeb;
	}

	public void setRefAdeb(String refAdeb) {
		this.refAdeb = refAdeb;
	}

	public String getRefSiad() {
		return this.refSiad;
	}

	public void setRefSiad(String refSiad) {
		this.refSiad = refSiad;
	}

	public String getReferenceProjet() {
		return this.referenceProjet;
	}

	public void setReferenceProjet(String referenceProjet) {
		this.referenceProjet = referenceProjet;
	}

	public BigDecimal getTauxAvanc() {
		return this.tauxAvanc;
	}

	public void setTauxAvanc(BigDecimal tauxAvanc) {
		this.tauxAvanc = tauxAvanc;
	}

	public BigDecimal getTauxAvanc2() {
		return this.tauxAvanc2;
	}

	public void setTauxAvanc2(BigDecimal tauxAvanc2) {
		this.tauxAvanc2 = tauxAvanc2;
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

	public AppelOffre getAppelOffre() {
		return this.appelOffre;
	}

	public void setAppelOffre(AppelOffre appelOffre) {
		this.appelOffre = appelOffre;
	}

	public List<MarcheLot> getMarcheLots() {
		return this.marcheLots;
	}

	public void setMarcheLots(List<MarcheLot> marcheLots) {
		this.marcheLots = marcheLots;
	}

	public MarcheLot addMarcheLot(MarcheLot marcheLot) {
		getMarcheLots().add(marcheLot);
		marcheLot.setMarche(this);

		return marcheLot;
	}

	public MarcheLot removeMarcheLot(MarcheLot marcheLot) {
		getMarcheLots().remove(marcheLot);
		marcheLot.setMarche(null);

		return marcheLot;
	}

}