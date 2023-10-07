package com.example.furama_resort_module4.service.customer.impl;

import com.example.furama_resort_module4.entity.customerFurama.CustomerType;
import com.example.furama_resort_module4.repository.customer.CustomerTypeRepository;
import com.example.furama_resort_module4.service.customer.itf.CustomerTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CustomerTypeServiceImpl implements CustomerTypeService {
    @Autowired
    private CustomerTypeRepository customerTypeRepository;


    @Override
    public List<CustomerType> findAll() {
        return customerTypeRepository.findAll();
    }

    @Override
    public Optional<CustomerType> findById(Integer id) {
        return customerTypeRepository.findById(id);
    }
}
