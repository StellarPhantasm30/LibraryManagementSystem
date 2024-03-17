package com.project.LibraryManagementSystem.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.LibraryManagementSystem.models.Student;
import com.project.LibraryManagementSystem.repositories.StudentRepository;

@Service
public class StudentService {

	@Autowired
	StudentRepository studentRepository;

	public void create(Student student) {
		studentRepository.save(student);
	}
}