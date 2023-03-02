
package com.attornatus.community.model.dto;


public class AddressRequest {
    
    private String street;
    
    private String CEP;

    private String number;

    public AddressRequest() {
    }

    public AddressRequest(String street, String CEP, String number) {
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

    public String getCEP() {
        return CEP;
    }

    public void setCEP(String CEP) {
        this.CEP = CEP;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }
    
    
}
