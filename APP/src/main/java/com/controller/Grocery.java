package com.controller;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Embedded;

@Embeddable
public class Grocery {
	
	@Column
	private String ndcCode;
	@Column
	private String ingredients;
	@Column
	private String vitaminsAndMinerals;
	
	@Column
	private String nutritionalClaims="";/*special setter function-workaround*/
	
	@Column
	private String kosherCode;
	
	@Column
	private String certificate;
	
	@Column
	private String foodRelatedIndicators="";/*special setter function-workaround*/
	
	@Column
	private String temperatureType;
	
	@Column
	private String recycleCodes;

//	@Embedded
//	private Nutrition nutrition;
	
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

	public String getNutritionalClaims() {
		return nutritionalClaims;
	}

	public void setNutritionalClaims(String nutritionalClaims) {
		this.nutritionalClaims += nutritionalClaims+"\n";
	}

	public String getKosherCode() {
		return kosherCode;
	}

	public void setKosherCode(String kosherCode) {
		this.kosherCode = kosherCode;
	}

	public String getCertificate() {
		return certificate;
	}

	public void setCertificate(String certificate) {
		this.certificate = certificate;
	}

	public String getFoodRelatedIndicators() {
		return foodRelatedIndicators;
	}

	public void setFoodRelatedIndicators(String foodRelatedIndicators) {
		this.foodRelatedIndicators += foodRelatedIndicators+"\n";
	}

	public String getTemperatureType() {
		return temperatureType;
	}

	public void setTemperatureType(String temperatureType) {
		this.temperatureType = temperatureType;
	}

	public String getRecycleCodes() {
		return recycleCodes;
	}

	public void setRecycleCodes(String recycleCodes) {
		this.recycleCodes = recycleCodes;
	}
//	public Nutrition getNutrition() {
//		return nutrition;
//	}
//	public void setNutrition(Nutrition nutrition) {
//		this.nutrition = nutrition;
//	}	
}
