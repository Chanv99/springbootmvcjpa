package com.chango.springbootmvcjpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.chango.springbootmvcjpa.model.Employee;

@Controller
public class HomeController {
	
	@Autowired()
	private EmployeeRepo repo;
	
	@RequestMapping("/")
	public String homepage()
	{
		return "index";
	}
	
	@RequestMapping("addEmployee")
	public String addEmployee(@ModelAttribute("result") Employee e)
	{
		repo.save(e);
		return "result";
	}
	@RequestMapping("getEmployee")
	public String getEmployee(@RequestParam("eid") int eid, Model m)
	{
		m.addAttribute("result",repo.getOne(eid));
		return "result";
	}
	@RequestMapping("getEmployeeByName")
	public String getEmployeeByName(@RequestParam("ename") String ename, Model m)
	{
		m.addAttribute("result",repo.findByEname(ename));
		return "result";
	}
	@RequestMapping("getEmployees")
	public String getEmployees(Model m)
	{
		m.addAttribute("result", repo.findAll());
		return "result";
	}

}
