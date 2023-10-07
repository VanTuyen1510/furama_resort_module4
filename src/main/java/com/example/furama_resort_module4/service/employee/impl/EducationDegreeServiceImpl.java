package com.example.furama_resort_module4.service.employee.impl;

import com.example.furama_resort_module4.entity.employeeFurama.EducationDegree;
import com.example.furama_resort_module4.repository.employee.EducationDegreeRepostiory;
import com.example.furama_resort_module4.service.employee.itf.EducationDegreeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EducationDegreeServiceImpl implements EducationDegreeService {
    @Autowired
    private EducationDegreeRepostiory educationDegreeRepostiory;

    @Override
    public List<EducationDegree> findAll() {
        return educationDegreeRepostiory.findAll();
    }

    @Override
    public Optional<EducationDegree> findById(Integer id) {
        return educationDegreeRepostiory.findById(id);
    }
}
