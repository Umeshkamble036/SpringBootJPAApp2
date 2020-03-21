package com.uk;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.repository.support.Repositories;

import com.uk.bean.Book;
import com.uk.jpa.BookRepository;

@SpringBootApplication
public class SpringBootJpaApp2Application {

	private static final Logger log = LoggerFactory.getLogger(SpringBootJpaApp2Application.class);

	public static void main(String[] args) {
		SpringApplication.run(SpringBootJpaApp2Application.class, args);
	}
	
	@Bean
	public CommandLineRunner test(BookRepository repository) {
		return (args) -> {
//			Book b1 = new Book();
//			Book b2 = new Book();
//			b1.setName("First Book");
//			b2.setName("Second Book");
//			b1.setDescription("This is my first book description");
//			b2.setDescription("This is my second book description");
//			// save both the books
//			repository.save(b1);
//			repository.save(b2);
			log.info("Book Repoistory Information as follows");
			log.info("--------------------------------------------------------------");
			// get list of all book
			for (Book book : repository.findAll()) {
				log.info(book.toString());
			}
			log.info("");

		};

	}
}
