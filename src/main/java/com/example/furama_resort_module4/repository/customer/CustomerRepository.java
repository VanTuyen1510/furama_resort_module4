package com.example.furama_resort_module4.repository.customer;

import com.example.furama_resort_module4.entity.customerFurama.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CustomerRepository extends JpaRepository<Customer,Integer> {
    List<Customer> findAllByStatusIsTrue();
}
