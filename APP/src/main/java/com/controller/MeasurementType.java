package com.controller;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class MeasurementType {
	@Column
	private double measure;
	@Column
	private String uom;
	public double getMeasure() {
		return measure;
	}
	public void setMeasure(double measure) {
		this.measure = measure;
	}
	public String getUom() {
		return uom;
	}
	public void setUom(String uom) {
		this.uom = uom;
	}
	

}
