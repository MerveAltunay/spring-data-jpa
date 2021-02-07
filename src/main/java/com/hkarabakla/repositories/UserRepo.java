package com.hkarabakla.repositories;

import com.hkarabakla.entities.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepo extends CrudRepository<User, Integer> {

    User findByName(String name);




}
