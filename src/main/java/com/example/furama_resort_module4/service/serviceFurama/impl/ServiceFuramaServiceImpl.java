package com.example.furama_resort_module4.service.serviceFurama.impl;

import com.example.furama_resort_module4.repository.service.ServiceRepository;
import com.example.furama_resort_module4.service.serviceFurama.itf.ServiceFuramaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ServiceFuramaServiceImpl implements ServiceFuramaService {
    @Autowired
    private ServiceRepository serviceRepository;

    @Override
    public List<com.example.furama_resort_module4.entity.serviceFurama.Service> findAll() {
        return serviceRepository.findAll();
    }

    @Override
    public Optional<com.example.furama_resort_module4.entity.serviceFurama.Service> findById(Integer id) {
        return serviceRepository.findById(id);
    }

    @Override
    public void update(com.example.furama_resort_module4.entity.serviceFurama.Service service) {
        serviceRepository.save(service);
    }


}
