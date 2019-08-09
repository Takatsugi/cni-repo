package com.stage2.entities;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the FACTURE_MARCHE_LOT database table.
 * 
 */

@Embeddable
public class FactureMarcheLotPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;



	@Column(name="ID_FACTURE")
	private long idFacture;

	@Column(name="ID_MARCHE_LOT")
	private long idMarcheLot ;

	public FactureMarcheLotPK() {
	}
	public long getIdFacture() {
		return this.idFacture;
	}
	public void setIdFacture(long idFacture) {
		this.idFacture = idFacture;
	}
	public long getIdMarcheLot() {
		return this.idMarcheLot;
	}
	public void setIdMarcheLot(long idMarcheLot) {
		this.idMarcheLot = idMarcheLot;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof FactureMarcheLotPK)) {
			return false;
		}
		FactureMarcheLotPK castOther = (FactureMarcheLotPK)other;
		return 
			(this.idFacture == castOther.idFacture)
			&& (this.idMarcheLot == castOther.idMarcheLot);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + ((int) (this.idFacture ^ (this.idFacture >>> 32)));
		hash = hash * prime + ((int) (this.idMarcheLot ^ (this.idMarcheLot >>> 32)));

		return hash;
	}


}