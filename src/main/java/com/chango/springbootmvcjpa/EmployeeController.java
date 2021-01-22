package com.chango.springbootmvcjpa;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.chango.springbootmvcjpa.model.Employee;

@RestController
public class EmployeeController {
	
	@Autowired()
	private EmployeeRepo repo;
	
	@RequestMapping("employees")
//	@ResponseBody
	public List<Employee> getEmployees()
	{
		List<Employee> employees = repo.findAll();
		return employees;
	}
	
	@GetMapping("employee/{eid}")
//	@ResponseBody
	public Employee getEmployee(@PathVariable("eid") int eid)
	{
		Employee employee = repo.findById(eid).orElse(new Employee(0,""));
		return employee;
	}
	
	@PostMapping("employee")
	public Employee addEmployee(Employee employee)
	{
		repo.save(employee);
		return employee;
	}
	
}
