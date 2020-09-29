package com.jpa.demo.controller;

import com.jpa.demo.domain.test.entity.Customer;
import com.jpa.demo.domain.test.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("customer")
public class CustomerController {

    @Autowired
    private CustomerRepository customerRepository;

    @GetMapping("find")
    public Customer getCustomerById(@RequestParam(name = "id") Long id) {
        return customerRepository.findById(id).orElse(null);
    }

    @PostMapping("save")
    public Long save(@RequestParam(name = "name") String name,@RequestParam(name = "sex") boolean sex) {
        Customer customer = new Customer();
        customer.setFirstName(name);
        customer.setSex(sex);
        return customerRepository.save(customer).getId();
    }
}
