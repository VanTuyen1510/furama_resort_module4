package com.example.furama_resort_module4.service.employee.itf;

import com.example.furama_resort_module4.entity.employeeFurama.Division;

import java.util.List;
import java.util.Optional;

public interface DivisionService {
    List<Division> findAll();
    Optional<Division> findById(Integer id);
}
