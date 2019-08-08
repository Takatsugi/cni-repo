package com.stage2.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.List;


/**
 * The persistent class for the FACTURE_MARCHE_LOT database table.
 * 
 */
@Entity
@Table(name="FACTURE_MARCHE_LOT")
@NamedQuery(name="FactureMarcheLot.findAll", query="SELECT f FROM FactureMarcheLot f")
public class FactureMarcheLot implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private FactureMarcheLotPK id;

	@Column(name="ID_LOT_PERE")
	private BigDecimal idLotPere;

	@Column(name="ID_MARCH_ETAPE")
	private BigDecimal idMarchEtape;

	@Column(name="MT_LOT_HT")
	private BigDecimal mtLotHt;

	@Column(name="MT_LOT_TTC")
	private BigDecimal mtLotTtc;

	@Column(name="TAUX_TVA")
	private BigDecimal tauxTva;

	@Column(name="TYPE_PRIX")
	private BigDecimal typePrix;

	@OneToOne
	private MarcheLot marcheLot;

	@ManyToOne
	private Facture facture;

	public FactureMarcheLot() {
	}

	public FactureMarcheLotPK getId() {
		return this.id;
	}

	public void setId(FactureMarcheLotPK id) {
		this.id = id;
	}

	public BigDecimal getIdLotPere() {
		return this.idLotPere;
	}

	public void setIdLotPere(BigDecimal idLotPere) {
		this.idLotPere = idLotPere;
	}

	public BigDecimal getIdMarchEtape() {
		return this.idMarchEtape;
	}

	public void setIdMarchEtape(BigDecimal idMarchEtape) {
		this.idMarchEtape = idMarchEtape;
	}

	public BigDecimal getMtLotHt() {
		return this.mtLotHt;
	}

	public void setMtLotHt(BigDecimal mtLotHt) {
		this.mtLotHt = mtLotHt;
	}

	public BigDecimal getMtLotTtc() {
		return this.mtLotTtc;
	}

	public void setMtLotTtc(BigDecimal mtLotTtc) {
		this.mtLotTtc = mtLotTtc;
	}

	public BigDecimal getTauxTva() {
		return this.tauxTva;
	}

	public void setTauxTva(BigDecimal tauxTva) {
		this.tauxTva = tauxTva;
	}

	public BigDecimal getTypePrix() {
		return this.typePrix;
	}

	public void setTypePrix(BigDecimal typePrix) {
		this.typePrix = typePrix;
	}

	public MarcheLot getMarcheLot() {
		return marcheLot;
	}

	public void setMarcheLot(MarcheLot marcheLot) {
		this.marcheLot = marcheLot;
	}
}