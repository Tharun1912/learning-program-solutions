package com.library.service;

import com.library.repository.BookRepository;

public class BookService {
    private String serviceName;
    private BookRepository bookRepository;

    // Constructor Injection
    public BookService(String serviceName) {
        this.serviceName = serviceName;
    }

    // Setter Injection
    public void setBookRepository(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public void serve() {
        System.out.println("Service Name: " + serviceName);
        if (bookRepository != null) {
            bookRepository.fetchBooks();
        } else {
            System.out.println("BookRepository is not injected!");
        }
    }
}
