
package com.attornatus.community.model.dto.response;

import java.util.Date;

public class PersonResponseHomeDto {
    
    private String name;
    private Date birthdate;
    private AddressResponseHomeDto addressHome;

    public PersonResponseHomeDto() {
    }

    public PersonResponseHomeDto(String name, Date birthdate, AddressResponseHomeDto addressHome) {
        this.name = name;
        this.birthdate = birthdate;
        this.addressHome = addressHome;
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

    public AddressResponseHomeDto getAddressHome() {
        return addressHome;
    }

    public void setAddressHome(AddressResponseHomeDto addressHome) {
        this.addressHome = addressHome;
    }
    
    
    
}
