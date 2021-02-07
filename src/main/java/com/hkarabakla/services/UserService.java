package com.hkarabakla.services;

import com.hkarabakla.entities.Address;
import com.hkarabakla.entities.User;
import com.hkarabakla.repositories.UserRepo;
import org.springframework.stereotype.Component;


@Component
public class UserService {

    private final UserRepo repo;

    public UserService(UserRepo repo) {

        this.repo = repo;

    }

    public void userOperations() {

        User u1 = new User();
        u1.setName("user1");

        Address address1 = new Address();
        address1.setStreet("Gazo sokak");
        address1.setNumber("7");
        address1.setCity("Istanbul");

        u1.setAddress(address1);

        repo.save(u1);

        System.out.println(u1);

        User u2 = new User();
        u2.setName("user2");

        Address address2 = new Address();
        address2.setStreet("Yigitler sokak");
        address2.setNumber("5");
        address2.setCity("Ankara");
        address2.setZipcode(06010);

        u2.setAddress(address2);

        repo.save(u2);

        User u3 = new User();
        u3.setName("user3");

        Address address3 = new Address();
        address3.setStreet("Karsıyaka sokak");
        address3.setNumber("10");
        address3.setCity("Izmir");

        u3.setAddress(address3);

        repo.save(u3);

        System.out.println(repo.findByName("user3"));





    }
}
