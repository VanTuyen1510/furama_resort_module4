package com.example.furama_resort_module4.service.employee.itf;

import com.example.furama_resort_module4.entity.employeeFurama.Position;

import java.util.List;
import java.util.Optional;

public interface PositionService {
    List<Position> findAll();
    Optional<Position> findById(Integer id);
}
