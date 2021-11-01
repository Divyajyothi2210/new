package com.cox.Controller;
import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cox.entity.Employee;
import com.cox.service.EmployeeService;
import com.cox.service.EmployeeServiceImpl;

import lombok.extern.slf4j.Slf4j;


@CrossOrigin(origins = "http://localhost:4200")
@Slf4j
@RestController
@RequestMapping("/employee")
public class EmployeeController {
	
	Logger log=LoggerFactory.getLogger(EmployeeController.class);
	
	@Autowired
    private EmployeeService service;
	
	@GetMapping("/getAllEmployees")
	public List<Employee> getEmployees()
	{		
		log.error("GetEmployees() method executed");
			return service.getEmployees();					
	}
	
	@GetMapping("/getEmployee/{empId}")
	public Optional<Employee> getEmployee(@PathVariable String empId) {
		log.error("GetEmployee() method executed");
		return service.getEmployee(empId);
	}
	
	@PostMapping("/addEmployee")
	public Employee saveEmployee(@RequestBody Employee employee) 
	{
		log.error("SaveEmployees() method executed");
		return service.saveEmployee(employee);
		}

}