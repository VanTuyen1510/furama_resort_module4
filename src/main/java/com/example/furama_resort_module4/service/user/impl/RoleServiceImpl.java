package com.example.furama_resort_module4.service.user.impl;

import com.example.furama_resort_module4.entity.userFurama.Role;
import com.example.furama_resort_module4.repository.user.RoleRepository;
import com.example.furama_resort_module4.service.user.itf.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoleServiceImpl implements RoleService {
    @Autowired
    private RoleRepository roleRepository;

    @Override
    public List<Role> findAll() {
        return roleRepository.findAll();
    }
}
