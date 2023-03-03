
package com.attornatus.community.mappers;

import com.attornatus.community.model.dto.request.AddressRequestDto;
import com.attornatus.community.model.dto.response.AddressResponseDetailsDto;
import com.attornatus.community.model.entity.Address;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Component;

@Component
public class AddressMapperDetail {
    
    public Address map(AddressRequestDto request){
        
        Address address = new Address();
        
        address.setStreet(request.getStreet());
        address.setNumber( request.getNumber());
        address.setCEP(request.getCEP());
        address.setCity(request.getCity());
        address.setFavorite(request.getFavorite());
        
        return address;
    }
    
    public AddressResponseDetailsDto map(Address address){
        
        AddressResponseDetailsDto response = new AddressResponseDetailsDto();
        
        response.setId(address.getId());
        response.setStreet(address.getStreet());
        response.setCEP(address.getNumber());
        response.setNumber(address.getCity());
        response.setFavorite(address.getFavorite());
        
        return response;
    }
    
    public List<AddressResponseDetailsDto> map (List<Address> addresses){
        
       List<AddressResponseDetailsDto> listResponseDetail = new ArrayList<>();
       
       for(Address address : addresses){
           listResponseDetail.add((AddressResponseDetailsDto) map(addresses));
       }
        
       return listResponseDetail; 
    }
    
}
