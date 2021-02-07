package com.hkarabakla.services;

import com.hkarabakla.entities.Author;
import com.hkarabakla.repositories.AuthorRepo;
import org.springframework.stereotype.Component;

@Component
public class AuthorService {

    private final AuthorRepo authorRepo;

    public AuthorService(AuthorRepo authorRepo) {
        this.authorRepo = authorRepo;
    }

    public void authorOperations() {

        Author author1 = new Author();
        author1.setName("Herbert Schildt");

        authorRepo.save(author1);

        System.out.println(authorRepo.findByName("Herbert Schildt"));



    }
}
