package com.cox.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import com.cox.entity.Address;
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Document(collection="Employee")
public class Employee {
	
	@Id
	private String empId;
	
	private String empName;
	private long contactNo;
	private String email;
	private String bu;
	private Address address;

	
	
}
