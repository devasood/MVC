package com.mkyong.controller;
 

import java.sql.*;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
 
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
			String sql="create table if not exists product(upc bigint primary key,manufacturer varchar(50),brand varchar(50),size numeric);";
			st.execute(sql);
			return true;
			
		}catch(Exception e){logger.debug(e.toString());}
		return false;
	}
	
	public boolean read(String name){
		try{
			Class.forName("org.postgresql.Driver");
			Connection con=DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres","postgres","sandbox");
			Statement st=con.createStatement();
			String sql="select * from product where upc="+name+";";
			ResultSet rs= st.executeQuery(sql);
			rs.next();
			obj=new Product(rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4));
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
			obj.upc+=rs.getString(1)+",";
			return true;
		}catch(Exception  e){logger.debug(e.toString());}
		return false;
	}
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String welcome(ModelMap model) {
		

 
		// Spring uses InternalResourceViewResolver and return back index.jsp
		Boolean op=false;
//		create(); //make the table if it doesnt exist
		op=read();
		model.addAttribute("op",op);
		model.addAttribute("upc",obj.upc);
		
		return VIEW_INDEX;
 
	}
 
	@RequestMapping(value = "/{name}", method = RequestMethod.GET)
	public String welcomeName(@PathVariable String name, ModelMap model) {
// 
//		model.addAttribute("message", "Welcome " + name);
//		model.addAttribute("counter", ++counter);
//		logger.debug("[welcomeName] counter : {}", counter);
		Boolean op=false;
		
		op=read(name);
		model.addAttribute("op",op);
		model.addAttribute("upc",obj.upc);
		model.addAttribute("manf",obj.manf);
		model.addAttribute("brand",obj.brand);
		model.addAttribute("size",obj.size);
		
		return VIEW_INDEX;
 
		
	}
 
}