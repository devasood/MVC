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
import java.net.URL;
import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.Collection;
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
	
	public JSONObject get(JSONObject temp,String a,String b,String c) throws Exception
	{
		return temp.getJSONObject(a).getJSONObject(b).getJSONObject(c);
	}
	public JSONObject get(JSONObject temp,String a,String b) throws Exception
	{
		return temp.getJSONObject(a).getJSONObject(b);
	}
	public JSONObject get(JSONObject temp,String a) throws Exception
	{
		return temp.getJSONObject(a);
	}
	
	@RequestMapping(value="/getItem", method=RequestMethod.GET)
	public String getItem(ModelMap model)
	{	
		
		try{

			String data=Jsoup.parse(new File("C:\\Users\\devashishs\\Desktop\\items1.xml"),"UTF-8").toString();
			
			JSONObject json=XML.toJSONObject(data);
			JSONArray itemList=json.getJSONObject("html").getJSONObject("body").getJSONObject("items")
			.getJSONArray("item");
			
			
			
			for (int i = 0; i < itemList.length(); i++) {
				
				Session session=sessionFactory.openSession();
				session.beginTransaction();			
				
				JSONObject item=itemList.getJSONObject(i);
				
				ItemType itemtype=new ItemType();
				
				itemtype.setId(item.getString("id"));
				itemtype.setStatus(item.getString("status"));
				itemtype.setName(item.getString("name"));
				itemtype.setMarketingDescription(item.getString("marketingdescription"));
				itemtype.setOtherDescription(item.getString("otherdescription"));
				try{
					Collection<Upc> upcs=new ArrayList<Upc>();
					Upc temp=new Upc();					
					temp.setUpc(item.getJSONObject("upcs").getJSONObject("upc").getString("content"));
					temp.setType(item.getJSONObject("upcs").getJSONObject("upc").getString("type"));
					
					upcs.add(temp);
					
					itemtype.setUpcs(upcs);
					}
				catch(Exception e){}
				try{
					Collection<Category> categories=new ArrayList<Category>();
					Category temp=new Category();					
					temp.setCategory(item.getJSONObject("categories").getJSONObject("category").getString("content"));
					temp.setType(item.getJSONObject("categories").getJSONObject("category").getString("type"));
					temp.setId(item.getJSONObject("categories").getJSONObject("category").getString("id"));
					
					categories.add(temp);
					
					itemtype.setCategories(categories);
					}
				catch(Exception e){}
				
				try{PackageData packageData=new PackageData();
					
					MeasurementType temp=new MeasurementType();
					
					String field="length";
					try{temp=new MeasurementType();
						temp.setMeasure(get(item,"packagedata",field).getDouble("measure"));
						temp.setUom(get(item,"packagedata",field).getString("uom"));
						packageData.setLength(temp);
						
					}catch(Exception e){}
					field="height";
					try{temp=new MeasurementType();
						temp.setMeasure(get(item,"packagedata",field).getDouble("measure"));
						temp.setUom(get(item,"packagedata",field).getString("uom"));
						packageData.setHeight(temp);
						
					}catch(Exception e){}
					field="width";
					try{temp=new MeasurementType();
						temp.setMeasure(get(item,"packagedata",field).getDouble("measure"));
						temp.setUom(get(item,"packagedata",field).getString("uom"));
						packageData.setWidth(temp);
						
					}catch(Exception e){}
					try{
						packageData.setUnitsInPackage(get(item,"packagedata").getInt("unitsinpackage"));
					}catch(Exception e){}
					try{
						packageData.getPackageType().setId(get(item,"packagedata","packagetype").getString("id"));
						packageData.getPackageType()
						.setContent(get(item,"packagedata","packagetype").getString("content"));
					}catch(Exception e){}					
					field="packagesize";
					try{temp=new MeasurementType();
						temp.setMeasure(get(item,"packagedata",field).getDouble("measure"));
						temp.setUom(get(item,"packagedata",field).getString("uom"));
						packageData.setPackageSize(temp);
						
					}catch(Exception e){}
					field="dryweight";
					try{temp=new MeasurementType();
						temp.setMeasure(get(item,"packagedata",field).getDouble("measure"));
						temp.setUom(get(item,"packagedata",field).getString("uom"));
						packageData.setDryWeight(temp);
						
					}catch(Exception e){}
					field="netweight";
					try{temp=new MeasurementType();
						temp.setMeasure(get(item,"packagedata",field).getDouble("measure"));
						temp.setUom(get(item,"packagedata",field).getString("uom"));
						packageData.setNetWeight(temp);
						
					}catch(Exception e){}
					try{
						packageData.setInformation(get(item,"packagedata").getString("information"));
					}catch(Exception e){}
					
					itemtype.setPackageData(packageData);
				}
				catch(Exception e){}
				
				try{
					Collection<Product> product=new ArrayList<Product>();
					Product temp=new Product();
					JSONObject prod=get(item,"products","product");
					
					
					temp.setSequence(prod.getInt("sequence"));
					temp.setId(prod.getString("id"));
					temp.setType(prod.getString("type"));
					
					temp.setDescription(prod.getString("description"));
					
					try{String val="distributor";
					ValueWithIdType tem=new ValueWithIdType();
					
						tem.setId(prod.getJSONObject(val).getString("id"));
						tem.setContent(prod.getJSONObject(val).getString("content"));
						
						temp.setDistributor(tem);
					}catch(Exception e){}
					
					try{String val="brand";
						ValueWithIdType tem=new ValueWithIdType();
						
						tem.setId(prod.getJSONObject(val).getString("id"));
						tem.setContent(prod.getJSONObject(val).getString("content"));
						
						temp.setBrand(tem);
					}catch(Exception e){}
					
					try{String val="manufacturer";
						ValueWithIdType tem=new ValueWithIdType();
						
						tem.setId(prod.getJSONObject(val).getString("id"));
						tem.setContent(prod.getJSONObject(val).getString("content"));
						
						temp.setManufacturer(tem);
					}catch(Exception e){}

					try{
						temp.setCountryOfOrigin(prod.getString("countryoforigin"));
					}catch(Exception e){}
					
					try{
						temp.setDirections(prod.getString("directions"));
					}catch(Exception e){}
					
					try{
						Grocery grocery=new Grocery();
						
						grocery.setIngredients(item.getJSONObject("products").getJSONObject("product")
								.getJSONObject("grocery").getString("ingredients"));
						
						temp.setGrocery(grocery);
					}catch(Exception e){}
					
					product.add(temp);
					
					itemtype.setProduct(product);
					
				}catch(Exception e){}
				
				try{
					CompanyType packageDistributor=new CompanyType();
					JSONObject temp=get(item,"packagedistributor");
					
					packageDistributor.setName(temp.getString("name"));
					packageDistributor.setAddress(temp.getString("address"));
					packageDistributor.setEmail(temp.getString("email"));
					packageDistributor.setPhone(temp.getString("phone"));
					packageDistributor.setUrl(temp.getString("url"));
					
					itemtype.setPackageDistributor(packageDistributor);
				}catch(Exception e){}
				
				try{
					CompanyType packageManufacturer=new CompanyType();
					JSONObject temp=get(item,"packagemanufacturer");
					
					packageManufacturer.setName(temp.getString("name"));
					packageManufacturer.setAddress(temp.getString("address"));
					packageManufacturer.setEmail(temp.getString("email"));
					packageManufacturer.setPhone(temp.getString("phone"));
					packageManufacturer.setUrl(temp.getString("url"));
					
					itemtype.setPackageManufacturer(packageManufacturer);
				}catch(Exception e){}
				
				try{
					ValueWithIdType attribute=new ValueWithIdType();
					JSONObject temp=item.getJSONObject("attributes").getJSONObject("attribute");
					attribute.setId(temp.getString("name"));
					attribute.setContent(temp.getString("value"));
					
					itemtype.setAttribute(attribute);					
				}catch(Exception e){}
				
				
				
				
				
				session.save(itemtype);
				
				
				
				session.getTransaction().commit();
				session.close();
				
				
//				try{					
//					JSONArray temp2=temp.getJSONObject("categories").getJSONArray("category");
//					for(int j=0;j<temp2.length();j++)
//					{
//						item.getCategories().add(temp2.getJSONObject(j).getString("content"));
//					}
//				}catch(Exception e){item.getUpcs()
//					.add(temp.getJSONObject("categories").getJSONObject("category").getString("content"));}
//				
				
				
			}			
			
			
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