
package com.attornatus.community.model.dto;


public class AddressRequest {
    
    private String street;
    
    private Integer CEP;

    private Integer number;

    public AddressRequest() {
    }

    public AddressRequest(String street, Integer CEP, Integer number) {
        this.street = street;
        this.CEP = CEP;
        this.number = number;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public Integer getCEP() {
        return CEP;
    }

    public void setCEP(Integer CEP) {
        this.CEP = CEP;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }
    
    
}
