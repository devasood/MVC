package com.mkyong.controller;
 

import java.sql.*;

import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
 
@Controller
public class BaseController {
 
	private static int counter = 0;
	private static Product obj=new Product();
	private static final String VIEW_INDEX = "index";
	private final static org.slf4j.Logger logger = LoggerFactory.getLogger(BaseController.class);
	
	public boolean create()
	{
		try{
			Class.forName("org.postgresql.Driver");
			Connection con=DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres","postgres","sandbox");
			Statement st=con.createStatement();
			String sql="create table if not exists product(upc varchar(14) primary key,manufacturer varchar(50),brand varchar(50),size varchar(50));";
			st.execute(sql);
			return true;
			
		}catch(Exception e){logger.debug(e.toString());}
		return false;
	}
	
	public boolean read(String upc,String manf,String brand,String size){
		try{
			Class.forName("org.postgresql.Driver");
			Connection con=DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres","postgres","sandbox");
			Statement st=con.createStatement();
			if(upc.length()==0)
			{upc="%";}
			if(manf.length()==0)
			{manf="%";}
			if(brand.length()==0)
			{brand="%";}
			if(size.length()==0)
			{size="%";}
			String sql="select * from product where upc like '"+upc+"' and manufacturer like '"+manf+"' and "
					+ "brand like '"+brand+"' and size like '"+size+"';";
			ResultSet rs= st.executeQuery(sql);
			while(rs.next())
			{	
				obj.upc+="<tr><td>"+rs.getString(1)+"</td>";
				obj.upc+="<td>"+rs.getString(2)+"</td>";
				obj.upc+="<td>"+rs.getString(3)+"</td>";
				obj.upc+="<td>"+rs.getString(4)+"</td>";
				
			}
			return true;
		}catch(Exception  e){logger.debug(e.toString());}
		return false;
	}
	
	public boolean read(){
		try{
			Class.forName("org.postgresql.Driver");
			Connection con=DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres","postgres","sandbox");
			Statement st=con.createStatement();
			String sql="select * from product;";
			ResultSet rs= st.executeQuery(sql);
			
			while(rs.next())
			{	
				obj.upc+="<tr><td>"+rs.getString(1)+"</td>";
				obj.upc+="<td>"+rs.getString(2)+"</td>";
				obj.upc+="<td>"+rs.getString(3)+"</td>";
				obj.upc+="<td>"+rs.getString(4)+"</td>";
				
			}
			
			return true;
		}catch(Exception  e){logger.debug(e.toString());}
		return false;
	}
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String welcome(ModelMap model) {
		obj=new Product();

 
		// Spring uses InternalResourceViewResolver and return back index.jsp
		Boolean op=false;
//		create(); //make the table if it doesnt exist
		op=read();
		model.addAttribute("op",op);
		model.addAttribute("glob",obj.upc);
		
		
		return VIEW_INDEX;
 
	}
 
	@RequestMapping(value = "/form.asp", method = RequestMethod.GET)
	public String welcomeName(ModelMap model,
			@RequestParam(value="UPC") String UPC,
			@RequestParam(value="Manufacturer") String Manf,
			@RequestParam(value="Brand") String Brand,
			@RequestParam(value="Size") String Size)
	{
		obj=new Product();
		
// 
//		model.addAttribute("message", "Welcome " + name);
//		model.addAttribute("counter", ++counter);
//		logger.debug("[welcomeName] counter : {}", counter);
		Boolean op=false;
		
		op=read(UPC,Manf,Brand,Size);
		model.addAttribute("op",op);
		model.addAttribute("glob",obj.upc);
		
		return VIEW_INDEX;
 
		
	}
 
}