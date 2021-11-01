package com.cox.service;

import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.cox.dao.EmployeeDAO;
import com.cox.entity.Employee;

import lombok.extern.slf4j.Slf4j;


@Service
@Slf4j
public class EmployeeServiceImpl implements EmployeeService{
	
	Logger log=LoggerFactory.getLogger(EmployeeServiceImpl.class);


	 @Autowired 
	private EmployeeDAO dao;
	 
	@Override
	public List<Employee> getEmployees() {
		log.error("GetEmployees() method executed");
		return dao.findAll();
	}

	@Override
	public Optional<Employee> getEmployee(String empId) {
		log.error("GetEmployee() method executed");
		
		return dao.findById(empId);
	}

	@Override
	public Employee saveEmployee(Employee employee) {
		log.error("SaveEmployees() method executed");
		return dao.save(employee);
	}
}