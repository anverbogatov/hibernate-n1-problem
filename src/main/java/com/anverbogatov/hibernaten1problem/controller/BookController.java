package com.anverbogatov.hibernaten1problem.controller;

import com.anverbogatov.hibernaten1problem.dto.BookDto;
import com.anverbogatov.hibernaten1problem.entity.Author;
import com.anverbogatov.hibernaten1problem.entity.Book;
import com.anverbogatov.hibernaten1problem.repository.AuthorRepository;
import com.anverbogatov.hibernaten1problem.repository.BookRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RequiredArgsConstructor
@RestController
@RequestMapping("/book")
public class BookController {

    private final BookRepository repository;

    private final AuthorRepository authorRepository;

    @GetMapping
    @Transactional(readOnly = true)
    public Iterable<BookDto> getAllBooks() {
        var books = new ArrayList<BookDto>();
        repository.findAll().forEach(b -> books.add(BookDto.from(b)));
        return books;
    }

    @PostMapping
    @Transactional
    public void initBooksColllection() {
        var a1 = new Author();
        a1.setName("Joshua Bloch");
        var a2 = new Author();
        a2.setName("Jane Doe");
        var a3 = new Author();
        a3.setName("Hasan Hazan");

        authorRepository.save(a1);
        authorRepository.save(a2);
        authorRepository.save(a3);

        var b1 = new Book();
        b1.setAuthor(a1);
        b1.setTitle("The history of Java");
        var b2 = new Book();
        b2.setAuthor(a2);
        b2.setTitle("The Earth is for Humans");
        var b3 = new Book();
        b3.setAuthor(a3);
        b3.setTitle("Kebab House");

        repository.save(b1);
        repository.save(b2);
        repository.save(b3);
    }
}
