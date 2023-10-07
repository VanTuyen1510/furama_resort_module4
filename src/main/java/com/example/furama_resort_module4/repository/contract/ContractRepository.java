package com.example.furama_resort_module4.repository.contract;

import com.example.furama_resort_module4.entity.contractFurama.Contract;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ContractRepository extends JpaRepository<Contract, Integer> {
    @Query(value = " SELECT * FROM customer c JOIN contract co ON c.customer_id = co.customer_id \n" +
            " where now() < co.end_date\n" ,nativeQuery = true)

//    @Query(value = " SELECT * FROM customer c JOIN contract co ON c.customer_id = co.customer_id \n" +
//            " Join contract_detail cd on co.contract_id = cd.contract_id\n" +
//            "join attach_service ats on cd.attach_service_id = ats.attach_service_id\n" +
//            " where now() < co.end_date",nativeQuery = true)
    List<Contract>findAllByCustomer();


}
