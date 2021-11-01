package com.cox.service;


import java.util.List;
import java.util.Optional;

import com.cox.entity.Employee;


public interface EmployeeService {

	public List<Employee> getEmployees();

	public Optional<Employee> getEmployee(String empId);
	
	public Employee saveEmployee(Employee employee) ;
	
	
}