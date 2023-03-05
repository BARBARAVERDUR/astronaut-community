
package com.attornatus.community.model.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import java.io.Serializable;


@Entity
@Table(name = "ADDRESS")
public class Address implements Serializable{
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="Id")
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
    
    @JoinColumn(name="ID_PERSON")
    @ManyToOne
    private Person person;

    
    public Address() {
    }

    public Address(Long id, String street, String CEP, String number, String city, Boolean favorite, Person person) {
        this.id = id;
        this.street = street;
        this.CEP = CEP;
        this.number = number;
        this.city = city;
        this.favorite = favorite;
        this.person = person;
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

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    @Override
    public String toString() {
        return "Address{" + "id=" + id + ", street=" + street + ", CEP=" + CEP + ", number=" + number + ", city=" + city + ", favorite=" + favorite + ", person=" + person + '}';
    }
    

   
    
    
    
}
