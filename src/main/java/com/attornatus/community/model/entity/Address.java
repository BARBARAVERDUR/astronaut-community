
package com.attornatus.community.model.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Table;
import org.springframework.data.annotation.Id;

@Entity
@Table(name = "ADDRESS")
public class Address {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    /*logradouro*/
    @Column(name="STREET")
    private String street;
    
    @Column(name="CEP")
    private Integer CEP;
    
    @Column(name="NUMBER")
    private Integer number;

    
    public Address() {
    }

    public Address(Long id, String street, Integer CEP, Integer number) {
        this.id = id;
        this.street = street;
        this.CEP = CEP;
        this.number = number;
    }
    
    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public Integer getCEP() {
        return CEP;
    }

    public void setCEP(Integer CEP) {
        this.CEP = CEP;
    }

    @Override
    public String toString() {
        return "Address{" + "id=" + id + ", street=" + street + ", CEP=" + CEP + ", number=" + number + '}';
    }
    
    
}
