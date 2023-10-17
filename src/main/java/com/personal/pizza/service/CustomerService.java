package com.personal.pizza.service;

import com.personal.pizza.persistence.entity.CustomerEntity;
import com.personal.pizza.persistence.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {
    private final CustomerRepository customerRepository;

    @Autowired
    public CustomerService(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    public CustomerEntity finnByPhone(String phone){
        return this.customerRepository.findByPhone(phone);
    }
}
