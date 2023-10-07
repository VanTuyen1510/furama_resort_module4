package com.example.furama_resort_module4.service.customer.itf;

import com.example.furama_resort_module4.entity.customerFurama.CustomerType;

import java.util.List;
import java.util.Optional;

public interface CustomerTypeService {
    List<CustomerType> findAll();

    Optional<CustomerType> findById(Integer id);
}
