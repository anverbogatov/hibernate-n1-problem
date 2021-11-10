package com.anverbogatov.hibernaten1problem.dto;

import com.anverbogatov.hibernaten1problem.entity.Author;
import lombok.Data;

@Data
public class AuthorDto {
    private int id;

    private String name;

    public static AuthorDto from(Author a) {
        var author = new AuthorDto();
        author.setId(a.getId());
        author.setName(a.getName());
        return author;
    }
}
