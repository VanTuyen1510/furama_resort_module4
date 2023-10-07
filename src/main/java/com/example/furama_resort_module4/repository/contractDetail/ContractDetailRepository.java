package com.example.furama_resort_module4.repository.contractDetail;

import com.example.furama_resort_module4.entity.contractFurama.ContractDetail;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContractDetailRepository extends JpaRepository<ContractDetail,Integer>{
}
