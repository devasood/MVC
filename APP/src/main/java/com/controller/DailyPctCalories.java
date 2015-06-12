package com.controller;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class DailyPctCalories extends DailyPct{
	@Id @GeneratedValue
	private String calories_id;
	@Column
	private String calories;

	public String getCalories() {
		return calories;
	}
	
	public void setCalories(String calories) {
		this.calories = calories;
	}
	
}
