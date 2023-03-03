
package com.attornatus.community.model.dto.response;

import java.util.Date;


public class PersonResponseDetailsDto {
    
    private Integer id;
    private String name;
   
    private Date birthdate;
    
    private ListAddressResponseDto listAddress;

    public PersonResponseDetailsDto() {
    }

    public PersonResponseDetailsDto(Integer id, String name, Date birthdate, ListAddressResponseDto listAddress) {
        this.id = id;
        this.name = name;
        this.birthdate = birthdate;
        this.listAddress = listAddress;
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

    public ListAddressResponseDto getListAddress() {
        return listAddress;
    }

    public void setListAddress(ListAddressResponseDto listAddress) {
        this.listAddress = listAddress;
    }
    
    
    
}
