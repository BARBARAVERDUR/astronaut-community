
package com.attornatus.community.model.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Table;
import org.springframework.data.annotation.Id;

@Entity
@Table(name = "Address")
public class Address {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    /*logradouro*/
    @Column(name="STREET")
    private String street;
    
    @Column(name="CEP")
    private String CEP;
    
    @Column(name="NUMBER")
    private String number;
    
    @Column(name="CITY")
    private String city;
    
    @Column(name="FAVORITE")
    private Boolean favorite;

    
    public Address() {
    }

    public Address(Long id, String street, String CEP, String number, String city, Boolean favorite) {
        this.id = id;
        this.street = street;
        this.CEP = CEP;
        this.number = number;
        this.city = city;
        this.favorite = favorite;
    }

    
    
    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
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

    public String getCEP() {
        return CEP;
    }

    public void setCEP(String CEP) {
        this.CEP = CEP;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Boolean getFavorite() {
        return favorite;
    }

    public void setFavorite(Boolean favorite) {
        this.favorite = favorite;
    }

    @Override
    public String toString() {
        return "Address{" + "id=" + id + ", street=" + street + ", CEP=" + CEP + ", number=" + number + ", city=" + city + ", favorite=" + favorite + '}';
    }

    
    
    
}