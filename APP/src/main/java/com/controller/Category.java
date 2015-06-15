package com.controller;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class Category {
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
		this.type = type;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	
	
}
