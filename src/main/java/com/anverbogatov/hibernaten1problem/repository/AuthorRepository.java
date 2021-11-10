package com.anverbogatov.hibernaten1problem.repository;

import com.anverbogatov.hibernaten1problem.entity.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author, Integer> {
}
