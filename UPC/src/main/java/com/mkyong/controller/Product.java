package com.mkyong.controller;
public class Product {
	
	public String upc,manf,brand,size;
	
	
	public Product(String a,String b,String c,String d)
	{
		upc=a;
		manf=b;
		brand=c;
		size=d;
	}
	
	public Product(Product obj)
	{
		this.upc=obj.upc;
		this.manf=obj.manf;
		this.brand=obj.brand;
		this.size=obj.size;
	}
	
	public Product()
	{
		upc="";
		manf="";
		brand="";
		size="";
	}
	

}
