
package com.attornatus.community.model.entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import java.io.Serializable;
import java.util.Date;

import java.util.List;



@Entity
@Table(name = "PERSON")
public class Person implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="Id")
    private Integer id;
    
    @Column(name="NAME")
    private String name;
    
    @Temporal(TemporalType.DATE)
    @Column(name="BIRTHDATE")
    private Date birthdate;
    
    @OneToMany
    @Column(name="ADDRESS_ID")
    private List<Address> address;

    public Person() {
    }

    public Person(Integer id, String name, Date birthdate, List<Address> address) {
        this.id = id;
        this.name = name;
        this.birthdate = birthdate;
        this.address = address;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(Date birthdate) {
        this.birthdate = birthdate;
    }

    public List<Address> getAddress() {
        return address;
    }

    public void setAddress(List<Address> address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Person{" + "id=" + id + ", name=" + name + ", birthdate=" + birthdate + ", address=" + address + '}';
    }
    
    
}