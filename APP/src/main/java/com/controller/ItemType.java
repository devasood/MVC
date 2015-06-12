package com.controller;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Embedded;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Entity;

import org.hibernate.annotations.CollectionId;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Type;

@Entity
@Table
public class ItemType {
	@Id
	private String id;
	@Column
	private String status;
	@Column
	private String name;
	@Column(length=5000)
	private String marketingDescription;
	@Column(length=5000)
	private String otherDescription;
	
	@OneToMany
	Collection<Upc> upcs=new ArrayList<Upc>();
	@OneToMany
	Collection<Category> categories=new ArrayList<Category>();
	
	@OneToOne
	private MeasurementType length=new MeasurementType();
	@OneToOne
	private MeasurementType height=new MeasurementType();
	@OneToOne
	private MeasurementType width=new MeasurementType();
	@Column
	private int unitsInPackage;
	@OneToOne
	ValueWithIdType packageType =new ValueWithIdType();
	@OneToOne
	private MeasurementType packageSize=new MeasurementType();
	@OneToOne
	private MeasurementType dryWeight=new MeasurementType();
	@OneToOne
	private MeasurementType netWeight=new MeasurementType();
	@Column
	private String information;
	@OneToMany
	private Collection<Product> products=new ArrayList<Product>();
	@OneToOne
	private CompanyType packageDistributor=new CompanyType();
	@OneToOne
	private CompanyType packageManufacturer=new CompanyType();
	@OneToMany
	Collection<ValueWithIdType> attributes=new ArrayList<ValueWithIdType>();
	
	
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMarketingDescription() {
		return marketingDescription;
	}
	public void setMarketingDescription(String marketingDescription) {
		this.marketingDescription = marketingDescription;
	}
	public String getOtherDescription() {
		return otherDescription;
	}
	public void setOtherDescription(String otherDescription) {
		this.otherDescription = otherDescription;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
	public Collection<Upc> getUpcs() {
		return upcs;
	}
	public void setUpcs(Set<Upc> upcs) {
		this.upcs = upcs;
	}
	public Collection<Category> getCategories() {
		return categories;
	}
	public void setCategories(Collection<Category> categories) {
		this.categories = categories;
	}
	public MeasurementType getLength() {
		return length;
	}
	public void setLength(MeasurementType length) {
		this.length = length;
	}
	public MeasurementType getHeight() {
		return height;
	}
	public void setHeight(MeasurementType height) {
		this.height = height;
	}
	public MeasurementType getWidth() {
		return width;
	}
	public void setWidth(MeasurementType width) {
		this.width = width;
	}
	public int getUnitsInPackage() {
		return unitsInPackage;
	}
	public void setUnitsInPackage(int unitsInPackage) {
		this.unitsInPackage = unitsInPackage;
	}
	public ValueWithIdType getPackageType() {
		return packageType;
	}
	public void setPackageType(ValueWithIdType packageType) {
		this.packageType = packageType;
	}
	public MeasurementType getPackageSize() {
		return packageSize;
	}
	public void setPackageSize(MeasurementType packageSize) {
		this.packageSize = packageSize;
	}
	public MeasurementType getDryWeight() {
		return dryWeight;
	}
	public void setDryWeight(MeasurementType dryWeight) {
		this.dryWeight = dryWeight;
	}
	public MeasurementType getNetWeight() {
		return netWeight;
	}
	public void setNetWeight(MeasurementType netWeight) {
		this.netWeight = netWeight;
	}
	public String getInformation() {
		return information;
	}
	public void setInformation(String information) {
		this.information = information;
	}
	
	public CompanyType getPackageDistributor() {
		return packageDistributor;
	}
	public void setPackageDistributor(CompanyType packageDistributor) {
		this.packageDistributor = packageDistributor;
	}
	public CompanyType getPackageManufacturer() {
		return packageManufacturer;
	}
	public void setPackageManufacturer(CompanyType packageManufacturer) {
		this.packageManufacturer = packageManufacturer;
	}
	public Collection<ValueWithIdType> getAttributes() {
		return attributes;
	}
	public void setAttributes(Collection<ValueWithIdType> attributes) {
		this.attributes = attributes;
	}
	
	
	
	
	
	
	
	
}
