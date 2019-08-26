package com.stage2.entities;

import org.springframework.beans.factory.annotation.Required;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the FACTURE database table.
 * 
 */
@Entity
@NamedQuery(name="Facture.findAll", query="SELECT f FROM Facture f")
public class Facture implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(unique=true, nullable=false, precision=10)
	private long id;

	@Column(name="CODE_ACTIVITE")
	private String codeActivite;

	@Column(name="CODE_CATEG_FE")
	private String codeCategFe;

	@Column(name="CODE_DEV")
	private String codeDev;

	@Column(name="CODE_FE")
	private String codeFe;

	@Column(name="CODE_OP")
	private String codeOp;

	@Temporal(TemporalType.DATE)
	@Column(name="DATE_SAISIE")
	private Date dateSaisie;

	@Temporal(TemporalType.DATE)
	private Date dt;

	@Temporal(TemporalType.DATE)
	@Column(name="DT_ENV_BCT")
	private Date dtEnvBct;

	@Temporal(TemporalType.DATE)
	@Column(name="DT_ENVOI")
	private Date dtEnvoi;

	@Temporal(TemporalType.DATE)
	@Column(name="DT_ENVOI_BANQUE")
	private Date dtEnvoiBanque;

	@Temporal(TemporalType.DATE)
	@Column(name="DT_ENVOI_CEL_RESP")
	private Date dtEnvoiCelResp;

	@Temporal(TemporalType.DATE)
	@Column(name="DT_ENVOI_DAF")
	private Date dtEnvoiDaf;

	@Temporal(TemporalType.DATE)
	@Column(name="DT_ENVOI_DIRECTION")
	private Date dtEnvoiDirection;

	@Temporal(TemporalType.DATE)
	@Column(name="DT_PAIE_FE")
	private Date dtPaieFe;

	@Temporal(TemporalType.DATE)
	@Column(name="DT_PAIE_TRE")
	private Date dtPaieTre;

	@Temporal(TemporalType.DATE)
	@Column(name="DT_PAIEMENT")
	private Date dtPaiement;

	@Temporal(TemporalType.DATE)
	@Column(name="DT_PRISE_CHARGE")
	private Date dtPriseCharge;

	@Temporal(TemporalType.DATE)
	@Column(name="DT_RECEP_DF")
	private Date dtRecepDf;

	@Temporal(TemporalType.DATE)
	@Column(name="DT_RECEPTION")
	private Date dtReception;

	@Temporal(TemporalType.DATE)
	@Column(name="DT_RETOUR_DAF")
	private Date dtRetourDaf;

	@Temporal(TemporalType.DATE)
	@Column(name="DT_RETOUR_DIRECTION")
	private Date dtRetourDirection;

	@Column(name="FLAG_FACT_DCPTE")
	private BigDecimal flagFactDcpte;

	@Column(name="FLAG_PAYE")
	private BigDecimal flagPaye;

	@Column(name="ID_COMPTE")
	private BigDecimal idCompte;

	@Column(name="ID_DEMANDE_RETRAIT")
	private BigDecimal idDemandeRetrait;

	@Column(name="ID_FRS")
	private BigDecimal idFrs;

	@Column(name="ID_MARCH_ETAPE")
	private BigDecimal idMarchEtape;

	@Column(name="ID_MARCHE_LOT")
	private BigDecimal idMarcheLot;

	@Column(name="ID_MYSQL")
	private BigDecimal idMysql;



	@Column(name="ID_RIB_FRS")
	private BigDecimal idRibFrs;
/*
	@Column(name="ID_STRUCTURE")
	private BigDecimal idStructure;
	²
 */
