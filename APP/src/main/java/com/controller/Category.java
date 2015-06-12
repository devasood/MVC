
package com.controller;

import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Category {
	private enum CATEGORYTYPE{
		GS1
	}
	
	@Id @GeneratedValue
	private int category_id;
	@Column
	private String type;
	@Column
	private String id;
	@Column
	private String category;
	
	
	public String getType() {
		return type;
	}
	public void setType(String type) {
		try{
			String temp=""+CATEGORYTYPE.valueOf(type);
			this.type = temp;
		
		}catch(Exception e){e.printStackTrace();}
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getContent() {
		return category;
	}
	public void setContent(String content) {
		this.category = content;
	}
	
	

}
