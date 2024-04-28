package com.project.library_management_system;

import com.project.library_management_system.controllers.AdminController;
import com.project.library_management_system.controllers.BookController;
import com.project.library_management_system.controllers.StudentController;
import com.project.library_management_system.controllers.TransactionController;
import com.project.library_management_system.dtos.CreateAdminRequest;
import com.project.library_management_system.dtos.CreateBookRequest;
import com.project.library_management_system.dtos.CreateStudentRequest;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class LibraryManagementSystemApplicationTests {

	private AdminController adminController;
	private BookController bookController;
	private StudentController studentController;
	private TransactionController transactionController;

	public void LibraryManagementSystemApplication(AdminController adminController, BookController bookController, StudentController studentController, TransactionController transactionController){
		this.adminController = adminController;
		this.bookController = bookController;
		this.studentController = studentController;
		this.transactionController = transactionController;
	}

	@Test
	void contextLoads() {
		Assertions.assertThat(adminController).isNotNull();
		Assertions.assertThat(bookController).isNotNull();
		Assertions.assertThat(studentController).isNotNull();
		Assertions.assertThat(transactionController).isNotNull();
	}

}
