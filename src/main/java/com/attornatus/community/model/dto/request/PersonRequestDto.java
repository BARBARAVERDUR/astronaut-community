
package com.attornatus.community.model.dto.request;


import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;

@JsonFormat
public class PersonRequestDto {
    private String name;
   
    private String birthdate;
   
    private Long idAddress;

    public PersonRequestDto() {
    }

    public PersonRequestDto(String name, String birthdate, Long idAddress) {
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

    public String getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(String birthdate) {
        this.birthdate = birthdate;
    }

    public Long getIdAddress() {
        return idAddress;
    }

    public void setIdAddress(Long idAddress) {
        this.idAddress = idAddress;
    }

    
  
     
    
}
