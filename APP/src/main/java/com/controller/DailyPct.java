package com.controller;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class DailyPct extends Uom{
	@Id @GeneratedValue
	private String daily_id;
	@Column
	private String dailyPct;

	public String getDailyPct() {
		return dailyPct;
	}

	public void setDailyPct(String dailyPct) {
		this.dailyPct = dailyPct;
	}
	
}
