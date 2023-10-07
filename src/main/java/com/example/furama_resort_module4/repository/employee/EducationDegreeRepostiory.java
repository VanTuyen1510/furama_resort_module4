package com.example.furama_resort_module4.repository.employee;

import com.example.furama_resort_module4.entity.employeeFurama.EducationDegree;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EducationDegreeRepostiory extends JpaRepository<EducationDegree,Integer> {
}
