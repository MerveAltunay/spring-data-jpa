package com.hkarabakla.services;

import com.hkarabakla.entities.*;
import com.hkarabakla.repositories.OrdersRepo;
import org.springframework.stereotype.Component;

import java.sql.Timestamp;
import java.util.Collections;
import java.util.UUID;

@Component
public class OrdersService {

    private final OrdersRepo ordersRepo;

    public OrdersService(OrdersRepo ordersRepo) {
        this.ordersRepo = ordersRepo;
    }

    public void ordersOperations() {

        Author author1 = new Author();
        author1.setName("Joshua Bloch");

        Book book1 = new Book();
        book1.setName("Effective Java");
        book1.setIsbn(UUID.randomUUID().toString());
        book1.setAddedDate(Timestamp.valueOf("2008-05-03 09:01:15"));
        book1.setImageUrl("www.bookimage.com");
        book1.setAuthors(Collections.singleton(author1));
        book1.setPrice(28.25);

        Category category1 = new Category();
        category1.setName("Computer Programming");

        category1.setBooks(Collections.singletonList(book1));

        Address address1 = new Address();
        address1.setCity("Ankara");
        address1.setStreet("Menekse sokak");
        address1.setZipcode(06445);
        address1.setNumber("8");

        User user1 = new User();
        user1.setName("user1");
        user1.setAddress(address1);


        Orders orders1 = new Orders();
        orders1.setCreated_at(Timestamp.valueOf("2020-11-11 04:25:56"));
        orders1.setTotal(28.25);
        orders1.setUser(user1);

        book1.setOrders(Collections.singleton(orders1));

        orders1.setBooks(Collections.singleton(book1));

        ordersRepo.save(orders1);


        System.out.println(ordersRepo.findByUserName("user1"));


    }
}
