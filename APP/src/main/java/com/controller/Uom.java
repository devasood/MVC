package com.controller;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Uom {
	private enum UOM{
		kg,g,mg,mcg
	}
	@Id @GeneratedValue
	private String uom_id;
	@Column
	private String uom;

	public String getUom() {
		return uom;
	}

	public void setUom(String uom) {
		try{
			String temp=""+UOM.valueOf(uom);
			this.uom = temp;
			
		}catch(Exception e){e.printStackTrace();}
	}
	

}
