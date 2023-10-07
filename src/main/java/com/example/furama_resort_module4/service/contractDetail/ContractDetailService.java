package com.example.furama_resort_module4.service.contractDetail;

import com.example.furama_resort_module4.entity.contractFurama.ContractDetail;

import java.util.List;
import java.util.Optional;

public interface ContractDetailService {
    List<ContractDetail> findAll();
    Optional<ContractDetail> findById(Integer id);
    void deleteById(Integer id);
}
