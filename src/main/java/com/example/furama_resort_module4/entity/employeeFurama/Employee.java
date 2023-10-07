package com.example.furama_resort_module4.entity.employeeFurama;

import com.example.furama_resort_module4.entity.contractFurama.Contract;
import com.example.furama_resort_module4.entity.userFurama.User;

import javax.persistence.*;
import javax.validation.constraints.Pattern;
import java.util.Date;
import java.util.Set;

@Entity
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer employeeId;
    private String name;

    private Date birthday;
    private String card;
    private Double salary;
    private String phone;
    private String email;
    private String address;

    private boolean status;


    @ManyToOne
    @JoinColumn(name = "position_id",referencedColumnName = "positionId")
    private Position position;

    @ManyToOne
    @JoinColumn(name = "division_id",referencedColumnName = "divisionId")
    private Division division;

    @ManyToOne
    @JoinColumn(name = "education_id",referencedColumnName = "educationDegreeId")
    private EducationDegree educationDegree;

    @OneToMany(mappedBy = "employee")
    Set<Contract> contracts;

    @ManyToOne
    @JoinColumn(name = "user_id",referencedColumnName = "userId")
    private User user;

    public Employee() {
    }


    public Employee(Integer employeeId, String name, Date birthday, String card, Double salary, String phone, String email, String address, boolean status, Position position, Division division, EducationDegree educationDegree, Set<Contract> contracts, User user) {
        this.employeeId = employeeId;
        this.name = name;
        this.birthday = birthday;
        this.card = card;
        this.salary = salary;
        this.phone = phone;
        this.email = email;
        this.address = address;
        this.status = status;
        this.position = position;
        this.division = division;
        this.educationDegree = educationDegree;
        this.contracts = contracts;
        this.user = user;
    }

    public Integer getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(Integer employeeId) {
        this.employeeId = employeeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getCard() {
        return card;
    }

    public void setCard(String card) {
        this.card = card;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    public Division getDivision() {
        return division;
    }

    public void setDivision(Division division) {
        this.division = division;
    }

    public EducationDegree getEducationDegree() {
        return educationDegree;
    }

    public void setEducationDegree(EducationDegree educationDegree) {
        this.educationDegree = educationDegree;
    }

    public Set<Contract> getContracts() {
        return contracts;
    }

    public void setContracts(Set<Contract> contracts) {
        this.contracts = contracts;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
