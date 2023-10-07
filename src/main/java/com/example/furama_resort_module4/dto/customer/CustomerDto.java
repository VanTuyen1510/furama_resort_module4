package com.example.furama_resort_module4.dto.customer;

import com.example.furama_resort_module4.entity.customerFurama.CustomerType;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.Column;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;
import java.util.Date;

public class CustomerDto {

    private Integer customerId;

    @NotBlank
    private String name;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date birthday;

    private Integer gender;

    @NotBlank
    @Pattern(regexp = "^[0-9]{9}$",message = "The Id Card must have 9 digits and be in the format XXX XXX XXX.")
    private String card;

    @NotBlank
    @Pattern(regexp = "^((091)|(090))[0-9]{7}$",message = "Phone number must be in the correct format 090xxxxxxx or 091xxxxxxx.")
    private String phone;

    @NotBlank
    @Email
    private String email;

    @NotBlank
    private String address;
    private CustomerType customerType;
    private Boolean status;

    public CustomerDto() {
    }

    public CustomerDto(Integer customerId, String name, Date birthday, Integer gender, String card, String phone, String email, String address, CustomerType customerType, Boolean status) {
        this.customerId = customerId;
        this.name = name;
        this.birthday = birthday;
        this.gender = gender;
        this.card = card;
        this.phone = phone;
        this.email = email;
        this.address = address;
        this.customerType = customerType;
        this.status = status;
    }

    public Integer getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
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

    public Integer getGender() {
        return gender;
    }

    public void setGender(Integer gender) {
        this.gender = gender;
    }

    public String getCard() {
        return card;
    }

    public void setCard(String card) {
        this.card = card;
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

    public CustomerType getCustomerType() {
        return customerType;
    }

    public void setCustomerType(CustomerType customerType) {
        this.customerType = customerType;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }
}
