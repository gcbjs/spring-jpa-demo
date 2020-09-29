package com.jpa.demo.domain.test.repository;

import com.jpa.demo.domain.test.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer,Long> {
}
