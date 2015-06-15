package com.controller;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Embedded;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Entity;

import org.hibernate.annotations.CollectionId;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Type;
import org.json.JSONObject;

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
	
	@GenericGenerator(name="hi-lo",strategy="hilo")
	@ElementCollection
	@CollectionId(columns=@Column(name="upc_id"),generator="hi-lo",type=@Type(type="long"))
	private Collection<Upc> upcs=new ArrayList<Upc>();
	
	@GenericGenerator(name="hi-lo",strategy="hilo")
	@ElementCollection
	@CollectionId(columns=@Column(name="category_id"),generator="hi-lo",type=@Type(type="long"))
	private Collection<Category> categories=new ArrayList<Category>();
	
	@Embedded
	private PackageData packageData=new PackageData();
	
	@GenericGenerator(name="hi-lo",strategy="hilo")
	@ElementCollection
	@CollectionId(columns=@Column(name="product_id"),generator="hi-lo",type=@Type(type="long"))
	private Collection<Product> product=new ArrayList<Product>();
	
	@Embedded
	@AttributeOverrides({	
			@AttributeOverride(name="name",column=@Column(name="distributor.name")),
			@AttributeOverride(name="address",column=@Column(name="distributor.address")),
			@AttributeOverride(name="email",column=@Column(name="distributor.email")),
			@AttributeOverride(name="phone",column=@Column(name="distributor.phone")),
			@AttributeOverride(name="url",column=@Column(name="distributor.url"))
	})
	private CompanyType packageDistributor=new CompanyType();
	
	@Embedded
	@AttributeOverrides({	
		@AttributeOverride(name="name",column=@Column(name="manufacturer.name")),
		@AttributeOverride(name="address",column=@Column(name="manufacturer.address")),
		@AttributeOverride(name="email",column=@Column(name="manufacturer.email")),
		@AttributeOverride(name="phone",column=@Column(name="manufacturer.phone")),
		@AttributeOverride(name="url",column=@Column(name="manufacturer.url"))
	})
	private CompanyType packageManufacturer=new CompanyType();
	
	@Embedded
	@AttributeOverrides({	
			@AttributeOverride(name="id",column=@Column(name="attribute.name")),			
			@AttributeOverride(name="content",column=@Column(name="attribute"))
	})
	private ValueWithIdType attribute=new ValueWithIdType();
	
		
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
	public void setUpcs(Collection<Upc> upcs) {
		this.upcs = upcs;
	}	
	public Collection<Category> getCategories() {
		return categories;
	}
	public void setCategories(Collection<Category> categories) {
		this.categories = categories;
	}
	public PackageData getPackageData() {
		return packageData;
	}
	public void setPackageData(PackageData packageData) {
		this.packageData = packageData;
	}
	public Collection<Product> getProduct() {
		return product;
	}
	public void setProduct(Collection<Product> product) {
		this.product = product;
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
	public ValueWithIdType getAttribute() {
		return attribute;
	}
	public void setAttribute(ValueWithIdType attribute) {
		this.attribute = attribute;
	}
	
	
}
