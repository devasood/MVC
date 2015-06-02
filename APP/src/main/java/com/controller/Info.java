package com.controller;

import javax.persistence.Embeddable;

@Embeddable
public class Info {
	
	private int size;
	private String type;
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}

	public String getString()
	{
		String info="";
		info+=size+",";
		info+=type;
		
		return info;
	}
	
}
