package com.codegym.cms.service.Impl;

import com.codegym.cms.model.Customer;
import com.codegym.cms.repository.CustomerRepository;
import com.codegym.cms.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class CustomerServiceImpl implements CustomerService {
    @Autowired
    private CustomerRepository customerRopository;
    @Override
    public List<Customer> findAll() {
        return customerRopository.findAll();
    }

    @Override
    public Customer findById(Long id) {
        return customerRopository.findById(id);
    }

    @Override
    public void save(Customer customer) {
        customerRopository.save(customer);

    }

    @Override
    public void remove(Long id) {
        customerRopository.remove(id);

    }
}
