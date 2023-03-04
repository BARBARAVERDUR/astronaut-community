
package com.attornatus.community.model.dto.response;



public class PersonResponseDetailsDto {
    
    private Integer id;
    private String name;
   
    private String birthdate;
    
    private Long idAddress;

    public PersonResponseDetailsDto() {
    }

    public PersonResponseDetailsDto(Integer id, String name, String birthdate, Long idAddress) {
        this.id = id;
        this.name = name;
        this.birthdate = birthdate;
        this.idAddress = idAddress;
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

    public Long getIdAddress() {
        return idAddress;
    }

    public void setIdAddress(Long idAddress) {
        this.idAddress = idAddress;
    }
 
    
}
