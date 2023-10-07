package com.example.furama_resort_module4.repository.user;

import com.example.furama_resort_module4.entity.userFurama.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleRepository extends JpaRepository<Role,Long> {
}
