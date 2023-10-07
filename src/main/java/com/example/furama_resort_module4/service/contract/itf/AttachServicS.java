package com.example.furama_resort_module4.service.contract.itf;

import com.example.furama_resort_module4.entity.contractFurama.AttachService;

import java.util.List;
import java.util.Optional;

public interface AttachServicS {
    List<AttachService> findAll();
    Optional<AttachService> findById(Integer id);
}
