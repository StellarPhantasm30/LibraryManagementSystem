package com.project.LibraryManagementSystem.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.LibraryManagementSystem.models.Student;

public interface StudentRepository extends JpaRepository<Student, Integer> {

}
