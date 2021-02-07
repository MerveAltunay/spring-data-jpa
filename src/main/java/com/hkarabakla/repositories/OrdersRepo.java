package com.hkarabakla.repositories;

import com.hkarabakla.entities.Orders;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface OrdersRepo extends CrudRepository<Orders, Integer> {


    List<Orders> findByUserName(String name);

}
