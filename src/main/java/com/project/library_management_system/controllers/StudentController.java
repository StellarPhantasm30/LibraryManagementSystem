package com.project.library_management_system.controllers;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.project.library_management_system.dtos.CreateStudentRequest;
import com.project.library_management_system.models.Student;
import com.project.library_management_system.services.StudentService;

import jakarta.validation.Valid;

@RestController
public class StudentController {

	private final StudentService studentService;

	public StudentController(StudentService studentService){
		this.studentService = studentService;
	}

	@PostMapping("/student")
	public void createStudent(@RequestBody @Valid CreateStudentRequest studentRequest) {
		studentService.create(studentRequest.to());
	}

	@GetMapping("/student")
	public Student getStudent(@RequestParam("id") int studentId) {
		return studentService.find(studentId);
	}

	@DeleteMapping
	public void deleteStudent(@RequestParam("id") int studentId) {
		studentService.delete(studentId);
	}
}
