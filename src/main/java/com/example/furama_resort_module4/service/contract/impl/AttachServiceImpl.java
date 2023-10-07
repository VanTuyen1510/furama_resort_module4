package com.example.furama_resort_module4.service.contract.impl;

import com.example.furama_resort_module4.entity.contractFurama.AttachService;
import com.example.furama_resort_module4.repository.contract.AttachServiceRepository;
import com.example.furama_resort_module4.service.contract.itf.AttachServicS;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AttachServiceImpl implements AttachServicS {
    @Autowired
    private AttachServiceRepository attachServiceRepository;
    @Override
    public List<AttachService> findAll() {
        return attachServiceRepository.findAll();
    }

    @Override
    public Optional<AttachService> findById(Integer id) {
        return attachServiceRepository.findById(id);
    }
}
