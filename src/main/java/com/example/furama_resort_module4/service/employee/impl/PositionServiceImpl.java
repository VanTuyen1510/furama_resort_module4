package com.example.furama_resort_module4.service.employee.impl;

import com.example.furama_resort_module4.entity.employeeFurama.Position;
import com.example.furama_resort_module4.repository.employee.PositionRepository;
import com.example.furama_resort_module4.service.employee.itf.PositionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PositionServiceImpl implements PositionService {
    @Autowired
    private PositionRepository positionRepository;

    @Override
    public List<Position> findAll() {
        return positionRepository.findAll();
    }

    @Override
    public Optional<Position> findById(Integer id) {
        return positionRepository.findById(id);
    }
}
