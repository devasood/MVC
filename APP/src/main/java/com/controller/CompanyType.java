package com.controller;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class CompanyType {
	
	@Column
	private String name;
	@Column
	private String address;
	@Column
	private String email;
	@Column
	private String phone;
	@Column
	private String url;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	
	

	
	
}
