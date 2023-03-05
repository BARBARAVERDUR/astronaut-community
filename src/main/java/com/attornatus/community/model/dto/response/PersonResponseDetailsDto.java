
package com.attornatus.community.model.dto.response;

import com.fasterxml.jackson.annotation.JsonFormat;


@JsonFormat
public class PersonResponseDetailsDto {
    
    private Integer id;
    private String name;
   
    private String birthdate;


    public PersonResponseDetailsDto() {
    }

    public PersonResponseDetailsDto(Integer id, String name, String birthdate) {
        this.id = id;
        this.name = name;
        this.birthdate = birthdate;
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

    public String getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(String birthdate) {
        this.birthdate = birthdate;
    }


    
}
