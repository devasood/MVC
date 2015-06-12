package com.controller;

import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import org.springframework.beans.factory.annotation.Autowired;

@Entity
public class Upc {
	private enum UPCTYPE{
		UPC,PLC
	}
	
	@Id @GeneratedValue
	private String upc_id;
	
	@Column
	private String type;
	@Column
	private String upc;	
	
	public String getType() {
		return type;
	}
	public void setType(String type) {
		try{
			String temp=""+UPCTYPE.valueOf(type);
			this.type = type;
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	public String getContent() {
		return upc;
	}
	public void setContent(String content) {
		this.upc = content;
	}
	

}
