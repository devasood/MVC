package com.controller;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class Grocery {
	
	@Column(columnDefinition="character varying (5000) ",length=5000)
	private String ingredients;

	public String getIngredients() {
		return ingredients;
	}

	public void setIngredients(String ingredients) {
		this.ingredients = ingredients;
	}
	
}
