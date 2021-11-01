package com.cox.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.cox.entity.Employee;


public interface EmployeeDAO extends MongoRepository<Employee, String> {
	
	

}
