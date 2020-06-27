package com.example.demo.customer;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface CustomerRepository extends CrudRepository<Customer, Long> {
    List<Customer> findByFirstName(String firstName);
    List<Customer> findByLastNameContainingAndFirstNameContaining(String lastName, String firstName);

}