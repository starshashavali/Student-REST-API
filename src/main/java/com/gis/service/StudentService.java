package com.gis.service;

import com.gis.dto.StudentDto;

public interface StudentService {
	
	public boolean saveStudent(StudentDto StudentDto);
	
	public StudentDto getStudentById(Integer id);

}
