
package com.attornatus.community.model.dto.request;


import com.attornatus.community.model.entity.Address;
import com.fasterxml.jackson.annotation.JsonFormat;

@JsonFormat
public class PersonRequestDto {
    private String name;
   
    private String birthdate;
   
    private Address address;

    public PersonRequestDto() {
    }

    public PersonRequestDto(String name, String birthdate, Address address) {
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

    public String getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(String birthdate) {
        this.birthdate = birthdate;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }   
    
}
