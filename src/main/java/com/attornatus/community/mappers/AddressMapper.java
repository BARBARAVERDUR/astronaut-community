
package com.attornatus.community.mappers;

import com.attornatus.community.model.dto.AddressRequest;
import com.attornatus.community.model.dto.AddressResponse;
import com.attornatus.community.model.entity.Address;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Component;

@Component
public class AddressMapper {
    
    public Address map(AddressRequest request){
        
        Address address = new Address();
        
        address.setStreet(request.getStreet());
        address.setNumber( request.getNumber());
        address.setCEP(request.getCEP());
        
        return address;
    }
    
    public AddressResponse map(Address address){
        
        AddressResponse response = new AddressResponse();
        
        response.setAddressDto(address.getStreet() + " " + address.getNumber());
        
        return response;
    }
    
    public List<AddressResponse> map (List<Address> addresses){
        
        List<AddressResponse> listResponse = new  ArrayList<>();
        
        for (Address address : addresses) {
            listResponse.add(map(address));
        }
        
        return listResponse;
           
    }
    
}
