
package com.attornatus.community.model.dto.request;

import com.attornatus.community.model.entity.Address;
import java.util.Date;
import java.util.List;

public class PersonRequestDto {
    private String name;
   
    private Date birthdate;
   
    private List<Address> address;

    public PersonRequestDto() {
    }

    public PersonRequestDto(String name, Date birthdate, List<Address> address) {
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

    public List<Address> getAddress() {
        return address;
    }

    public void setAddress(List<Address> address) {
        this.address = address;
    }
     
    
}
