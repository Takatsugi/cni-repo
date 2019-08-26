package com.stage2.entities;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the PROFIL_PROJET database table.
 * 
 */
@Embeddable
public class ProfilProjetPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="ID_PROFIL", insertable=false, updatable=false, unique=true, nullable=false, precision=10)
	private long idProfil;

	@Column(name="ID_PROJET", unique=true, nullable=false, precision=10)
	private long idProjet;

	@Column(unique=true, nullable=false, length=50)
	private String login;

	public ProfilProjetPK() {
	}
	public long getIdProfil() {
		return this.idProfil;
	}
	public void setIdProfil(long idProfil) {
		this.idProfil = idProfil;
	}
	public long getIdProjet() {
		return this.idProjet;
	}
	public void setIdProjet(long idProjet) {
		this.idProjet = idProjet;
	}
	public String getLogin() {
		return this.login;
	}
	public void setLogin(String login) {
		this.login = login;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof ProfilProjetPK)) {
			return false;
		}
		ProfilProjetPK castOther = (ProfilProjetPK)other;
		return 
			(this.idProfil == castOther.idProfil)
			&& (this.idProjet == castOther.idProjet)
			&& this.login.equals(castOther.login);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + ((int) (this.idProfil ^ (this.idProfil >>> 32)));
		hash = hash * prime + ((int) (this.idProjet ^ (this.idProjet >>> 32)));
		hash = hash * prime + this.login.hashCode();
		
		return hash;
	}
}