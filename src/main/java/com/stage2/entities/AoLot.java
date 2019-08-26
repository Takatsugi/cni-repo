package com.stage2.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the AO_LOT database table.
 * 
 */
@Entity
@Table(name="AO_LOT")
@NamedQuery(name="AoLot.findAll", query="SELECT a FROM AoLot a")
public class AoLot implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(unique=true, nullable=false, precision=10)
	private long id;

	@Column(name="BUDGET_FE", precision=38, scale=2)
	private BigDecimal budgetFe;

	@Column(name="BUDGET_PRIX", precision=38, scale=2)
	private BigDecimal budgetPrix;

	@Column(name="BUDGET_TOTAL", precision=38, scale=3)
	private BigDecimal budgetTotal;

	@Column(name="BUDGET_TRE", precision=38, scale=2)
	private BigDecimal budgetTre;

	@Column(name="CODE_ACTIVITE", length=50)
	private String codeActivite;

	@Column(name="CODE_CATEG_FE", length=100)
	private String codeCategFe;

	@Column(name="CODE_COND_FE", length=100)
	private String codeCondFe;

	@Column(name="CODE_FE", length=100)
	private String codeFe;

	@Column(nullable=false, length=250)
	private String des;

	@Column(name="DES_AR", length=250)
	private String desAr;

	@Column(name="ETAT_LOT", length=1)
	private String etatLot;

	@Column(name="FLAG_MULTI_ACTIVITE", precision=10)
	private BigDecimal flagMultiActivite;

	@Column(name="FLAG_SOUS_LOT", precision=10)
	private BigDecimal flagSousLot;

	@Column(name="ID_LOT_PERE", precision=10)
	private BigDecimal idLotPere;

	@Column(name="ID_MYSQL", precision=10)
	private BigDecimal idMysql;

	@Column(name="ID_PROJET", precision=10)
	private Projet idProjet;

	@Column(name ="ID_STRUCTURE", precision =10)
	private long idStructure;

	@Column(name="N_LOT", nullable=false, precision=10)
	private BigDecimal nLot;

	@Column(name="REF_COMPT_ANALYT", precision=10)
	private BigDecimal refComptAnalyt;

	@Column(name="REF_COMPT_GENERAL", precision=10)
	private BigDecimal refComptGeneral;

	@Column(name="REFERENCE_PROJET", length=50)
	private String referenceProjet;

	@Column(name="SS_PARAG", length=100)
	private String ssParag;

	@Column(name="TAUX_CHANGE", precision=38, scale=2)
	private BigDecimal tauxChange;

	@Column(name="TAUX_FINAN", precision=38, scale=2)
	private BigDecimal tauxFinan;

	@Column(name="TYPE_PRIX", precision=10)
	private BigDecimal typePrix;

	//uni-directional many-to-one association to AppelOffre
	@ManyToOne(optional = false)
	@JoinColumn(name="ID_AO", nullable=false)
	private AppelOffre appelOffre;

	//bi-directional one-to-one association to MarcheLot
	@OneToOne(mappedBy="aoLot")
	private MarcheLot marcheLot;

	public AoLot() {
	}

	public long getIdStructure() {
		return idStructure;
	}

	public void setIdStructure(long idStructure) {
		this.idStructure = idStructure;
	}

	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public BigDecimal getBudgetFe() {
		return this.budgetFe;
	}

	public void setBudgetFe(BigDecimal budgetFe) {
		this.budgetFe = budgetFe;
	}

	public BigDecimal getBudgetPrix() {
		return this.budgetPrix;
	}

	public void setBudgetPrix(BigDecimal budgetPrix) {
		this.budgetPrix = budgetPrix;
	}

	public BigDecimal getBudgetTotal() {
		return this.budgetTotal;
	}

	public void setBudgetTotal(BigDecimal budgetTotal) {
		this.budgetTotal = budgetTotal;
	}

	public BigDecimal getBudgetTre() {
		return this.budgetTre;
	}

	public void setBudgetTre(BigDecimal budgetTre) {
		this.budgetTre = budgetTre;
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

	public String getEtatLot() {
		return this.etatLot;
	}

	public void setEtatLot(String etatLot) {
		this.etatLot = etatLot;
	}

	public BigDecimal getFlagMultiActivite() {
		return this.flagMultiActivite;
	}

	public void setFlagMultiActivite(BigDecimal flagMultiActivite) {
		this.flagMultiActivite = flagMultiActivite;
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

	public BigDecimal getIdMysql() {
		return this.idMysql;
	}

	public void setIdMysql(BigDecimal idMysql) {
		this.idMysql = idMysql;
	}

	public Projet getIdProjet() {
		return this.idProjet;
	}

	public void setIdProjet(Projet idProjet) {
		this.idProjet = idProjet;
	}

	public BigDecimal getNLot() {
		return this.nLot;
	}

	public void setNLot(BigDecimal nLot) {
		this.nLot = nLot;
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

	public String getSsParag() {
		return this.ssParag;
	}

	public void setSsParag(String ssParag) {
		this.ssParag = ssParag;
	}

	public BigDecimal getTauxChange() {
		return this.tauxChange;
	}

	public void setTauxChange(BigDecimal tauxChange) {
		this.tauxChange = tauxChange;
	}

	public BigDecimal getTauxFinan() {
		return this.tauxFinan;
	}

	public void setTauxFinan(BigDecimal tauxFinan) {
		this.tauxFinan = tauxFinan;
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

	public MarcheLot getMarcheLot() {
		return this.marcheLot;
	}

	public void setMarcheLot(MarcheLot marcheLot) {
		this.marcheLot = marcheLot;
	}

}