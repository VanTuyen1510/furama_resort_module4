package com.example.furama_resort_module4.service.serviceType.impl;

import com.example.furama_resort_module4.entity.serviceFurama.ServiceType;
import com.example.furama_resort_module4.repository.ServiceTypeRepository;
import com.example.furama_resort_module4.service.serviceType.itf.ServiceTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServiceTypeServiceImpl implements ServiceTypeService {
    @Autowired
    private ServiceTypeRepository serviceTypeRepository;

    @Override
    public List<ServiceType> findAll() {
        return serviceTypeRepository.findAll();
    }

    @Override
    public ServiceType findById(Integer id) {
        return serviceTypeRepository.findById(id).get();
    }
}
