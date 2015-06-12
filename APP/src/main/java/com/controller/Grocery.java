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
public class Grocery {
	@Id @GeneratedValue
	private String grocery_id;
	@Column
	private String ndcCode;
	@Column
	private String ingredients;
	@Column
	private String vitaminsAndMinerals;
	@ElementCollection
	private Collection<NutritionalClaim> nutritionalClaims=new ArrayList<NutritionalClaim>();
	@ElementCollection
	private Collection<String> kosherCodes=new ArrayList<String>();
	@ElementCollection
	private Collection<String> certifications=new ArrayList<String>();
	@ElementCollection
	Collection<FoodRelatedIndicator> foodRelatedIndicators=new ArrayList<FoodRelatedIndicator>();
	@Column
	private String recycleCodes;
	@ElementCollection
	private Collection<Nutrition> nutritions=new ArrayList<Nutrition>();
	public String getNdcCode() {
		return ndcCode;
	}
	public void setNdcCode(String ndcCode) {
		this.ndcCode = ndcCode;
	}
	public String getIngredients() {
		return ingredients;
	}
	public void setIngredients(String ingredients) {
		this.ingredients = ingredients;
	}
	public String getVitaminsAndMinerals() {
		return vitaminsAndMinerals;
	}
	public void setVitaminsAndMinerals(String vitaminsAndMinerals) {
		this.vitaminsAndMinerals = vitaminsAndMinerals;
	}
	public Collection<NutritionalClaim> getNutritionalClaims() {
		return nutritionalClaims;
	}
	public void setNutritionalClaims(Collection<NutritionalClaim> nutritionalClaims) {
		this.nutritionalClaims = nutritionalClaims;
	}
	public Collection<String> getKosherCodes() {
		return kosherCodes;
	}
	public void setKosherCodes(Collection<String> kosherCodes) {
		this.kosherCodes = kosherCodes;
	}
	public Collection<String> getCertifications() {
		return certifications;
	}
	public void setCertifications(Collection<String> certifications) {
		this.certifications = certifications;
	}
	public Collection<FoodRelatedIndicator> getFoodRelatedIndicators() {
		return foodRelatedIndicators;
	}
	public void setFoodRelatedIndicators(
			Collection<FoodRelatedIndicator> foodRelatedIndicators) {
		this.foodRelatedIndicators = foodRelatedIndicators;
	}
	public String getRecycleCodes() {
		return recycleCodes;
	}
	public void setRecycleCodes(String recycleCodes) {
		this.recycleCodes = recycleCodes;
	}
	public Collection<Nutrition> getNutritions() {
		return nutritions;
	}
	public void setNutritions(Collection<Nutrition> nutritions) {
		this.nutritions = nutritions;
	}
	
}
