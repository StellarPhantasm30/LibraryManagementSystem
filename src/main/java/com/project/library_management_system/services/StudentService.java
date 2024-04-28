package com.project.library_management_system.services;

import org.springframework.stereotype.Service;

import com.project.library_management_system.models.Student;
import com.project.library_management_system.repositories.StudentRepository;

@Service
public class StudentService {

	private final StudentRepository studentRepository;

	public StudentService(StudentRepository studentRepository){
		this.studentRepository = studentRepository;
	}

	public void create(Student student) {
		studentRepository.save(student);
	}

	public Student find(int studentId) {
		return studentRepository.findById(studentId).orElse(null);
	}

	public void delete(int studentId) {
		studentRepository.deleteById(studentId);
	}
}