/*	@OneToOne
	@JoinColumn(name="ID_STRUCTURE",nullable=false)

 */
    @Column(name ="ID_STRUCTURE" )
	private Structure structure;

	@Column(name="MNT_COMPTE")
	private BigDecimal mntCompte;

	@Column(name="MNT_ORDONNANCE")
	private BigDecimal mntOrdonnance;

	@Column(name="MT_AF_ORD")
	private BigDecimal mtAfOrd;

	@Column(name="MT_FE")
	private BigDecimal mtFe;

	@Column(name="MT_FE_ORD")
	private BigDecimal mtFeOrd;

	@Column(name="MT_PAYE_FE")
	private BigDecimal mtPayeFe;

	@Column(name="MT_PAYE_TRE")
	private BigDecimal mtPayeTre;

	@Column(name="MT_PAYE_TRE1")
	private BigDecimal mtPayeTre1;

	@Column(name="MT_PRIX")
	private BigDecimal mtPrix;

	@Column(name="MT_TRE")
	private BigDecimal mtTre;

	@Column(name="MT_TRE_ORD")
	private BigDecimal mtTreOrd;

	@Column(name="MT_TTC")
	private BigDecimal mtTtc;

    @Column(name="NUM")
    private BigDecimal num;

	@Column(name="NUM_ORDRE_FACT")
	private String numOrdreFact;

	@Column(name="NUM_VIR_CHEQ")
	private BigDecimal numVirCheq;

	@Column(name="OBS")
	private String obs;

	@Column(name="OBS_AR")
	private String obsAr;

	@Column(name="\"REF\"")
	private String ref;

	@Column(name="REF_BORDEREAU")
	private String refBordereau;

	@Column(name="REF_COMPT_ANALYT")
	private BigDecimal refComptAnalyt;

	@Column(name="REF_COMPT_GENERAL")
	private BigDecimal refComptGeneral;

	@Column(name="REF_DEMANDE")
	private String refDemande;

	@Column(name="REF_DEMANDE_RS")
	private String refDemandeRs;

	@Column(name="REFERENCE_PROJET")
	private String referenceProjet;

	private BigDecimal taux;

	@Column(name="TAUX_FE")
	private BigDecimal tauxFe;

	@Column(name="TAUX_FINAN")
	private BigDecimal tauxFinan;

	@Column(name="TAUX_PAYE")
	private BigDecimal tauxPaye;

	@Column(name="TAUX_PAYE_FE")
	private BigDecimal tauxPayeFe;

	@Column(name="TAUX_TVA")
	private BigDecimal tauxTva;

	@Column(name="TYPE_PAIE")
	private String typePaie;

	@Column(name="TYPE_PRIX")
	private BigDecimal typePrix;



	@OneToOne
	@JoinColumn(name="ID_marche")
	private Marche marche;

	@Column(name="ID_projet")
    private long idProjet;

	/*@OneToOne
	@JoinColumn(name="ID_projet")
	private Projet projet;

	 */



	public Facture() {
	}

	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
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

	public Date getDateSaisie() {
		return this.dateSaisie;
	}

	public void setDateSaisie(Date dateSaisie) {
		this.dateSaisie = dateSaisie;
	}

	public Date getDt() {
		return this.dt;
	}

	public void setDt(Date dt) {
		this.dt = dt;
	}

	public Date getDtEnvBct() {
		return this.dtEnvBct;
	}

	public void setDtEnvBct(Date dtEnvBct) {
		this.dtEnvBct = dtEnvBct;
	}

	public Date getDtEnvoi() {
		return this.dtEnvoi;
	}

	public void setDtEnvoi(Date dtEnvoi) {
		this.dtEnvoi = dtEnvoi;
	}

	public Date getDtEnvoiBanque() {
		return this.dtEnvoiBanque;
	}

	public void setDtEnvoiBanque(Date dtEnvoiBanque) {
		this.dtEnvoiBanque = dtEnvoiBanque;
	}

	public Date getDtEnvoiCelResp() {
		return this.dtEnvoiCelResp;
	}

	public void setDtEnvoiCelResp(Date dtEnvoiCelResp) {
		this.dtEnvoiCelResp = dtEnvoiCelResp;
	}

	public Date getDtEnvoiDaf() {
		return this.dtEnvoiDaf;
	}

	public void setDtEnvoiDaf(Date dtEnvoiDaf) {
		this.dtEnvoiDaf = dtEnvoiDaf;
	}

	public Date getDtEnvoiDirection() {
		return this.dtEnvoiDirection;
	}

	public void setDtEnvoiDirection(Date dtEnvoiDirection) {
		this.dtEnvoiDirection = dtEnvoiDirection;
	}

	public Date getDtPaieFe() {
		return this.dtPaieFe;
	}

	public void setDtPaieFe(Date dtPaieFe) {
		this.dtPaieFe = dtPaieFe;
	}

	public Date getDtPaieTre() {
		return this.dtPaieTre;
	}

	public void setDtPaieTre(Date dtPaieTre) {
		this.dtPaieTre = dtPaieTre;
	}

	public Date getDtPaiement() {
		return this.dtPaiement;
	}

	public void setDtPaiement(Date dtPaiement) {
		this.dtPaiement = dtPaiement;
	}

	public Date getDtPriseCharge() {
		return this.dtPriseCharge;
	}

	public void setDtPriseCharge(Date dtPriseCharge) {
		this.dtPriseCharge = dtPriseCharge;
	}

	public Date getDtRecepDf() {
		return this.dtRecepDf;
	}

	public void setDtRecepDf(Date dtRecepDf) {
		this.dtRecepDf = dtRecepDf;
	}

	public Date getDtReception() {
		return this.dtReception;
	}

	public void setDtReception(Date dtReception) {
		this.dtReception = dtReception;
	}

	public Date getDtRetourDaf() {
		return this.dtRetourDaf;
	}

	public void setDtRetourDaf(Date dtRetourDaf) {
		this.dtRetourDaf = dtRetourDaf;
	}

	public Date getDtRetourDirection() {
		return this.dtRetourDirection;
	}

	public void setDtRetourDirection(Date dtRetourDirection) {
		this.dtRetourDirection = dtRetourDirection;
	}

	public BigDecimal getFlagFactDcpte() {
		return this.flagFactDcpte;
	}

	public void setFlagFactDcpte(BigDecimal flagFactDcpte) {
		this.flagFactDcpte = flagFactDcpte;
	}

	public BigDecimal getFlagPaye() {
		return this.flagPaye;
	}

	public void setFlagPaye(BigDecimal flagPaye) {
		this.flagPaye = flagPaye;
	}

	public BigDecimal getIdCompte() {
		return this.idCompte;
	}

	public void setIdCompte(BigDecimal idCompte) {
		this.idCompte = idCompte;
	}

	public BigDecimal getIdDemandeRetrait() {
		return this.idDemandeRetrait;
	}

	public void setIdDemandeRetrait(BigDecimal idDemandeRetrait) {
		this.idDemandeRetrait = idDemandeRetrait;
	}

	public BigDecimal getIdFrs() {
		return this.idFrs;
	}

	public void setIdFrs(BigDecimal idFrs) {
		this.idFrs = idFrs;
	}

	public BigDecimal getIdMarchEtape() {
		return this.idMarchEtape;
	}

	public void setIdMarchEtape(BigDecimal idMarchEtape) {
		this.idMarchEtape = idMarchEtape;
	}

	public BigDecimal getIdMarcheLot() {
		return this.idMarcheLot;
	}

	public void setIdMarcheLot(BigDecimal idMarcheLot) {
		this.idMarcheLot = idMarcheLot;
	}

	public BigDecimal getIdMysql() {
		return this.idMysql;
	}

	public void setIdMysql(BigDecimal idMysql) {
		this.idMysql = idMysql;
	}

	public BigDecimal getIdRibFrs() {
		return this.idRibFrs;
	}

	public void setIdRibFrs(BigDecimal idRibFrs) {
		this.idRibFrs = idRibFrs;
	}
