package com.example.furama_resort_module4.service.serviceFurama.itf;

import com.example.furama_resort_module4.entity.serviceFurama.Service;

import java.util.List;
import java.util.Optional;

public interface ServiceFuramaService {
    List<Service> findAll();
    Optional<Service> findById(Integer id);
    void update(Service service);
}
