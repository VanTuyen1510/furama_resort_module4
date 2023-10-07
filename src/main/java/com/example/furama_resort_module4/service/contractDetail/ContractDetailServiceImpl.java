package com.example.furama_resort_module4.service.contractDetail;

import com.example.furama_resort_module4.entity.contractFurama.ContractDetail;
import com.example.furama_resort_module4.repository.contractDetail.ContractDetailRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ContractDetailServiceImpl  implements  ContractDetailService{
    @Autowired
    private ContractDetailRepository contractDetailRepository;

    @Override
    public List<ContractDetail> findAll() {
        return contractDetailRepository.findAll();
    }

    @Override
    public Optional<ContractDetail> findById(Integer id) {
        return contractDetailRepository.findById(id);
    }

    @Override
    public void deleteById(Integer id) {
        contractDetailRepository.findById(id);
    }
}
