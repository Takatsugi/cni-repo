package com.stage2.entities;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the UTILISATEUR database table.
 * 
 */
@Embeddable
public class UtilisateurPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(unique=true, nullable=false, length=50)
	private String login;

	@Column(name="COD_APP", unique=true, nullable=false, length=2)
	private String codApp;

	public UtilisateurPK() {
	}
	public String getLogin() {
		return this.login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getCodApp() {
		return this.codApp;
	}
	public void setCodApp(String codApp) {
		this.codApp = codApp;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof UtilisateurPK)) {
			return false;
		}
		UtilisateurPK castOther = (UtilisateurPK)other;
		return 
			this.login.equals(castOther.login)
			&& this.codApp.equals(castOther.codApp);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.login.hashCode();
		hash = hash * prime + this.codApp.hashCode();
		
		return hash;
	}
}