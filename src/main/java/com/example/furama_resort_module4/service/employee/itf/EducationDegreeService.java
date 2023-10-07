package com.example.furama_resort_module4.service.employee.itf;


import com.example.furama_resort_module4.entity.employeeFurama.EducationDegree;

import java.util.List;
import java.util.Optional;

public interface EducationDegreeService {
    List<EducationDegree> findAll();
    Optional<EducationDegree> findById(Integer id);
}
