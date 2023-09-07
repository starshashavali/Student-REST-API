package com.gis.restcontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.gis.dto.StudentDto;
import com.gis.service.StudentService;

@RestController
public class StudentRestController {
	@Autowired
	StudentService studentService;
	@Autowired
	


	@PostMapping("/saveStudent")
	public ResponseEntity<String> saveStudent(@RequestBody StudentDto StudentDto) {
		boolean saveStudent = studentService.saveStudent(StudentDto);
		if (saveStudent) {
			return new ResponseEntity<>(HttpStatus.CREATED);
		}
		return new ResponseEntity<>(HttpStatus.BAD_REQUEST);

	}

	@GetMapping("/getById/{id}")
	public ResponseEntity<StudentDto> getStudentById(@PathVariable Integer id) {
	 StudentDto studentById = studentService.getStudentById(id);
		return new ResponseEntity<StudentDto>(studentById,HttpStatus.OK);
	}

}
