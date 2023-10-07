package com.example.furama_resort_module4.dto.employee;

import com.example.furama_resort_module4.entity.employeeFurama.Division;
import com.example.furama_resort_module4.entity.employeeFurama.EducationDegree;
import com.example.furama_resort_module4.entity.employeeFurama.Position;
import org.springframework.format.annotation.DateTimeFormat;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import java.util.Date;

public class EmployeeDto {
    private int employeeId;

    @NotEmpty
    @Size
    private String name;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date birthday;
    @Pattern(regexp = "[0-9]{9}",message = "{Employee.card}")
    private String card;
    private Double salary;

//    @Pattern(regexp = "(090){8}+(84[90]|84[91]){8}",message = "{Employee.phone}")
    private String phone;

    private String email;
    private String address;
    private boolean status;

    private Position position;
    private Division division;
    private EducationDegree educationDegree;


    public EmployeeDto() {
    }

    public EmployeeDto(int employeeId, String name, Date birthday, String card, Double salary, String phone, String email, String address, boolean status, Position position, Division division, EducationDegree educationDegree) {
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
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
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

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}
