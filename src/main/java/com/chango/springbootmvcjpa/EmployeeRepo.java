package com.chango.springbootmvcjpa;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.chango.springbootmvcjpa.model.Employee;

public interface EmployeeRepo extends JpaRepository<Employee , Integer> {

	List<Employee> findByEname(String ename); //Query DSL domain-specific-language

}
