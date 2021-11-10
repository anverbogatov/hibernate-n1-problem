package com.anverbogatov.hibernaten1problem.dto;

import com.anverbogatov.hibernaten1problem.entity.Book;
import lombok.Data;

@Data
public class BookDto {
    private int id;

    private String title;

    private AuthorDto author;

    public static BookDto from(Book b) {
        var book = new BookDto();
        book.setId(b.getId());
        book.setTitle(b.getTitle());
        book.setAuthor(AuthorDto.from(b.getAuthor()));
        return book;
    }
}
