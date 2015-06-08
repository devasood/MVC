package com.controller;


import javax.persistence.Cacheable;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;


@Entity
@Table(name="product_details")
@Cacheable
@Cache(usage=CacheConcurrencyStrategy.READ_WRITE)
public class Product {
	@Id
	private String upc;
	private String manufacturer;
	private String brand;
	
	public String getUpc() {
		return upc;
	}
	public void setUpc(String upc) {
		this.upc = upc;
	}	
	public String getManufacturer() {
		return manufacturer;
	}
	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	
	public String getString()
	{
		String prod="";
		prod+=upc+",";
		prod+=manufacturer+",";
		prod+=brand;
		
		
		return prod;
		
	}
	
	
	
	
	

}
