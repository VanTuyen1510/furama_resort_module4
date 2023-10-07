package com.example.furama_resort_module4.service.user.itf;

import com.example.furama_resort_module4.entity.userFurama.User;

import java.util.List;

public interface UserService {
    List<User> findAll();
    User findUserByUserName(String userName);
    void deleteById(Long id);
    void create(User user);

}
