package com.example.furama_resort_module4.entity.employeeFurama;

import javax.persistence.*;
import java.util.List;

@Entity
public class EducationDegree {
    @Id
    @GeneratedValue
    private Integer educationDegreeId;
    private String name;

    @OneToMany(mappedBy = "educationDegree")
    List<Employee> employeeList;


    public EducationDegree() {
    }

    public EducationDegree(Integer educationDegreeId, String name, List<Employee> employeeList) {
        this.educationDegreeId = educationDegreeId;
        this.name = name;
        this.employeeList = employeeList;
    }

    public Integer getEducationDegreeId() {
        return educationDegreeId;
    }

    public void setEducationDegreeId(Integer educationDegreeId) {
        this.educationDegreeId = educationDegreeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Employee> getEmployeeList() {
        return employeeList;
    }

    public void setEmployeeList(List<Employee> employeeList) {
        this.employeeList = employeeList;
    }
}
