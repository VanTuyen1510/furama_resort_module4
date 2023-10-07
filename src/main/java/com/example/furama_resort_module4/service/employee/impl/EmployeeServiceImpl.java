package com.example.furama_resort_module4.service.employee.impl;

import com.example.furama_resort_module4.entity.employeeFurama.Employee;
import com.example.furama_resort_module4.repository.employee.EmployeeRepository;
import com.example.furama_resort_module4.service.employee.itf.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

@Service
public class EmployeeServiceImpl implements EmployeeService {
    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    public List<Employee> findAll() {
        return employeeRepository.findAll();
    }

    @Override
    public Optional<Employee> findById(Integer id) {
        return employeeRepository.findById(id);
    }

    @Override
    public void create(Employee employee) {
        employee.setStatus(true);
        employeeRepository.save(employee);
    }

    @Override
    public void update(Employee employee) {
        employee.setStatus(true);
        employeeRepository.save(employee);
    }

    @Override
    public void delete(Integer id) {
        Employee employee = employeeRepository.findById(id).orElse(null);
        if (Objects.nonNull(employee)) {
            employee.setStatus(true);
            employeeRepository.save(employee);
        }
    }

    @Override
    public Page<Employee> findAllPaging(Pageable pageable) {
        return employeeRepository.findAll(pageable);
    }

    @Override
    public List<Employee> findAllByStatus() {
        List<Employee> employeeList = employeeRepository.findAllByStatusIsTrue();
        return employeeList;
    }

    @Override
    public List<Employee> searchByName(String name) {
        return employeeRepository.findAllByNameContaining(name);
    }


}
