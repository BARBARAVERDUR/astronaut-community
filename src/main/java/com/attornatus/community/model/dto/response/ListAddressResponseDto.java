
package com.attornatus.community.model.dto.response;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.List;

@JsonFormat
public class ListAddressResponseDto {
    
    private List<AddressResponseDetailsDto> listAddressDitail;

    public ListAddressResponseDto() {
    }

    public ListAddressResponseDto(List<AddressResponseDetailsDto> listAddressDitail) {
        this.listAddressDitail = listAddressDitail;
    }

    public List<AddressResponseDetailsDto> getListAddressDitail() {
        return listAddressDitail;
    }

    public void setListAddressDitail(List<AddressResponseDetailsDto> listAddressDitail) {
        this.listAddressDitail = listAddressDitail;
    }
    
    
}
