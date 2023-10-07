package com.example.furama_resort_module4.repository.customer;

import com.example.furama_resort_module4.entity.customerFurama.CustomerType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerTypeRepository extends JpaRepository<CustomerType,Integer> {
}
