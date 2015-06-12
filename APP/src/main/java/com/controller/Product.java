package com.controller;

import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Embeddable;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Product {
	@Id @GeneratedValue(strategy=GenerationType.AUTO)
	private int sequence;
	@Column
	private String id;
	@Column
	private String type;
	@Column
	private String description;
	@OneToOne
	private ValueWithIdType distributor=new ValueWithIdType();
	@OneToOne
	private ValueWithIdType brand=new ValueWithIdType();
	@OneToOne
	private ValueWithIdType manufacturer=new ValueWithIdType();
	@Column
	private String countryOfOrigin;
	@OneToMany
	private Collection<String> warnings=new ArrayList<String>();
	@Column
	private String directions;
	@OneToOne
	private Grocery grocery=new Grocery();
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public ValueWithIdType getDistributor() {
		return distributor;
	}
	public void setDistributor(ValueWithIdType distributor) {
		this.distributor = distributor;
	}
	public ValueWithIdType getBrand() {
		return brand;
	}
	public void setBrand(ValueWithIdType brand) {
		this.brand = brand;
	}
	public ValueWithIdType getManufacturer() {
		return manufacturer;
	}
	public void setManufacturer(ValueWithIdType manufacturer) {
		this.manufacturer = manufacturer;
	}
	public String getCountryOfOrigin() {
		return countryOfOrigin;
	}
	public void setCountryOfOrigin(String countryOfOrigin) {
		this.countryOfOrigin = countryOfOrigin;
	}
	public Collection<String> getWarnings() {
		return warnings;
	}
	public void setWarnings(Collection<String> warnings) {
		this.warnings = warnings;
	}
	public String getDirections() {
		return directions;
	}
	public void setDirections(String directions) {
		this.directions = directions;
	}
	public Grocery getGrocery() {
		return grocery;
	}
	public void setGrocery(Grocery grocery) {
		this.grocery = grocery;
	}
	
	
	
}
