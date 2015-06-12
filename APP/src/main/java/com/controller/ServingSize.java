package com.controller;

import javax.persistence.Column;


import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class ServingSize extends MeasurementType{
	private enum SERVINGSIZE{
		us,metric,other
	}
	@Id @GeneratedValue
	private String serving_id;
	@Column
	private String type="";

	public String getType() {
		return type;
	}

	public void setType(String type) {
		try{
			String temp=""+SERVINGSIZE.valueOf(type);
			this.type = temp;
		
		}catch(Exception e){e.printStackTrace();}
	}
	
	
}
