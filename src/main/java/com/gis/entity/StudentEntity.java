package com.gis.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class StudentEntity {
	@Id
	@GeneratedValue
	private Integer studentId;
	
	private String studentName;
	
	private  String address;
	
}
