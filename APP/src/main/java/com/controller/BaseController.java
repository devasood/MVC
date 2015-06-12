package com.controller;
 
//import java.sql.Statement;
//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.ResultSet;
//import org.json.JSONArray;
//import org.json.JSONObject;
//import org.slf4j.LoggerFactory;



import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.OutputStreamWriter;
import java.net.URLDecoder;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.ImprovedNamingStrategy;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;
import org.json.JSONArray;
import org.json.JSONObject;
import org.json.XML;
import org.jsoup.Jsoup;
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
	private Configuration configuration=new Configuration();	
	private SessionFactory sessionFactory=configuration.configure("hibernate.cfg.xml")
			.setNamingStrategy(ImprovedNamingStrategy.INSTANCE)
			.buildSessionFactory(new StandardServiceRegistryBuilder()
			.applySettings(configuration.getProperties()).build());
	
	
	
	
	
	

	
	
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
	
	
	@RequestMapping(value = "/update", method = RequestMethod.GET)
	public String update(ModelMap model,
	@RequestParam(value="UPC") String upc,	
	@RequestParam(value="src") String src)
	{	
			
		model.addAttribute("src",src);
		model.addAttribute("APP",app);
		model.addAttribute("backlink",backlink);
		return "update"; 
	}
	
	@RequestMapping(value="/create.do", method=RequestMethod.GET)
	public String create(ModelMap model,
		@RequestParam(value="UPC") String UPC,
		@RequestParam(value="Manufacturer") String Manufacturer,
		@RequestParam(value="Brand") String Brand,
		@RequestParam(value="Description") String Description,
		@RequestParam(value="ItemSize") String ItemSize)
	{	
		
		model.addAttribute("message","Inserted successfully");
		model.addAttribute("APP",app);
		model.addAttribute("backlink",backlink);
		return "index";		
	}
	
	
	
	@RequestMapping(value="/getManufacturer", method=RequestMethod.GET)
	public String getManufacturer(ModelMap model)
	{	
		
		try{Scanner s=new Scanner(new File("C:\\Users\\devashishs\\Desktop\\manufacturer.xml"));
			String data=s.nextLine();
			String decode[]=data.split("id=\"");
			
			Session session=sessionFactory.openSession();
			session.beginTransaction();
			
			for (int i = 1; i < decode.length; i++) {
				manufacturer manufacturer=new manufacturer();
				manufacturer.setId(decode[i].split("\"")[0]);
				manufacturer.setName(Jsoup.parse(decode[i].split("name>")[1].split("<")[0]).text());
				
				session.save(manufacturer);				
			}
			
			session.getTransaction().commit();
			session.close();
			
		}	
	catch(Exception e){System.out.println(e);}
		
		
		model.addAttribute("message","Inserted Manufacturer.");
		return "index";
	}
	
	@RequestMapping(value="/getBrand", method=RequestMethod.GET)
	public String getBrand(ModelMap model)
	{	
		
		try{Scanner s=new Scanner(new File("C:\\Users\\devashishs\\Desktop\\brand.xml"));
			String data=s.nextLine();
			String decode[]=data.split("id=\"");
			
			Session session=sessionFactory.openSession();
			session.beginTransaction();
			
			for (int i = 1; i < decode.length; i++) {
				brand brand=new brand();
				brand.setId(decode[i].split("\"")[0]);
				brand.setName(Jsoup.parse(decode[i].split("name>")[1].split("<")[0]).text());
				
				session.save(brand);				
			}
			
			session.getTransaction().commit();
			session.close();
			
		}	
	catch(Exception e){System.out.println(e);}
		
		
		model.addAttribute("message","Inserted Brands.");
		return "index";
	}
	
	@RequestMapping(value="/getItem", method=RequestMethod.GET)
	public String getItem(ModelMap model)
	{	
		
		try{Scanner s=new Scanner(new File("C:\\Users\\devashishs\\Desktop\\items1.xml"));
		String data="";
		while(s.hasNextLine())	
		{String temp=s.nextLine();data+=temp+"\n";}
			data=Jsoup.parse(data).toString();
			JSONObject json=XML.toJSONObject(data);
			System.out.println();
			JSONArray itemList=json.getJSONObject("html").getJSONObject("body").getJSONObject("items")
			.getJSONArray("item");
			
			Session session=sessionFactory.openSession();
			session.beginTransaction();
			
			
			for (int i = 0; i < itemList.length(); i++) {
				JSONObject temp=itemList.getJSONObject(i);
//				ItemType item=new ItemType();
//				item.setId(temp.getString("id"));
//				item.setName(temp.getString("name"));
//				item.setMarketingDescription(temp.getString("marketingdescription"));
//				item.setOtherDescription(temp.getString("otherdescription"));
//				
//				try{
//					JSONArray temp2=temp.getJSONObject("upcs").getJSONArray("upc");				
//					for(int j=0;j<temp2.length();j++)
//					{
//						item.getUpcs().add(temp2.getJSONObject(j).getString("content"));
//					}
//				}catch(Exception e){item.getUpcs()
//					.add(temp.getJSONObject("upcs").getJSONObject("upc").getString("content"));}
//				
//				try{					
//					JSONArray temp2=temp.getJSONObject("categories").getJSONArray("category");
//					for(int j=0;j<temp2.length();j++)
//					{
//						item.getCategories().add(temp2.getJSONObject(j).getString("content"));
//					}
//				}catch(Exception e){item.getUpcs()
//					.add(temp.getJSONObject("categories").getJSONObject("category").getString("content"));}
//								
//				session.save(item);
			}
			
			session.getTransaction().commit();
			session.close();
			
		}	
	catch(Exception e){System.out.println(e);}
		
		
		model.addAttribute("message","Inserted Items.");
		return "index";
	}
	
	@RequestMapping(value="/index", method=RequestMethod.GET)
	public String searchResult(ModelMap model,
		@RequestParam(value="UPC") String UPC,
		@RequestParam(value="Manufacturer") String Manufacturer,
		@RequestParam(value="Brand") String Brand,
		@RequestParam(value="Page") String Page,
		@RequestParam(value="Delete", required=false) String delete)
		{
		
		if(delete!=null)
		{/*Deletes a record*/
//			Session session=sessionFactory.openSession();
//			session.beginTransaction();
//			Product product=(Product)session.get(Product.class, delete);
//			if(product!=null)
//			session.delete(product);
//			session.getTransaction().commit();
//			session.close();
			
		}		
		
//		String no_of_records=getPageCount(UPC,Manufacturer,Brand);
		
		long stats=System.currentTimeMillis();
		
//		List<Product> list=searchValues(Page,UPC,Manufacturer,Brand);
//		
//		for(int i=0;i<list.size();i++)
//			{String prod[]=list.get(i).getString().split(",");
//			for(int j=0;j<3;j++)
//			model.addAttribute("s"+i+j,prod[j]);
//			}
		
		stats=(System.currentTimeMillis()-stats);
		model.addAttribute("stats",stats+"ms");
//		model.addAttribute("no_of_records",no_of_records);
		model.addAttribute("currentPage",Page);
		model.addAttribute("APP",app);
		model.addAttribute("backlink",backlink);
		return "index";		
	}
	
	@RequestMapping(value="/update.do", method={RequestMethod.POST})
	public String updateValues(ModelMap model,
			@RequestParam(value="UPC") String upc,
			@RequestParam(value="Manufacturer") String manufacturer,
			@RequestParam(value="Brand") String brand,
			@RequestParam(value="Description") String description,
			@RequestParam(value="ItemSize") String itemSize,
			@RequestParam(value="src") String src)
			{	
			
			model.addAttribute("src",src);
			model.addAttribute("APP",app);
			model.addAttribute("backlink",backlink);
			return "redirect";
		}
	

	@RequestMapping(value = "*", method = {RequestMethod.GET,RequestMethod.PUT} )
	public String redirect(ModelMap model) {
		
		model.addAttribute("APP",app);
		model.addAttribute("backlink",backlink);
		model.addAttribute("message","Page does not exist.");
		return "redirect"; 
	}
 
 
}