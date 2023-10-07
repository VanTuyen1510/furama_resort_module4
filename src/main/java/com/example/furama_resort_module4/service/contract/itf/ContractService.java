package com.example.furama_resort_module4.service.contract.itf;

import com.example.furama_resort_module4.entity.contractFurama.Contract;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;
import java.util.Optional;

public interface ContractService {
    Page<Contract> findAll(Pageable pageable);
    Optional<Contract> findById(Integer id);
    void createContract(Contract contract);
    void updateContract(Contract contract);
    void deleteContract(Integer id);
    List<Contract> findAll();
    List<Contract> findAllByCustomer();

}
