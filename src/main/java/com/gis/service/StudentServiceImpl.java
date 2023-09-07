package com.gis.service;

import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gis.dto.StudentDto;
import com.gis.entity.StudentEntity;
import com.gis.repo.StudentRepo;

@Service
public class StudentServiceImpl implements StudentService {
	@Autowired
	StudentRepo studentRepo;

	@Override
	public boolean saveStudent(StudentDto studentDto) {
		StudentEntity entity = new StudentEntity();
		BeanUtils.copyProperties(studentDto, entity);
		studentRepo.save(entity);

		return true;
	}

	@Override
	public StudentDto getStudentById(Integer id) {

		Optional<StudentEntity> findById = studentRepo.findById(id);

		if (findById.isPresent()) {
			StudentEntity studentEntity = findById.get();

			StudentDto dto = new StudentDto();

			BeanUtils.copyProperties(studentEntity, dto);

			return dto;

		}
		return null;
	}

}
