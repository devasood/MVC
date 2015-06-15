package com.controller;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Embedded;

@Embeddable
public class PackageData {
	
	@Embedded
	@AttributeOverrides({	
		@AttributeOverride(name="measure",column=@Column(name="length.measure")),			
		@AttributeOverride(name="uom",column=@Column(name="length.uom"))
	})
	private MeasurementType length=new MeasurementType();
	@Embedded
	@AttributeOverrides({	
		@AttributeOverride(name="measure",column=@Column(name="height.measure")),			
		@AttributeOverride(name="uom",column=@Column(name="height.uom"))
	})
	private MeasurementType height=new MeasurementType();
	@Embedded
	@AttributeOverrides({	
		@AttributeOverride(name="measure",column=@Column(name="width.measure")),			
		@AttributeOverride(name="uom",column=@Column(name="width.uom"))
	})	
	private MeasurementType width=new MeasurementType();
	@Column
	private int unitsInPackage;
	@Embedded
	@AttributeOverrides({	
		@AttributeOverride(name="id",column=@Column(name="packagetype.id")),			
		@AttributeOverride(name="content",column=@Column(name="packagetype"))
	})	
	ValueWithIdType packageType =new ValueWithIdType();
	@Embedded
	@AttributeOverrides({	
		@AttributeOverride(name="measure",column=@Column(name="packagesize.measure")),			
		@AttributeOverride(name="uom",column=@Column(name="packagesize.uom"))
	})	
	private MeasurementType packageSize=new MeasurementType();
	@Embedded
	@AttributeOverrides({	
		@AttributeOverride(name="measure",column=@Column(name="dryweight.measure")),			
		@AttributeOverride(name="uom",column=@Column(name="dryweight.uom"))
	})	
	private MeasurementType dryWeight=new MeasurementType();
	@Embedded
	@AttributeOverrides({	
		@AttributeOverride(name="measure",column=@Column(name="netweight.measure")),			
		@AttributeOverride(name="uom",column=@Column(name="netweight.uom"))
	})	
	private MeasurementType netWeight=new MeasurementType();
	@Column
	private String information;
	
	public MeasurementType getLength() {
		return length;
	}
	public void setLength(MeasurementType length) {
		this.length = length;
	}
	public MeasurementType getHeight() {
		return height;
	}
	public void setHeight(MeasurementType height) {
		this.height = height;
	}
	public MeasurementType getWidth() {
		return width;
	}
	public void setWidth(MeasurementType width) {
		this.width = width;
	}
	public int getUnitsInPackage() {
		return unitsInPackage;
	}
	public void setUnitsInPackage(int unitsInPackage) {
		this.unitsInPackage = unitsInPackage;
	}
	public ValueWithIdType getPackageType() {
		return packageType;
	}
	public void setPackageType(ValueWithIdType packageType) {
		this.packageType = packageType;
	}
	public MeasurementType getPackageSize() {
		return packageSize;
	}
	public void setPackageSize(MeasurementType packageSize) {
		this.packageSize = packageSize;
	}
	public MeasurementType getDryWeight() {
		return dryWeight;
	}
	public void setDryWeight(MeasurementType dryWeight) {
		this.dryWeight = dryWeight;
	}
	public MeasurementType getNetWeight() {
		return netWeight;
	}
	public void setNetWeight(MeasurementType netWeight) {
		this.netWeight = netWeight;
	}
	public String getInformation() {
		return information;
	}
	public void setInformation(String information) {
		this.information = information;
	}
	
	
	
}
