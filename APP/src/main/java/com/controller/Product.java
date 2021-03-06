package com.controller;

import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Embeddable;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.annotations.CollectionId;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Type;

@Embeddable
public class Product {
	
	@Column(name="product.sequence")
	private int sequence;
	@Column(name="p_id")
	private String id;	
	@Column(name="product.type")
	private String type;
	
	@Column(name="product.description")
	private String description;
	
	@Embedded
	@AttributeOverrides({
		@AttributeOverride(name="id",column=@Column(name="distributor.id")),
		@AttributeOverride(name="content",column=@Column(name="distributor"))
	})
	ValueWithIdType distributor=new ValueWithIdType();
	
	@Embedded
	@AttributeOverrides({
		@AttributeOverride(name="id",column=@Column(name="brand.id")),
		@AttributeOverride(name="content",column=@Column(name="brand"))
	})
	ValueWithIdType brand=new ValueWithIdType();
	
	@Embedded
	@AttributeOverrides({
		@AttributeOverride(name="id",column=@Column(name="manufacturer.id")),
		@AttributeOverride(name="content",column=@Column(name="manufacturer"))
	})
	ValueWithIdType manufacturer=new ValueWithIdType();
	
	@Column
	private String countryOfOrigin;
	
	@Embedded
	@AttributeOverride(name="warning",column=@Column(name="warning",length=5000))
	private Warning warning=new Warning();
	
	@Column(name="directions",length=5000)
	private String directions;
	
	@Embedded
	@AttributeOverrides({
		@AttributeOverride(name="ingredients",column=@Column(name="ingredients",length=5000)),
		@AttributeOverride(name="vitaminsAndMinerals",column=@Column(name="vitaminsandminerals",length=5000)),
		@AttributeOverride(name="nutritionalClaims",column=@Column(name="nutritionalclaims",length=5000)),
		@AttributeOverride(name="foodRelatedIndicators",column=@Column(name="foodrelatedindicators",length=5000))
	})
	private Grocery grocery=new Grocery();

	public int getSequence() {
		return sequence;
	}

	public void setSequence(int sequence) {
		this.sequence = sequence;
	}

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
	public Warning getWarning() {
		return warning;
	}

	public void setWarning(Warning warning) {
		this.warning = warning;
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
	public String getString()
	{
		return ""+id+","+manufacturer.getContent()+","+brand.getContent();
	}
	
}
