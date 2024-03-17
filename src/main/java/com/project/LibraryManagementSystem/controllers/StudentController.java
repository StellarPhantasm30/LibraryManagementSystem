package com.project.LibraryManagementSystem.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.project.LibraryManagementSystem.dtos.CreateStudentRequest;
import com.project.LibraryManagementSystem.services.StudentService;

@RestController
public class StudentController {

	@Autowired
	StudentService studentService;

	@PostMapping("/student")
	public void createStudent(@RequestBody CreateStudentRequest studentRequest) {
		studentService.create(studentRequest.to());
	}

	@GetMapping("/student")
	public void getStudent(@RequestParam("id") int studentId) {
		studentService.find(studentId);
	}

	@DeleteMapping
	public void deleteStudent(@RequestParam("id") int studentId) {

	}

}
