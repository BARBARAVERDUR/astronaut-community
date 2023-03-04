
package com.attornatus.community.model.dto.request;


import java.util.Date;


public class PersonRequestDto {
    private String name;
   
    private Date birthdate;
   
    private Long idAddress;

    public PersonRequestDto() {
    }

    public PersonRequestDto(String name, Date birthdate, Long idAddress) {
        this.name = name;
        this.birthdate = birthdate;
        this.idAddress = idAddress;
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

    public Long getIdAddress() {
        return idAddress;
    }

    public void setIdAddress(Long idAddress) {
        this.idAddress = idAddress;
    }

    
  
     
    
}
