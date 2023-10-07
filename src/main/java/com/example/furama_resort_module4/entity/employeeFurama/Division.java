package com.example.furama_resort_module4.entity.employeeFurama;

import javax.persistence.*;
import java.util.List;

@Entity
public class Division {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer divisionId;

    private String name;

    @OneToMany(mappedBy = "division")
    List<Employee> employeeSet;

    public Division() {
    }

    public Division(Integer divisionId, String name, List<Employee> employeeSet) {
        this.divisionId = divisionId;
        this.name = name;
        this.employeeSet = employeeSet;
    }

    public Integer getDivisionId() {
        return divisionId;
    }

    public void setDivisionId(Integer divisionId) {
        this.divisionId = divisionId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Employee> getEmployeeSet() {
        return employeeSet;
    }

    public void setEmployeeSet(List<Employee> employeeSet) {
        this.employeeSet = employeeSet;
    }
}
