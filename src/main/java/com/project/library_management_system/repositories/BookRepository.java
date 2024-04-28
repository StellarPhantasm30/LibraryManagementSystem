package com.project.library_management_system.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.project.library_management_system.models.Book;
import com.project.library_management_system.models.Genre;

public interface BookRepository extends JpaRepository<Book, Integer> {

	List<Book> findByGenre(Genre genre);

	@Query("Select b from Book b, Author a where b.my_author.id = a.id and a.name = ?1")
	List<Book> findByAuthorName(String authorName);

	List<Book> findByName(String bookName);

}
