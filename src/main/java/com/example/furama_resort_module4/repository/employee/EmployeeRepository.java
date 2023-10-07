package com.example.furama_resort_module4.repository.employee;

import com.example.furama_resort_module4.entity.employeeFurama.Employee;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
//    @Query(name = "delete from employee a where a.status = true and employee_id = ?",nativeQuery = true)
//    void deleteEmployeeByStatus(@Param("status") boolean status , @Param("employee_id") Integer id);

    List<Employee> findAllByNameContaining(String name);
    List<Employee> findAllByStatusIsTrue();


}
