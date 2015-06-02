package com.controller;
 
//import java.sql.Statement;
//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.ResultSet;
//import org.json.JSONArray;
//import org.json.JSONObject;
//import org.slf4j.LoggerFactory;


import java.io.File;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Random;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.ImprovedNamingStrategy;
import org.hibernate.criterion.Order;
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
	
	private void insertValues(String a,String b,String c,String d,String e,String f,String g,String h,String i)
	{	
		Product product=new Product();
		product.setUpc(a);	
		product.setManufacturer(b);
		product.setBrand(c);
		Dimension dim=product.getDimension();
		dim.setLength(Integer.parseInt(d));
		dim.setHeight(Integer.parseInt(e));
		dim.setWidth(Integer.parseInt(f));
		dim.setWeight(Integer.parseInt(g));
		
		Info info=product.getInfo();
		info.setSize(Integer.parseInt(h));
		info.setType(i);
		
		
		Session session=sessionFactory.openSession();
		session.beginTransaction();
		
		session.save(product);
		
		session.getTransaction().commit();
		session.close();
	}
	
	private List<Product> searchValues(String page,String a,String b,String c,
			String d,String e,String f,String g,String h,String i,
			String k,String m,String n,String o,String p)
	{	String ax[][]=new String[10][9];
		Session session=sessionFactory.openSession();
		
		if(d.length()==0)d="0";
		if(e.length()==0)e="0";
		if(f.length()==0)f="0";
		if(g.length()==0)g="0";
		if(h.length()==0)h="0";
		if(k.length()==0)k=""+Integer.MAX_VALUE;
		if(m.length()==0)m=""+Integer.MAX_VALUE;
		if(n.length()==0)n=""+Integer.MAX_VALUE;
		if(o.length()==0)o=""+Integer.MAX_VALUE;
		if(p.length()==0)p=""+Integer.MAX_VALUE;
		
		
		Criteria criteria=session.createCriteria(Product.class);
		criteria.add(Restrictions.like("upc", "%"+a+"%"))
				.add(Restrictions.like("manufacturer", "%"+b+"%"))
				.add(Restrictions.like("brand", "%"+c+"%"))
				.add(Restrictions.ge("dimension.length", Integer.parseInt(d)))
				.add(Restrictions.ge("dimension.height", Integer.parseInt(e)))
				.add(Restrictions.ge("dimension.width", Integer.parseInt(f)))
				.add(Restrictions.ge("dimension.weight", Integer.parseInt(g)))
				.add(Restrictions.ge("info.size", Integer.parseInt(h)))
				.add(Restrictions.le("dimension.length", Integer.parseInt(k)))
				.add(Restrictions.le("dimension.height", Integer.parseInt(m)))
				.add(Restrictions.le("dimension.width", Integer.parseInt(n)))
				.add(Restrictions.le("dimension.weight", Integer.parseInt(o)))
				.add(Restrictions.le("info.size", Integer.parseInt(p)))
				.add(Restrictions.like("info.type", "%"+i+"%"))
				.addOrder(Order.asc("upc"));
		
		
		criteria.setFirstResult(Integer.parseInt(page)*10);
		criteria.setFetchSize(10);
		criteria.setCacheable(true);
		
		
		List<Product> list=(List<Product>)criteria.list();
		
		session.close();
		
		return list;
		
	}
	
	private List<Product> searchValues(String a,String b,String c,
			String d,String e,String f,String g,String h,String i)
	{	String ax[][]=new String[10][9];
		Session session=sessionFactory.openSession();
		
		if(d.length()==0)d="0";
		if(e.length()==0)e="0";
		if(f.length()==0)f="0";
		if(g.length()==0)g="0";
		if(h.length()==0)h="0";
		
		
		Criteria criteria=session.createCriteria(Product.class);
		criteria.add(Restrictions.like("upc", "%"+a+"%"))
				.add(Restrictions.like("manufacturer", "%"+b+"%"))
				.add(Restrictions.like("brand", "%"+c+"%"))
				.add(Restrictions.ge("dimension.length", Integer.parseInt(d)))
				.add(Restrictions.ge("dimension.height", Integer.parseInt(e)))
				.add(Restrictions.ge("dimension.width", Integer.parseInt(f)))
				.add(Restrictions.ge("dimension.weight", Integer.parseInt(g)))
				.add(Restrictions.ge("info.size", Integer.parseInt(h)))
				.add(Restrictions.like("manufacturer", "%"+i+"%"))
				.addOrder(Order.asc("upc"));
		
		criteria.setCacheable(true);
		
		
		List<Product> list=(List<Product>)criteria.list();
		
		session.close();
		
		return list;
		
	}

	public String r()
	{	Random r=new Random();
		return ""+r.nextInt(1000000);
	}
	
	public void updateValues(List<Product> list,String a,String b,String c,
			String d,String e,String f,String g,String h,String i)
	{
		Session session=sessionFactory.openSession();
		session.beginTransaction();
		
		for (int j = 0; j < list.size(); j++) 
		{
			Product temp=(Product)session.get(Product.class,list.get(j).getUpc());
			if(a.length()>0)temp.setUpc(a);
			if(b.length()>0)temp.setManufacturer(b);
			if(c.length()>0)temp.setBrand(c);
			if(d.length()>0)temp.getDimension().setLength(Integer.parseInt(d));
			if(e.length()>0)temp.getDimension().setHeight(Integer.parseInt(e));
			if(f.length()>0)temp.getDimension().setWidth(Integer.parseInt(f));
			if(g.length()>0)temp.getDimension().setWeight(Integer.parseInt(g));
			if(h.length()>0)temp.getInfo().setSize(Integer.parseInt(h));
			if(i.length()>0)temp.getInfo().setType(i);
			session.update(temp);
		}
		
		session.getTransaction().commit();
		session.close();
	}
	
	public void deleteValues(List<Product> list)
	{
		Session session=sessionFactory.openSession();
		session.beginTransaction();
		
		for(int i=0;i<list.size();i++)
		session.delete(list.get(i));			
		
		session.getTransaction().commit();
		session.close();
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
	
	@RequestMapping(value="/create.do", method=RequestMethod.GET)
	public String create(ModelMap model,
		@RequestParam(value="UPC") String UPC,
		@RequestParam(value="Manufacturer") String Manf,
		@RequestParam(value="Brand") String Brand,
		@RequestParam(value="Length") String Length,
		@RequestParam(value="Height") String Height,
		@RequestParam(value="Width") String Width,
		@RequestParam(value="Weight") String Weight,
		@RequestParam(value="Size") String Size,
		@RequestParam(value="Type") String Type)
	
	{	
		insertValues(UPC,Manf,Brand,Length,Height,Width,Weight,Size,Type);
		
		model.addAttribute("message","Inserted successfully");
		model.addAttribute("APP",app);
		model.addAttribute("backlink",backlink);
		return "redirect";		
	}
	
	@RequestMapping(value="/create.random", method=RequestMethod.GET)
	public String createRandom(ModelMap model)
		
		{	
			for(int i=0;i<10000;i++)
			{try{insertValues(r(),r(),r(),r(),r(),r(),r(),r(),r());}catch(Exception e){}}
			
			
			model.addAttribute("message","Random Inserted successfully");
			model.addAttribute("APP",app);
			model.addAttribute("backlink",backlink);
			return "redirect";		
		}
	
	@RequestMapping(value="/search", method=RequestMethod.GET)
	public String searchResult(ModelMap model,
		@RequestParam(value="UPC") String UPC,
		@RequestParam(value="Manufacturer") String Manf,
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
		@RequestParam(value="Page") String Page)
		{
		List<Product> list=searchValues(Page,UPC,Manf,Brand,Length,Height,Width,Weight,Size,Type,
				Length2,Height2,Width2,Weight2,Size2);
		for(int i=0;i<list.size();i++)
			{String prod[]=list.get(i).getString().split(",");
			for(int j=0;j<9;j++)
			model.addAttribute("s"+i+j,prod[j]);
			}
		model.addAttribute("APP",app);
		model.addAttribute("backlink",backlink);
		return "read";		
	}
	
	@RequestMapping(value="/update.do", method=RequestMethod.GET)
	public String update(ModelMap model,
		@RequestParam(value="UPC") String UPC,
		@RequestParam(value="Manufacturer") String Manf,
		@RequestParam(value="Brand") String Brand,
		@RequestParam(value="Length") String Length,
		@RequestParam(value="Height") String Height,
		@RequestParam(value="Width") String Width,
		@RequestParam(value="Weight") String Weight,
		@RequestParam(value="Size") String Size,
		@RequestParam(value="Type") String Type,
		@RequestParam(value="UPC2") String UPC2,
		@RequestParam(value="Manufacturer2") String Manf2,
		@RequestParam(value="Brand2") String Brand2,
		@RequestParam(value="Length2") String Length2,
		@RequestParam(value="Height2") String Height2,
		@RequestParam(value="Width2") String Width2,
		@RequestParam(value="Weight2") String Weight2,
		@RequestParam(value="Size2") String Size2,
		@RequestParam(value="Type2") String Type2)
	
	{	
		List<Product> list=searchValues(UPC,Manf,Brand,Length,Height,Width,Weight,Size,Type);
		updateValues(list,UPC2,Manf2,Brand2,Length2,Height2,Width2,Weight2,Size2,Type2);
		
		model.addAttribute("message","Records updated successfully");
		model.addAttribute("APP",app);
		model.addAttribute("backlink",backlink);
		return "redirect";		
	}
	
	
	@RequestMapping(value="/delete.do", method=RequestMethod.GET)
	public String delete(ModelMap model,
		@RequestParam(value="UPC") String UPC,
		@RequestParam(value="Manufacturer") String Manf,
		@RequestParam(value="Brand") String Brand,
		@RequestParam(value="Length") String Length,
		@RequestParam(value="Height") String Height,
		@RequestParam(value="Width") String Width,
		@RequestParam(value="Weight") String Weight,
		@RequestParam(value="Size") String Size,
		@RequestParam(value="Type") String Type)
	
	{	
		List<Product> list=searchValues(UPC,Manf,Brand,Length,Height,Width,Weight,Size,Type);
		
		deleteValues(list);
		
		model.addAttribute("message","Deleted successfully");
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