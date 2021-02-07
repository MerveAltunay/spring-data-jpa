package com.hkarabakla.services;

import com.hkarabakla.entities.Address;
import com.hkarabakla.repositories.AddressRepo;
import org.springframework.stereotype.Component;


@Component
public class AddressService {

    private final AddressRepo addressRepo;

    public AddressService(AddressRepo addressRepo) {
        this.addressRepo = addressRepo;
    }

    public void addressOperations() {

        Address address=new Address();
        address.setNumber("1");

    }
}
