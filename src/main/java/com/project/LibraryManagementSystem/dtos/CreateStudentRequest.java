package com.project.LibraryManagementSystem.dtos;

import com.project.LibraryManagementSystem.models.Student;

import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CreateStudentRequest {

	@NotBlank
	private String name;

	@NotBlank
	private String email;

	private Integer age;

	public Student to() {
		return Student.builder().name(this.name).email(this.email).age(this.age).build();
	}
}
