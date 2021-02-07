package com.hkarabakla.services;

import com.hkarabakla.entities.Author;
import com.hkarabakla.entities.Book;
import com.hkarabakla.entities.Category;
import com.hkarabakla.repositories.CategoryRepo;
import org.springframework.stereotype.Component;

import java.util.Collections;
import java.util.UUID;

@Component
public class CategoryService {

    private final CategoryRepo categoryRepo;

    public CategoryService(CategoryRepo categoryRepo) {
        this.categoryRepo = categoryRepo;
    }

    public void categoryOperations() {

        Book book1 = new Book();
        book1.setIsbn(UUID.randomUUID().toString());
        book1.setName("Spring in Action");

        Author author1 = new Author();
        author1.setName("Craig Walls");

        book1.setAuthors(Collections.singleton(author1));

        Category category1 = new Category();
        category1.setName("Computer Science");
        category1.setBooks(Collections.singletonList(book1));

        categoryRepo.save(category1);

        System.out.println(category1);

    }
}
