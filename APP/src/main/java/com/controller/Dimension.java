package com.controller;

import javax.persistence.Embeddable;

@Embeddable
public class Dimension {
	
	private int length;
	private int height;
	private int width;
	private int weight;
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	
	public String getString()
	{
		String dim="";
		dim+=length+",";
		dim+=height+",";
		dim+=width+",";
		dim+=weight;
		
		return dim;
	}
	
	

}
