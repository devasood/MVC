package com.controller;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class FoodRelatedIndicator {
	private enum FOODRELATEDINDICATORS{
		dairyFree,eggFree,flavor,glutenFree,hormoneFree,lactoseFree,natural,
		nitratesFree,nitritesFree,organic,peanutFree,readyToCook,readyToHeat,
		temperatureIndicator,vegan,vegetarian,wheatFree,nonGmo
	}
	@Id @GeneratedValue
	private String indicator_id;
	@Column
	private String foodRelatedIndicator;
	
	public String getContent() {
		return foodRelatedIndicator;
	}
	public void setContent(String content) {
		try{
			String temp=""+FOODRELATEDINDICATORS.valueOf(content);
			this.foodRelatedIndicator = temp;
		
		}catch(Exception e){e.printStackTrace();}
	}
		

}
	


