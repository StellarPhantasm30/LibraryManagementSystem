package com.project.library_management_system.models;

import java.util.Date;
import java.util.List;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.Entity;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class Book {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	private String name;

	@Enumerated // (value = EnumType.STRING)
	private Genre genre;

	@CreationTimestamp
	private Date createdOn;

	@UpdateTimestamp
	private Date updatedOn;

	@ManyToOne
	@JoinColumn
	@JsonIgnoreProperties({ "bookList" })
	private Author myAuthor;

	@ManyToOne
	@JoinColumn
	@JsonIgnoreProperties({ "studentList" })
	private Student student;

	@OneToMany(mappedBy = "book")
	@JsonIgnoreProperties({ "book" }) // different from gfg
	private List<Transaction> transactionList;
}
