package com.example.furama_resort_module4.repository.contract;

import com.example.furama_resort_module4.entity.contractFurama.AttachService;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AttachServiceRepository extends JpaRepository<AttachService,Integer> {
}
