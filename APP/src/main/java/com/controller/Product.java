package com.controller;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="product_details")
public class Product {
	@Id
	@Column(name="upc")
	private String upc;
	@Column(name="manufacturer")
	private String manf;
	@Column(name="brand")
	private String brand;
	@Column(name="size")
	private String size;
	
	public String getUpc() {
		return upc;
	}
	public void setUpc(String upc) {
		this.upc = upc;
	}
	public String getManf() {
		return manf;
	}
	public void setManf(String manf) {
		this.manf = manf;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getSize() {
		return size;
	}
	public void setSize(String size) {
		this.size = size;
	}
	
	

}
