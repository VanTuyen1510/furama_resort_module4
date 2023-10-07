package com.example.furama_resort_module4.controller.employee;

import com.example.furama_resort_module4.entity.employeeFurama.Employee;
import com.example.furama_resort_module4.service.employee.itf.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/v1/employee")
public class EmployeeRestController {
    @Autowired
    private EmployeeService employeeService;

    @GetMapping("/search")
    public ResponseEntity<List<Employee>> searchByName(@RequestParam("name") String name){
        return new ResponseEntity<>(employeeService.searchByName(name), HttpStatus.OK);
    }
}
