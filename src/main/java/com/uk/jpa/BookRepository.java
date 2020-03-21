package com.uk.jpa;

import org.springframework.data.repository.CrudRepository;

import com.uk.bean.Book;

public interface BookRepository extends CrudRepository<Book, Integer> {
	
}
