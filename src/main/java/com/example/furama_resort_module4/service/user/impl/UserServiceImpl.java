package com.example.furama_resort_module4.service.user.impl;

import com.example.furama_resort_module4.entity.userFurama.User;
import com.example.furama_resort_module4.repository.user.UserRepository;
import com.example.furama_resort_module4.service.user.itf.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository userRepository;

    @Override
    public List<User> findAll() {
        return userRepository.findAll();
    }

    @Override
    public User findUserByUserName(String userName) {
        return null;
    }

    @Override
    public void deleteById(Long id) {
        userRepository.deleteById(id);
    }

    @Override
    public void create(User user) {
        userRepository.save(user);
    }
}
