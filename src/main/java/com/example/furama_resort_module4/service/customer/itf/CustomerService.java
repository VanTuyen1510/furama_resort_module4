package com.example.furama_resort_module4.service.customer.itf;

import com.example.furama_resort_module4.entity.customerFurama.Customer;
import com.example.furama_resort_module4.entity.employeeFurama.Employee;

import java.util.List;
import java.util.Optional;

public interface CustomerService {
    List<Customer> findAll();
    Optional<Customer> findById(Integer id);
    void create(Customer customer);
    void update(Customer customer);
    void delete(Integer id);
    List<Customer> findAllByStatus();

}
