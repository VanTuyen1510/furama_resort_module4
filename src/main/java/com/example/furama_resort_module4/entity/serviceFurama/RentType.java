package com.example.furama_resort_module4.entity.serviceFurama;

import javax.persistence.*;
import java.util.Set;

@Entity
public class RentType {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer rentTypeId;
    private String name;
    private Double cost;

    @OneToMany(mappedBy = "rentType")
    Set<Service> serviceSet;

    public RentType() {
    }

    public RentType(Integer rentTypeId, String name, Double cost) {
        this.rentTypeId = rentTypeId;
        this.name = name;
        this.cost = cost;
    }

    public RentType(Integer rentTypeId, String name, Double cost, Set<Service> serviceSet) {
        this.rentTypeId = rentTypeId;
        this.name = name;
        this.cost = cost;
        this.serviceSet = serviceSet;
    }

    public Integer getRentTypeId() {
        return rentTypeId;
    }

    public void setRentTypeId(Integer rentTypeId) {
        this.rentTypeId = rentTypeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getCost() {
        return cost;
    }

    public void setCost(Double cost) {
        this.cost = cost;
    }

    public Set<Service> getServiceSet() {
        return serviceSet;
    }

    public void setServiceSet(Set<Service> serviceSet) {
        this.serviceSet = serviceSet;
    }
}
