
package com.attornatus.community.model.dto;

import java.util.Date;


public class PersonResponse {
    
    private String name;
    private Date birthdate;

    //chequearlo
    private AddressResponse address;

    public PersonResponse() {
    }

    public PersonResponse(String name, Date birthdate, AddressResponse address) {
        this.name = name;
        this.birthdate = birthdate;
        this.address = address;
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

    public AddressResponse getAddress() {
        return address;
    }

    public void setAddress(AddressResponse address) {
        this.address = address;
    }
    
    
}
