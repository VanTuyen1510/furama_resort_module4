package com.example.furama_resort_module4.service.employee.impl;

import com.example.furama_resort_module4.entity.employeeFurama.Division;
import com.example.furama_resort_module4.repository.employee.DivisionRepository;
import com.example.furama_resort_module4.service.employee.itf.DivisionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DivisionServiceImpl implements DivisionService {
    @Autowired
    private DivisionRepository divisionRepository;

    @Override
    public List<Division> findAll() {
        return divisionRepository.findAll();
    }

    @Override
    public Optional<Division> findById(Integer id) {
        return divisionRepository.findById(id);
    }
}
