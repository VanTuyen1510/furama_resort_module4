package com.example.furama_resort_module4.service.customer.impl;

import com.example.furama_resort_module4.entity.customerFurama.Customer;
import com.example.furama_resort_module4.entity.employeeFurama.Employee;
import com.example.furama_resort_module4.repository.customer.CustomerRepository;
import com.example.furama_resort_module4.service.customer.itf.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

@Service
public class CustomerServiceImpl implements CustomerService {
    @Autowired
    private CustomerRepository customerRepository;

    @Override
    public List<Customer> findAll() {
        return customerRepository.findAll();
    }

    @Override
    public Optional<Customer> findById(Integer id) {
        return customerRepository.findById(id);
    }

    @Override
    public void create(Customer customer) {
        customer.setStatus(true);
        customerRepository.save(customer);
    }

    @Override
    public void update(Customer customer) {
        customerRepository.save(customer);
    }

    @Override
    public void delete(Integer id) {
       Customer customer = customerRepository.findById(id).orElse(null);
       if(Objects.nonNull(customer)){
           customer.setStatus(true);
           customerRepository.save(customer);
       }


//        customerRepository.deleteById(id);
    }

    @Override
    public List<Customer> findAllByStatus() {
        List<Customer> customerList = customerRepository.findAllByStatusIsTrue();
        return customerList;
    }
}