/*
	public BigDecimal getIdStructure() {
		return this.idStructure;
	}

	public void setIdStructure(BigDecimal idStructure) {
		this.idStructure = idStructure;
	}

 */

	public Structure getStructure() {
		return structure;
	}

	@Required
	public void setStructure(Structure structure) {
		this.structure = structure;
	}

	public BigDecimal getMntCompte() {
		return this.mntCompte;
	}

	public void setMntCompte(BigDecimal mntCompte) {
		this.mntCompte = mntCompte;
	}

	public BigDecimal getMntOrdonnance() {
		return this.mntOrdonnance;
	}

	public void setMntOrdonnance(BigDecimal mntOrdonnance) {
		this.mntOrdonnance = mntOrdonnance;
	}

	public BigDecimal getMtAfOrd() {
		return this.mtAfOrd;
	}

	public void setMtAfOrd(BigDecimal mtAfOrd) {
		this.mtAfOrd = mtAfOrd;
	}

	public BigDecimal getMtFe() {
		return this.mtFe;
	}

	public void setMtFe(BigDecimal mtFe) {
		this.mtFe = mtFe;
	}

	public BigDecimal getMtFeOrd() {
		return this.mtFeOrd;
	}

	public void setMtFeOrd(BigDecimal mtFeOrd) {
		this.mtFeOrd = mtFeOrd;
	}

	public BigDecimal getMtPayeFe() {
		return this.mtPayeFe;
	}

	public void setMtPayeFe(BigDecimal mtPayeFe) {
		this.mtPayeFe = mtPayeFe;
	}

	public BigDecimal getMtPayeTre() {
		return this.mtPayeTre;
	}

	public void setMtPayeTre(BigDecimal mtPayeTre) {
		this.mtPayeTre = mtPayeTre;
	}

	public BigDecimal getMtPayeTre1() {
		return this.mtPayeTre1;
	}

	public void setMtPayeTre1(BigDecimal mtPayeTre1) {
		this.mtPayeTre1 = mtPayeTre1;
	}

	public BigDecimal getMtPrix() {
		return this.mtPrix;
	}

	public void setMtPrix(BigDecimal mtPrix) {
		this.mtPrix = mtPrix;
	}

	public BigDecimal getMtTre() {
		return this.mtTre;
	}

	public void setMtTre(BigDecimal mtTre) {
		this.mtTre = mtTre;
	}

	public BigDecimal getMtTreOrd() {
		return this.mtTreOrd;
	}

	public void setMtTreOrd(BigDecimal mtTreOrd) {
		this.mtTreOrd = mtTreOrd;
	}

	public BigDecimal getMtTtc() {
		return this.mtTtc;
	}

	public void setMtTtc(BigDecimal mtTtc) {
		this.mtTtc = mtTtc;
	}

	public BigDecimal getNum() {
		return this.num;
	}

	public void setNum(BigDecimal num) {
		this.num = num;
	}

	public String getNumOrdreFact() {
		return this.numOrdreFact;
	}

	public void setNumOrdreFact(String numOrdreFact) {
		this.numOrdreFact = numOrdreFact;
	}

	public BigDecimal getNumVirCheq() {
		return this.numVirCheq;
	}

	public void setNumVirCheq(BigDecimal numVirCheq) {
		this.numVirCheq = numVirCheq;
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

	public String getRef() {
		return this.ref;
	}

	public void setRef(String ref) {
		this.ref = ref;
	}

	public String getRefBordereau() {
		return this.refBordereau;
	}

	public void setRefBordereau(String refBordereau) {
		this.refBordereau = refBordereau;
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

	public String getRefDemande() {
		return this.refDemande;
	}

	public void setRefDemande(String refDemande) {
		this.refDemande = refDemande;
	}

	public String getRefDemandeRs() {
		return this.refDemandeRs;
	}

	public void setRefDemandeRs(String refDemandeRs) {
		this.refDemandeRs = refDemandeRs;
	}

	public String getReferenceProjet() {
		return this.referenceProjet;
	}

	public void setReferenceProjet(String referenceProjet) {
		this.referenceProjet = referenceProjet;
	}

	public BigDecimal getTaux() {
		return this.taux;
	}

	public void setTaux(BigDecimal taux) {
		this.taux = taux;
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

	public BigDecimal getTauxPaye() {
		return this.tauxPaye;
	}

	public void setTauxPaye(BigDecimal tauxPaye) {
		this.tauxPaye = tauxPaye;
	}

	public BigDecimal getTauxPayeFe() {
		return this.tauxPayeFe;
	}

	public void setTauxPayeFe(BigDecimal tauxPayeFe) {
		this.tauxPayeFe = tauxPayeFe;
	}

	public BigDecimal getTauxTva() {
		return this.tauxTva;
	}

	public void setTauxTva(BigDecimal tauxTva) {
		this.tauxTva = tauxTva;
	}

	public String getTypePaie() {
		return this.typePaie;
	}

	public void setTypePaie(String typePaie) {
		this.typePaie = typePaie;
	}

	public BigDecimal getTypePrix() {
		return this.typePrix;
	}

	public void setTypePrix(BigDecimal typePrix) {
		this.typePrix = typePrix;
	}

	public Marche getMarche() {
		return marche;
	}

	public void setMarche(Marche marche) {
		this.marche = marche;
	}

	/*public Projet getProjet() {
		return projet;
	}

	public void setProjet(Projet projet) {
		this.projet = projet;
	}

	 */

    public long getIdProjet() {
        return idProjet;
    }

    public void setIdProjet(long idProjet) {
        this.idProjet = idProjet;
    }
}