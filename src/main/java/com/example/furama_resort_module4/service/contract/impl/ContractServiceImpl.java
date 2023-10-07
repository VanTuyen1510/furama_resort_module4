package com.example.furama_resort_module4.service.contract.impl;

import com.example.furama_resort_module4.entity.contractFurama.Contract;
import com.example.furama_resort_module4.repository.contract.ContractRepository;
import com.example.furama_resort_module4.service.contract.itf.ContractService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ContractServiceImpl implements ContractService {
    @Autowired
    private ContractRepository contractRepository;

    @Override
    public Page<Contract> findAll(Pageable pageable) {
        return contractRepository.findAll(pageable);
    }

    @Override
    public Optional<Contract> findById(Integer id) {
        return contractRepository.findById(id);
    }

    @Override
    public void createContract(Contract contract) {
        contractRepository.save(contract);
    }

    @Override
    public void updateContract(Contract contract) {
        contractRepository.save(contract);
    }

    @Override
    public void deleteContract(Integer id) {
        contractRepository.deleteById(id);
    }

    @Override
    public List<Contract> findAll() {
        return contractRepository.findAll();
    }

    @Override
    public List<Contract> findAllByCustomer() {
        return contractRepository.findAllByCustomer();
    }


}
