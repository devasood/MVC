package com.controller;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class Warning {
	@Column
	private String warning="";

	public String getWarning() {
		return warning;
	}

	public void setWarning(String warning) {
		this.warning = warning;
	}
	
	
	

}
