package com.gis.dto;

import org.springframework.stereotype.Component;

import lombok.Data;
@Component
@Data
public class StudentDto {
	
	private Integer studentId;
	
	private String studentName;
	
	private  String address;
}
