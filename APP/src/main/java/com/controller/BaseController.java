package com.controller;
 
//import java.sql.Statement;
//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.ResultSet;
//import org.json.JSONArray;
//import org.json.JSONObject;
//import org.slf4j.LoggerFactory;


import java.io.File;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class BaseController {
	
	private String app="APP";
	private String backlink="<a href=\"/"+app+"/\">Go back</a>";
	
	private void insertValues(String a,String b,String c,String d)
	{
		Product product=new Product();
		product.setUpc(a);
		product.setManf(b);
		product.setBrand(c);
		product.setSize(d);
		
		Configuration configuration=new Configuration();
		configuration.setProperty("hibernate.connection.driver_class","org.postgresql.Driver");		
		configuration.setProperty("hibernate.connection.url","jdbc:postgresql://localhost/postgres");
		configuration.setProperty("hibernate.connection.username","postgres");
		configuration.setProperty("hibernate.connection.password","sandbox");
		configuration.setProperty("hibernate.dialect", "org.hibernate.dialect.PostgreSQLDialect");
		configuration.setProperty("connection.pool_size","1");
		configuration.setProperty("cache.provider_class","org.hibernate.cache.NoCacheProvider");
        configuration.setProperty("show_sql","true");
        configuration.setProperty("hibernate.hbm2ddl.auto","update");
		
		
		SessionFactory sessionFactory=configuration.configure()
				.buildSessionFactory(new StandardServiceRegistryBuilder()
				.applySettings(configuration.getProperties()).build());
		
		Session session=sessionFactory.openSession();
		session.beginTransaction();
		session.save(product);
		session.getTransaction().commit();
	}
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String showIndex(ModelMap model) {
		model.addAttribute("APP",app);
		return "index"; 
	}
	@RequestMapping(value = "/create", method = RequestMethod.GET)
	public String create(ModelMap model) {
		model.addAttribute("APP",app);
		model.addAttribute("backlink",backlink);
		return "create"; 
	}
	@RequestMapping(value = "/read", method = RequestMethod.GET)
	public String read(ModelMap model) {
		model.addAttribute("APP",app);
		model.addAttribute("backlink",backlink);
		return "read"; 
	}
	@RequestMapping(value = "/update", method = RequestMethod.GET)
	public String update(ModelMap model) {
		model.addAttribute("APP",app);
		model.addAttribute("backlink",backlink);
		return "update"; 
	}
	@RequestMapping(value = "/delete", method = RequestMethod.GET)
	public String delete(ModelMap model) {
		model.addAttribute("APP",app);
		model.addAttribute("backlink",backlink);
		return "delete"; 
	}
	
	@RequestMapping(value="/search", method=RequestMethod.GET)
	public String searchResult(ModelMap model,
	@RequestParam(value="UPC") String UPC,
	@RequestParam(value="Manufacturer") String Manf,
	@RequestParam(value="Brand") String Brand,
	@RequestParam(value="Size") String Size)
	{
		model.addAttribute("APP",app);
		model.addAttribute("backlink",backlink);
		return "search";		
	}
	
	@RequestMapping(value="/create.do", method=RequestMethod.GET)
	public String create(ModelMap model,
	@RequestParam(value="UPC") String UPC,
	@RequestParam(value="Manufacturer") String Manf,
	@RequestParam(value="Brand") String Brand,
	@RequestParam(value="Size") String Size)
	{	
		insertValues(UPC,Manf,Brand,Size);
		
		model.addAttribute("message","Inserted successfully");
		model.addAttribute("APP",app);
		model.addAttribute("backlink",backlink);
		return "redirect";		
	}
	
	@RequestMapping(value = "*", method = {RequestMethod.GET,RequestMethod.POST} )
	public String redirect(ModelMap model) {
		
		model.addAttribute("APP",app);
		model.addAttribute("backlink",backlink);
		return "redirect"; 
	}
 
 
}