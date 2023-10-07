package com.example.furama_resort_module4.entity.serviceFurama;

import com.example.furama_resort_module4.entity.serviceFurama.Service;

import javax.persistence.*;
import java.util.Set;

@Entity
public class ServiceType {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer serviceTypeId;
    private String name;

    @OneToMany(mappedBy = "serviceType")
    Set<Service> serviceSet;

    public ServiceType() {
    }

    public ServiceType(Integer serviceTypeId, String name, Set<Service> serviceSet) {
        this.serviceTypeId = serviceTypeId;
        this.name = name;
        this.serviceSet = serviceSet;
    }

    public Integer getServiceTypeId() {
        return serviceTypeId;
    }

    public void setServiceTypeId(Integer serviceTypeId) {
        this.serviceTypeId = serviceTypeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Service> getServiceSet() {
        return serviceSet;
    }

    public void setServiceSet(Set<Service> serviceSet) {
        this.serviceSet = serviceSet;
    }
}
