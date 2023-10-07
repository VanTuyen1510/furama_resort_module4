package com.example.furama_resort_module4.service.employee.itf;

import com.example.furama_resort_module4.entity.employeeFurama.Employee;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;
import java.util.Optional;

public interface EmployeeService {
    List<Employee> findAll();
    Optional<Employee> findById(Integer id);
    void create(Employee employee);
    void update(Employee employee);
    void delete(Integer id);
    Page<Employee> findAllPaging(Pageable pageable);
    List<Employee> findAllByStatus();
    List<Employee> searchByName(String name);
}
