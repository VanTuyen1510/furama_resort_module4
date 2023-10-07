package com.example.furama_resort_module4.repository.service;

import com.example.furama_resort_module4.entity.serviceFurama.Service;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ServiceRepository extends JpaRepository<Service,Integer> {
}
