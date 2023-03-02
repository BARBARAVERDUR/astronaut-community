
package com.attornatus.community.model.dto;

import java.util.List;

public class ListAddressResponse {
    
    private List<AddressResponse> listAddressDto;

    public ListAddressResponse() {
    }

    public ListAddressResponse(List<AddressResponse> listAddressDto) {
        this.listAddressDto = listAddressDto;
    }

    public List<AddressResponse> getListAddressDto() {
        return listAddressDto;
    }

    public void setListAddressDto(List<AddressResponse> listAddressDto) {
        this.listAddressDto = listAddressDto;
    }
    
    
}
