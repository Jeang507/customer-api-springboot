package com.jean.customer.api.model;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long customerId;
    private String name;
    private String email;
    private String phone;
    private CustomerStatus status;
    private String address;
    private CustomerType type;
    private LocalDate registeredAt;

    public Customer(){}

    public Customer(String name, String email, String phone, CustomerStatus status, String address, CustomerType type,
            LocalDate registeredAt) {
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.status = status;
        this.address = address;
        this.type = type;
        this.registeredAt = registeredAt;
    }



    public Long getCustomerId() {
        return customerId;
    }
    public void setCustomerId(Long customerId) {
        this.customerId = customerId;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getPhone() {
        return phone;
    }
    public void setPhone(String phone) {
        this.phone = phone;
    }
    public CustomerStatus getStatus() {
        return status;
    }
    public void setStatus(CustomerStatus status) {
        this.status = status;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public CustomerType getType() {
        return type;
    }
    public void setType(CustomerType type) {
        this.type = type;
    }
    public LocalDate getRegisteredAt() {
        return registeredAt;
    }
    public void setRegisteredAt(LocalDate registeredAt) {
        this.registeredAt = registeredAt;
    }

    
}
