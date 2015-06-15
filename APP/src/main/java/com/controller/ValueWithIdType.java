package com.controller;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class ValueWithIdType {
	
	@Column
	private String id;
	@Column
	private String content;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	

}
