package com.example.furama_resort_module4.entity.customerFurama;

import javax.persistence.*;
import java.util.Set;

@Entity
public class CustomerType {
    @Id
    @GeneratedValue
    private Integer customerTypeId;
    private String name;

    @OneToMany(mappedBy = "customerType")
    Set<Customer> customerSet;

    public CustomerType() {
    }

    public CustomerType(Integer customerTypeId, String name, Set<Customer> customerSet) {
        this.customerTypeId = customerTypeId;
        this.name = name;
        this.customerSet = customerSet;
    }

    public Set<Customer> getCustomerSet() {
        return customerSet;
    }

    public void setCustomerSet(Set<Customer> customerSet) {
        this.customerSet = customerSet;
    }

    public Integer getCustomerTypeId() {
        return customerTypeId;
    }

    public void setCustomerTypeId(Integer customerTypeId) {
        this.customerTypeId = customerTypeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
