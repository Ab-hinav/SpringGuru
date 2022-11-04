package com.springGuruPrac.springwebApp5.bootstrap;

import com.springGuruPrac.springwebApp5.model.Author;
import com.springGuruPrac.springwebApp5.model.Book;
import com.springGuruPrac.springwebApp5.model.Publisher;
import com.springGuruPrac.springwebApp5.repository.AuthorRepository;
import com.springGuruPrac.springwebApp5.repository.BookRepository;
import com.springGuruPrac.springwebApp5.repository.PublisherRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class BootStrapData implements CommandLineRunner {

    AuthorRepository authorRepository;
    BookRepository bookRepository;
    PublisherRepository publisherRepository;

    public BootStrapData(AuthorRepository authorRepository, BookRepository bookRepository, PublisherRepository publisherRepository) {
        this.authorRepository = authorRepository;
        this.bookRepository = bookRepository;
        this.publisherRepository = publisherRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("Started in Bootstrap");

        Author eric = new Author("Eric", "Evans");
        Book ddd = new Book("Domain Driven Design", "123123");
        eric.getBooks().add(ddd);
        ddd.getAuthors().add(eric);

        authorRepository.save(eric);
        bookRepository.save(ddd);

        Author rod = new Author("Rod", "Johnson");
        Book noEJB = new Book("J2EE Development without EJB", "3939459459");
        rod.getBooks().add(noEJB);
        noEJB.getAuthors().add(rod);

        authorRepository.save(rod);
        bookRepository.save(noEJB);

        System.out.println("Number of Books: " + bookRepository.count());

        System.out.println("Creating publisher");
        Publisher publisher = new Publisher("SFG Publishing", "123 Main St", "St Petersburg", "FL", "12345");
        publisherRepository.save(publisher);
        Publisher publisher2 = new Publisher("SFG Publishing2", "123 Main St2", "St Petersburg2", "FL2", "123452");
        publisherRepository.save(publisher2);

        System.out.println("Number of Publishers: " + publisherRepository.count());

    }


}
