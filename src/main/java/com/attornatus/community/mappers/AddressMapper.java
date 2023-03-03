
package com.attornatus.community.mappers;

import com.attornatus.community.model.dto.request.AddressRequestDto;
import com.attornatus.community.model.dto.response.AddressResponseHomeDto;
import com.attornatus.community.model.entity.Address;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Component;

@Component
public class AddressMapper {
    
    public Address map(AddressRequestDto request){
        
        Address address = new Address();
        
        address.setStreet(request.getStreet());
        address.setNumber( request.getNumber());
        address.setCEP(request.getCEP());
        address.setCity(request.getCity());
        address.setFavorite(request.getFavorite());
        
        return address;
    }
    
    public AddressResponseHomeDto map(Address address){
        
        AddressResponseHomeDto response = new AddressResponseHomeDto();
        
        response.setAddressHome(address.getStreet() + " " + address.getNumber() + " " + address.getCity());
        
        return response;
    }
    
    public List<AddressResponseHomeDto> map (List<Address> addresses){
        
        List<AddressResponseHomeDto> listResponse = new  ArrayList<>();
        
        for (Address address : addresses) {
            listResponse.add(map(address));
        }
        
        return listResponse;
           
    }
    
}
