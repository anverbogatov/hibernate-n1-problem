package com.anverbogatov.hibernaten1problem.repository;

import com.anverbogatov.hibernaten1problem.entity.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book, Integer> {
}
