package com.controller;
 
//import java.sql.Statement;
//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.ResultSet;
//import org.json.JSONArray;
//import org.json.JSONObject;
//import org.slf4j.LoggerFactory;



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
	
	private void insertValues(String upc,String manufacturer,String brand,
			String length,String height,String width,String weight,String size,String type)
	{	
		Product product=new Product();
		product.setUpc(upc);	
		product.setManufacturer(manufacturer);
		product.setBrand(brand);
		Dimension dim=product.getDimension();
		dim.setLength(Integer.parseInt(length));
		dim.setHeight(Integer.parseInt(height));
		dim.setWidth(Integer.parseInt(width));
		dim.setWeight(Integer.parseInt(weight));
		
		Info info=product.getInfo();
		info.setSize(Integer.parseInt(size));
		info.setType(type);
		
		
		Session session=sessionFactory.openSession();
		session.beginTransaction();
		
		session.save(product);
		
		session.getTransaction().commit();
		session.close();
		
	}
	
	private String getPageCount(String upc,String manufacturer,String brand,
			String length,String height,String width,String weight,String size,String type,
			String length2,String height2,String width2,String weight2,String size2)
	{	String ax[][]=new String[10][9];
		Session session=sessionFactory.openSession();

		if(length.length()==0)length="0";
		if(height.length()==0)height="0";
		if(width.length()==0)width="0";
		if(weight.length()==0)weight="0";
		if(size.length()==0)size="0";
		if(length2.length()==0)length2=""+Integer.MAX_VALUE;
		if(height2.length()==0)height2=""+Integer.MAX_VALUE;
		if(width2.length()==0)width2=""+Integer.MAX_VALUE;
		if(weight2.length()==0)weight2=""+Integer.MAX_VALUE;
		if(size2.length()==0)size2=""+Integer.MAX_VALUE;
		
		
		Criteria criteria=session.createCriteria(Product.class);
		criteria.add(Restrictions.like("upc", "%"+upc+"%"))
				.add(Restrictions.like("manufacturer", "%"+manufacturer+"%"))
				.add(Restrictions.like("brand", "%"+brand+"%"))
				.add(Restrictions.ge("dimension.length", Integer.parseInt(length)))
				.add(Restrictions.ge("dimension.height", Integer.parseInt(height)))
				.add(Restrictions.ge("dimension.width", Integer.parseInt(weight)))
				.add(Restrictions.ge("dimension.weight", Integer.parseInt(width)))
				.add(Restrictions.ge("info.size", Integer.parseInt(size)))
				.add(Restrictions.le("dimension.length", Integer.parseInt(length2)))
				.add(Restrictions.le("dimension.height", Integer.parseInt(height2)))
				.add(Restrictions.le("dimension.width", Integer.parseInt(weight2)))
				.add(Restrictions.le("dimension.weight", Integer.parseInt(width2)))
				.add(Restrictions.le("info.size", Integer.parseInt(size2)))
				.add(Restrictions.like("info.type", "%"+type+"%"))
				.addOrder(Order.asc("upc"))
				.setFetchMode("upc", org.hibernate.FetchMode.SELECT)
				.setProjection(Projections.property("upc"));
		
		
		criteria.setCacheable(true);
		
		
		int count=criteria.list().size();
		
		session.close();
		
		return ""+count;
		
	}
	
	private List<Product> searchValues(String page,String upc,String manufacturer,String brand,
			String length,String height,String width,String weight,String size,String type,
			String length2,String height2,String width2,String weight2,String size2)
	{	Session session=sessionFactory.openSession();

		if(length.length()==0)length="0";
		if(height.length()==0)height="0";
		if(width.length()==0)width="0";
		if(weight.length()==0)weight="0";
		if(size.length()==0)size="0";
		if(length2.length()==0)length2=""+Integer.MAX_VALUE;
		if(height2.length()==0)height2=""+Integer.MAX_VALUE;
		if(width2.length()==0)width2=""+Integer.MAX_VALUE;
		if(weight2.length()==0)weight2=""+Integer.MAX_VALUE;
		if(size2.length()==0)size2=""+Integer.MAX_VALUE;
		
		
		Criteria criteria=session.createCriteria(Product.class);
		criteria.add(Restrictions.like("upc", "%"+upc+"%"))
				.add(Restrictions.like("manufacturer", "%"+manufacturer+"%"))
				.add(Restrictions.like("brand", "%"+brand+"%"))
				.add(Restrictions.ge("dimension.length", Integer.parseInt(length)))
				.add(Restrictions.ge("dimension.height", Integer.parseInt(height)))
				.add(Restrictions.ge("dimension.width", Integer.parseInt(weight)))
				.add(Restrictions.ge("dimension.weight", Integer.parseInt(width)))
				.add(Restrictions.ge("info.size", Integer.parseInt(size)))
				.add(Restrictions.le("dimension.length", Integer.parseInt(length2)))
				.add(Restrictions.le("dimension.height", Integer.parseInt(height2)))
				.add(Restrictions.le("dimension.width", Integer.parseInt(weight2)))
				.add(Restrictions.le("dimension.weight", Integer.parseInt(width2)))
				.add(Restrictions.le("info.size", Integer.parseInt(size2)))
				.add(Restrictions.like("info.type", "%"+type+"%"))
				.addOrder(Order.asc("upc"));
		
		
		criteria.setFirstResult((Integer.parseInt(page)-1)*10);
		criteria.setFetchSize(10);
		criteria.setCacheable(true);
		
		
		List<Product> list=(List<Product>)criteria.list();
		
		session.close();
		
		return list;
		
	}
	
	/*private List<Product> searchValues(String upc,String manufacturer,String brand,
			String length,String height,String width,String weight,String size,String type)
	{	
		Session session=sessionFactory.openSession();
		
		if(length.length()==0)length="0";
		if(height.length()==0)height="0";
		if(width.length()==0)width="0";
		if(weight.length()==0)weight="0";
		if(size.length()==0)size="0";
		
		
		Criteria criteria=session.createCriteria(Product.class);
		criteria.add(Restrictions.like("upc", "%"+upc+"%"))
		.add(Restrictions.like("manufacturer", "%"+manufacturer+"%"))
		.add(Restrictions.like("brand", "%"+brand+"%"))
		.add(Restrictions.ge("dimension.length", Integer.parseInt(length)))
		.add(Restrictions.ge("dimension.height", Integer.parseInt(height)))
		.add(Restrictions.ge("dimension.width", Integer.parseInt(weight)))
		.add(Restrictions.ge("dimension.weight", Integer.parseInt(width)))
		.add(Restrictions.ge("info.size", Integer.parseInt(size)))
	    .add(Restrictions.like("info.type", "%"+type+"%"))
		.addOrder(Order.asc("upc"));
		
		criteria.setCacheable(true);
		
		
		List<Product> list=(List<Product>)criteria.list();
		session.close();
		
		return list;
		
	}*/

	public String r()
	{	Random r=new Random();/*generates random values*/
		return ""+r.nextInt(1000000);
	}
	
	/*public void updateValues(List<Product> list,String upc,String manufacturer,String brand,
			String length,String height,String width,String weight,String size,String type)
	{
		Session session=sessionFactory.openSession();
		session.beginTransaction();
		
		for (int j = 0; j < list.size(); j++) 
		{
			Product temp=(Product)session.get(Product.class,list.get(j).getUpc());
			if(upc.length()>0)temp.setUpc(upc);
			if(manufacturer.length()>0)temp.setManufacturer(manufacturer);
			if(brand.length()>0)temp.setBrand(brand);
			if(length.length()>0)temp.getDimension().setLength(Integer.parseInt(length));
			if(height.length()>0)temp.getDimension().setHeight(Integer.parseInt(height));
			if(width.length()>0)temp.getDimension().setWidth(Integer.parseInt(width));
			if(weight.length()>0)temp.getDimension().setWeight(Integer.parseInt(weight));
			if(size.length()>0)temp.getInfo().setSize(Integer.parseInt(size));
			if(type.length()>0)temp.getInfo().setType(type);
			session.update(temp);
		}
		
		session.getTransaction().commit();
		session.close();
	}*/
	
	/*public void deleteValues(List<Product> list)
	{
		Session session=sessionFactory.openSession();
		session.beginTransaction();
		
		for(int i=0;i<list.size();i++)
		session.delete(list.get(i));			
		
		session.getTransaction().commit();
		session.close();
	}*/
	
	
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
	
	/*@RequestMapping(value = "/update", method = RequestMethod.GET)
	public String update(ModelMap model) {
		model.addAttribute("APP",app);
		model.addAttribute("backlink",backlink);
		return "update"; 
	}*/
	/*@RequestMapping(value = "/delete", method = RequestMethod.GET)
	public String delete(ModelMap model,
			@RequestParam(value="UPC")String UPC) {
		model.addAttribute("UPC",UPC);
		model.addAttribute("APP",app);
		model.addAttribute("backlink",backlink);
		return "delete"; 
	}*/
	
	@RequestMapping(value="/create.do", method=RequestMethod.GET)
	public String create(ModelMap model,
		@RequestParam(value="UPC") String UPC,
		@RequestParam(value="Manufacturer") String Manufacturer,
		@RequestParam(value="Brand") String Brand,
		@RequestParam(value="Length") String Length,
		@RequestParam(value="Height") String Height,
		@RequestParam(value="Width") String Width,
		@RequestParam(value="Weight") String Weight,
		@RequestParam(value="Size") String Size,
		@RequestParam(value="Type") String Type)
		
	
	{	String message=""; 
		insertValues(UPC,Manufacturer,Brand,Length,Height,Width,Weight,Size,Type);
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
			{try{insertValues(r(),r(),r(),r(),r(),r(),r(),r(),r());}catch(Exception e){}}
			
			
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
		@RequestParam(value="Length") String Length,
		@RequestParam(value="Height") String Height,
		@RequestParam(value="Width") String Width,
		@RequestParam(value="Weight") String Weight,
		@RequestParam(value="Size") String Size,
		@RequestParam(value="Type") String Type,
		@RequestParam(value="Length2") String Length2,
		@RequestParam(value="Height2") String Height2,
		@RequestParam(value="Width2") String Width2,
		@RequestParam(value="Weight2") String Weight2,
		@RequestParam(value="Size2") String Size2,
		@RequestParam(value="Page") String Page,
		@RequestParam(value="Delete", required=false) String delete,
		@RequestParam(value="Update", required=false) String update)
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
		if(update!=null)
		{/*Updates a record*/
			String data[]=update.split(";");
					
			Session session=sessionFactory.openSession();
			session.beginTransaction();
			
			Product product=(Product)session.get(Product.class, data[1]);
			switch(Integer.parseInt(data[0]))
			{	
				case 1:
					product.setManufacturer(data[2]);
					break;
				case 2:
					product.setBrand(data[2]);
					break;
			}
			session.update(product);
			
			session.getTransaction().commit();
			session.close();
		}
		
		String no_of_records=getPageCount(UPC,Manufacturer,Brand,Length,Height,Width,Weight,Size,Type,
				Length2,Height2,Width2,Weight2,Size2);
		
		long stats=System.currentTimeMillis();
		
		List<Product> list=searchValues(Page,UPC,Manufacturer,Brand,Length,Height,Width,Weight,Size,Type,
				Length2,Height2,Width2,Weight2,Size2);
		
		for(int i=0;i<list.size();i++)
			{String prod[]=list.get(i).getString().split(",");
			for(int j=0;j<9;j++)
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
	
	/*@RequestMapping(value="/update.do", method=RequestMethod.GET)
	public String update(ModelMap model,
		@RequestParam(value="UPC") String UPC,
		@RequestParam(value="Manufacturer") String Manufacturer,
		@RequestParam(value="Brand") String Brand,
		@RequestParam(value="Length") String Length,
		@RequestParam(value="Height") String Height,
		@RequestParam(value="Width") String Width,
		@RequestParam(value="Weight") String Weight,
		@RequestParam(value="Size") String Size,
		@RequestParam(value="Type") String Type,
		@RequestParam(value="UPC2") String UPC2,
		@RequestParam(value="Manufacturer2") String Manufacturer2,
		@RequestParam(value="Brand2") String Brand2,
		@RequestParam(value="Length2") String Length2,
		@RequestParam(value="Height2") String Height2,
		@RequestParam(value="Width2") String Width2,
		@RequestParam(value="Weight2") String Weight2,
		@RequestParam(value="Size2") String Size2,
		@RequestParam(value="Type2") String Type2)
	
	{	
		
		List<Product> list=searchValues(UPC,Manufacturer,Brand,Length,Height,Width,Weight,Size,Type);
		updateValues(list,UPC2,Manufacturer2,Brand2,Length2,Height2,Width2,Weight2,Size2,Type2);
		
		model.addAttribute("message","Records updated successfully");
		model.addAttribute("APP",app);
		model.addAttribute("backlink",backlink);
		return "index";		
	}*/
	
	
	/*@RequestMapping(value="/delete.do", method=RequestMethod.GET)
	public String delete(ModelMap model,
		@RequestParam(value="UPC") String UPC,
		@RequestParam(value="Manufacturer") String Manufacturer,
		@RequestParam(value="Brand") String Brand,
		@RequestParam(value="Length") String Length,
		@RequestParam(value="Height") String Height,
		@RequestParam(value="Width") String Width,
		@RequestParam(value="Weight") String Weight,
		@RequestParam(value="Size") String Size,
		@RequestParam(value="Type") String Type)
	
	{	
		List<Product> list=searchValues(UPC,Manufacturer,Brand,Length,Height,Width,Weight,Size,Type);
		
		deleteValues(list);
		
		model.addAttribute("message","Deleted successfully");
		model.addAttribute("APP",app);
		model.addAttribute("backlink",backlink);
		return "index";		
	}*/
	
	
	
	@RequestMapping(value = "*", method = {RequestMethod.GET,RequestMethod.POST} )
	public String redirect(ModelMap model) {
		
		model.addAttribute("APP",app);
		model.addAttribute("backlink",backlink);
		model.addAttribute("message","Page does not exist.");
		return "redirect"; 
	}
 
 
}