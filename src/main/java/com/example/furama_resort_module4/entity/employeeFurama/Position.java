package com.example.furama_resort_module4.entity.employeeFurama;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Position {
    @Id
    @GeneratedValue
    private Integer positionId;
//    @Column(name = "position_name" , nullable = false)
    private String name;

    @OneToMany(mappedBy = "position")
    private Set<Employee> employeeSet;

    public Position() {
    }

    public Position(Integer positionId, String name, Set<Employee> employeeSet) {
        this.positionId = positionId;
        this.name = name;
        this.employeeSet = employeeSet;
    }

    public Integer getPositionId() {
        return positionId;
    }

    public void setPositionId(Integer positionId) {
        this.positionId = positionId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Employee> getEmployeeSet() {
        return employeeSet;
    }

    public void setEmployeeSet(Set<Employee> employeeSet) {
        this.employeeSet = employeeSet;
    }
}
