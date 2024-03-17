package com.project.LibraryManagementSystem.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.LibraryManagementSystem.models.Book;

public interface BookRepository extends JpaRepository<Book, Integer> {

}
