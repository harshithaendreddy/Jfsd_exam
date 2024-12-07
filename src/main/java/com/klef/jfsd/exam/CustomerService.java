package com.klef.jfsd.exam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class CustomerService {

    @Autowired
    private CustomerRepository customerRepository;

    // Method to fetch all customers
    public List<Customer> getAllCustomers() {
        return customerRepository.findAll();
    }

    // Method to add a new customer
    public Customer addCustomer(Customer customer) {
        return customerRepository.save(customer);
    }
}
