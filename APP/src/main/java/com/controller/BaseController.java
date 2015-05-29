package com.controller;
 
//import java.sql.Statement;
//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.ResultSet;
//import org.json.JSONArray;
//import org.json.JSONObject;
//import org.slf4j.LoggerFactory;
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