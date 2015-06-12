package com.controller;

import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Nutrition {
	@Id @GeneratedValue(strategy=GenerationType.SEQUENCE)
	private int sequence;
	@Column
	private String title;
	@Column
	private String numberServedInPackage;
	@Column
	private String numberOfServings;
	@OneToMany
	Collection<ServingSize> servingSizes=new ArrayList<ServingSize>();
	@OneToOne
	private MeasurementType raccAmt=new MeasurementType();
	@Column
	private String energy;
	@OneToOne
	private DailyPctCalories totalFat=new DailyPctCalories();
	@OneToOne
	private DailyPctCalories saturatedFat=new DailyPctCalories();
	@OneToOne
	private DailyPct polyunsaturatedFat=new DailyPct();
	@OneToOne
	private DailyPct monounsaturatedFat=new DailyPct();
	@OneToOne
	private Uom transFat=new DailyPctCalories();
	@OneToOne
	private DailyPct cholesterol=new DailyPct();
	@OneToOne
	private DailyPct sodium=new DailyPct();
	@OneToOne
	private DailyPct potassuium=new DailyPct();
	@OneToOne
	private DailyPct carbohydrates=new DailyPct();
	@OneToOne
	private Uom dietaryFiber=new Uom();
	@OneToOne
	private Uom soluableFiber=new Uom();
	@OneToOne
	private Uom insoluableFiber=new Uom();
	@OneToOne
	private Uom sugars=new Uom();
	@OneToOne
	private Uom sugarAlchohol=new Uom();/*this is bad typo by itemmaster*/
	@OneToOne
	private Uom otherCarbohydrates=new Uom();
	@OneToOne
	private DailyPct protein=new DailyPct();
	@Column
	private String dailyPercentList;
	public int getSequence() {
		return sequence;
	}
	public void setSequence(int sequence) {
		this.sequence = sequence;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getNumberServedInPackage() {
		return numberServedInPackage;
	}
	public void setNumberServedInPackage(String numberServedInPackage) {
		this.numberServedInPackage = numberServedInPackage;
	}
	public String getNumberOfServings() {
		return numberOfServings;
	}
	public void setNumberOfServings(String numberOfServings) {
		this.numberOfServings = numberOfServings;
	}
	public Collection<ServingSize> getServingSizes() {
		return servingSizes;
	}
	public void setServingSizes(Collection<ServingSize> servingSizes) {
		this.servingSizes = servingSizes;
	}
	public MeasurementType getRaccAmt() {
		return raccAmt;
	}
	public void setRaccAmt(MeasurementType raccAmt) {
		this.raccAmt = raccAmt;
	}
	public String getEnergy() {
		return energy;
	}
	public void setEnergy(String energy) {
		this.energy = energy;
	}
	public DailyPctCalories getTotalFat() {
		return totalFat;
	}
	public void setTotalFat(DailyPctCalories totalFat) {
		this.totalFat = totalFat;
	}
	public DailyPctCalories getSaturatedFat() {
		return saturatedFat;
	}
	public void setSaturatedFat(DailyPctCalories saturatedFat) {
		this.saturatedFat = saturatedFat;
	}
	public DailyPct getPolyunsaturatedFat() {
		return polyunsaturatedFat;
	}
	public void setPolyunsaturatedFat(DailyPct polyunsaturatedFat) {
		this.polyunsaturatedFat = polyunsaturatedFat;
	}
	public DailyPct getMonounsaturatedFat() {
		return monounsaturatedFat;
	}
	public void setMonounsaturatedFat(DailyPct monounsaturatedFat) {
		this.monounsaturatedFat = monounsaturatedFat;
	}
	public Uom getTransFat() {
		return transFat;
	}
	public void setTransFat(Uom transFat) {
		this.transFat = transFat;
	}
	public DailyPct getCholesterol() {
		return cholesterol;
	}
	public void setCholesterol(DailyPct cholesterol) {
		this.cholesterol = cholesterol;
	}
	public DailyPct getSodium() {
		return sodium;
	}
	public void setSodium(DailyPct sodium) {
		this.sodium = sodium;
	}
	public DailyPct getPotassuium() {
		return potassuium;
	}
	public void setPotassuium(DailyPct potassuium) {
		this.potassuium = potassuium;
	}
	public DailyPct getCarbohydrates() {
		return carbohydrates;
	}
	public void setCarbohydrates(DailyPct carbohydrates) {
		this.carbohydrates = carbohydrates;
	}
	public Uom getDietaryFiber() {
		return dietaryFiber;
	}
	public void setDietaryFiber(Uom dietaryFiber) {
		this.dietaryFiber = dietaryFiber;
	}
	public Uom getSoluableFiber() {
		return soluableFiber;
	}
	public void setSoluableFiber(Uom soluableFiber) {
		this.soluableFiber = soluableFiber;
	}
	public Uom getInsoluableFiber() {
		return insoluableFiber;
	}
	public void setInsoluableFiber(Uom insoluableFiber) {
		this.insoluableFiber = insoluableFiber;
	}
	public Uom getSugars() {
		return sugars;
	}
	public void setSugars(Uom sugars) {
		this.sugars = sugars;
	}
	public Uom getSugarAlchohol() {
		return sugarAlchohol;
	}
	public void setSugarAlchohol(Uom sugarAlchohol) {
		this.sugarAlchohol = sugarAlchohol;
	}
	public Uom getOtherCarbohydrates() {
		return otherCarbohydrates;
	}
	public void setOtherCarbohydrates(Uom otherCarbohydrates) {
		this.otherCarbohydrates = otherCarbohydrates;
	}
	public DailyPct getProtein() {
		return protein;
	}
	public void setProtein(DailyPct protein) {
		this.protein = protein;
	}
	public String getDailyPercentList() {
		return dailyPercentList;
	}
	public void setDailyPercentList(String dailyPercentList) {
		this.dailyPercentList = dailyPercentList;
	}
	
	

}
