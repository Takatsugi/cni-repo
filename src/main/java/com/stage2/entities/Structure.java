package com.stage2.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the "STRUCTURE" database table.
 * 
 */
@Entity
@Table(name="STRUCTURE")
@NamedQuery(name="Structure.findAll", query="SELECT s FROM Structure s")
public class Structure implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(unique=true, nullable=false, precision=10)
	private long id;

	@Column(name="des", length=100)
	private String des;



	public Structure() {
	}

	public Structure(String des) {
		this.des = des;
	}

	public String getDes() {
		return this.des;
	}

	public void setDes(String des) {
		this.des = des;
	}

	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
	}

}