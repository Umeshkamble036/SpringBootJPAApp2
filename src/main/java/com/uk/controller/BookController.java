package com.uk.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.uk.bean.Book;
import com.uk.jpa.BookRepository;


@RestController
@RequestMapping("/bookhome")
public class BookController {
	@Autowired
	private BookRepository repository;

	@GetMapping("/")
	public String homepPage() {
		return "Home Page";
	}

	@PostMapping(path = "/add")
	public String addBook(@RequestParam String name, @RequestParam String description) {
		Book book = new Book();
		book.setName(name);
		book.setDescription(description);
		System.out.println("Name"+name);
		System.out.println("Name"+description);
		repository.save(book);

		return "Saved";
	}

	@GetMapping(path = "/allBook")
	public Iterable<Book> allBook() {

		return repository.findAll();
	}

}
