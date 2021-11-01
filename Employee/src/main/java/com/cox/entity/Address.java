package com.cox.entity;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

@Data
@RequiredArgsConstructor
@ToString
@Document(collection="Employee")
public class Address {
	private String area;
	private String city;
	private String state;
	private String pincode;
}
