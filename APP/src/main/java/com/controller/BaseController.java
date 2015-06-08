package com.controller;
 
//import java.sql.Statement;
//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.ResultSet;
//import org.json.JSONArray;
//import org.json.JSONObject;
//import org.slf4j.LoggerFactory;



import java.net.URLDecoder;
import java.util.List;
import java.util.Random;

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
	
	private void insertValues(String upc,String manufacturer,String brand)
	{	
		Product product=new Product();
		product.setUpc(upc);	
		product.setManufacturer(manufacturer);
		product.setBrand(brand);
		
		
		Session session=sessionFactory.openSession();
		session.beginTransaction();
		
		session.save(product);
		
		session.getTransaction().commit();
		session.close();
		
	}
	
	private String getPageCount(String upc,String manufacturer,String brand)
	{	Session session=sessionFactory.openSession();
	
		Criteria criteria=session.createCriteria(Product.class);
		criteria.add(Restrictions.like("upc", "%"+upc+"%"))
				.add(Restrictions.like("manufacturer", "%"+manufacturer+"%"))
				.add(Restrictions.like("brand", "%"+brand+"%"))
				.addOrder(Order.asc("upc"))
				.setFetchMode("upc", org.hibernate.FetchMode.SELECT)
				.setProjection(Projections.property("upc"));
		
		
		criteria.setCacheable(true);
		
		
		int count=criteria.list().size();
		
		session.close();
		
		return ""+count;
		
	}
	
	private List<Product> searchValues(String page,String upc,String manufacturer,String brand)
	{	Session session=sessionFactory.openSession();
		
		Criteria criteria=session.createCriteria(Product.class);
		criteria.add(Restrictions.like("upc", "%"+upc+"%"))
				.add(Restrictions.like("manufacturer", "%"+manufacturer+"%"))
				.add(Restrictions.like("brand", "%"+brand+"%"))
				.addOrder(Order.asc("upc"));
		
		
		criteria.setFirstResult((Integer.parseInt(page)-1)*10);
		criteria.setFetchSize(10);
		criteria.setCacheable(true);
		
		
		List<Product> list=(List<Product>)criteria.list();
		
		session.close();
		
		return list;
		
	}
	

	public String r()
	{	Random r=new Random();/*generates random values*/
		return ""+r.nextInt(1000000);
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
	
	@RequestMapping(value = "/update", method = RequestMethod.GET)
	public String update(ModelMap model,
	@RequestParam(value="UPC") String upc,
	@RequestParam(value="src") String src)
	{	
		Session session=sessionFactory.openSession();
		Product product=(Product)session.get(Product.class, upc);
				
		String manufacturer=product.getManufacturer(),
			   brand=product.getBrand();
		
		model.addAttribute("upc",upc);
		model.addAttribute("manufacturer",manufacturer);
		model.addAttribute("brand",brand);
		
		session.close();
		
		model.addAttribute("src",src);
		model.addAttribute("APP",app);
		model.addAttribute("backlink",backlink);
		return "update"; 
	}
	
	@RequestMapping(value="/create.do", method=RequestMethod.GET)
	public String create(ModelMap model,
		@RequestParam(value="UPC") String UPC,
		@RequestParam(value="Manufacturer") String Manufacturer,
		@RequestParam(value="Brand") String Brand)
	{	String message=""; 
		insertValues(UPC,Manufacturer,Brand);
		if(message.length()<1)
			message="Inserted successfully";
		
		model.addAttribute("message",message);
		model.addAttribute("APP",app);
		model.addAttribute("backlink",backlink);
		return "index";		
	}
	
	@RequestMapping(value="/create.random", method=RequestMethod.GET)
	public String createRandom(ModelMap model)
		
		{	
			for(int i=0;i<10000;i++)
			{try{insertValues(r(),r(),r());}catch(Exception e){}}
			
			
			model.addAttribute("message","Random Inserted successfully");
			model.addAttribute("APP",app);
			model.addAttribute("backlink",backlink);
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
			Session session=sessionFactory.openSession();
			session.beginTransaction();
			Product product=(Product)session.get(Product.class, delete);
			if(product!=null)
			session.delete(product);
			session.getTransaction().commit();
			session.close();
			
		}		
		
		String no_of_records=getPageCount(UPC,Manufacturer,Brand);
		
		long stats=System.currentTimeMillis();
		
		List<Product> list=searchValues(Page,UPC,Manufacturer,Brand);
		
		for(int i=0;i<list.size();i++)
			{String prod[]=list.get(i).getString().split(",");
			for(int j=0;j<3;j++)
			model.addAttribute("s"+i+j,prod[j]);
			}
		
		stats=(System.currentTimeMillis()-stats);
		model.addAttribute("stats",stats+"ms");
		model.addAttribute("no_of_records",no_of_records);
		model.addAttribute("currentPage",Page);
		model.addAttribute("APP",app);
		model.addAttribute("backlink",backlink);
		return "index";		
	}
	
	@RequestMapping(value="/update.do", method={RequestMethod.GET})
	public String updateValues(ModelMap model,
			@RequestParam(value="UPC") String upc,
			@RequestParam(value="Manufacturer") String manufacturer,
			@RequestParam(value="Brand") String brand,
			@RequestParam(value="src") String src)
			{	
			Session session=sessionFactory.openSession();
			session.beginTransaction();
			
			Product product=(Product)session.get(Product.class, upc);
			product.setManufacturer(manufacturer);
			product.setBrand(brand);
			
			session.update(product);
			
			session.getTransaction().commit();
			session.close();
			
			model.addAttribute("src",src);
			model.addAttribute("APP",app);
			model.addAttribute("backlink",backlink);
			return "redirect";
		}
	

	@RequestMapping(value = "*", method = {RequestMethod.GET,RequestMethod.POST} )
	public String redirect(ModelMap model) {
		
		model.addAttribute("APP",app);
		model.addAttribute("backlink",backlink);
		model.addAttribute("message","Page does not exist.");
		return "redirect"; 
	}
 
 
}