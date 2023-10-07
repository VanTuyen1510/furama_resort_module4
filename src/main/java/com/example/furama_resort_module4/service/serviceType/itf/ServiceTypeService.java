package com.example.furama_resort_module4.service.serviceType.itf;

import com.example.furama_resort_module4.entity.serviceFurama.ServiceType;

import java.util.List;

public interface ServiceTypeService {
    List<ServiceType> findAll();
    ServiceType findById(Integer id);
}
