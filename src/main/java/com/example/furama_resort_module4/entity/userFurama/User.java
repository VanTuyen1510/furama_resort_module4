package com.example.furama_resort_module4.entity.userFurama;

import com.example.furama_resort_module4.entity.employeeFurama.Employee;

import javax.persistence.*;
import java.util.List;

@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int userId;
    private String userName;
    private String password;
    private boolean isEnable;

    @ManyToMany(mappedBy = "userSet")
    private List<Role> roles;

}
