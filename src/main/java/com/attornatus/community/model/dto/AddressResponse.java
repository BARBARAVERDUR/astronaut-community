
package com.attornatus.community.model.dto;


public class AddressResponse {
    
    private String addressDto;

    public AddressResponse() {
    }

    public AddressResponse(String addressDto) {
        this.addressDto = addressDto;
    }

    public String getAddressDto() {
        return addressDto;
    }

    public void setAddressDto(String addressDto) {
        this.addressDto = addressDto;
    }
   
    
}
