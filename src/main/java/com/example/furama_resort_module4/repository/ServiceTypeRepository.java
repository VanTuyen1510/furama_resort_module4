package com.example.furama_resort_module4.repository;

import com.example.furama_resort_module4.entity.serviceFurama.ServiceType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ServiceTypeRepository extends JpaRepository<ServiceType,Integer> {
}
