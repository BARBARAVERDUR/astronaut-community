
package com.attornatus.community.service;

import com.attornatus.community.mappers.AddressMapper;
import com.attornatus.community.model.dto.request.AddressRequestDto;
import com.attornatus.community.model.dto.response.AddressResponseHomeDto;
import com.attornatus.community.model.entity.Address;
import com.attornatus.community.repository.AddressRepository;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AddressHomeService {
    
    @Autowired
    private AddressRepository addressRepository;
    
    @Autowired
    private AddressMapper mapper;
    
    public AddressResponseHomeDto create(AddressRequestDto request){
        
        Address address = mapper.map(request);
        
        addressRepository.save(address);
        return mapper.map(address);
    }
       
    
    public void delete(Long id) throws Exception {

        findByID(id);
        addressRepository.deleteById(id);

    }
    
    public AddressResponseHomeDto update(AddressRequestDto request, Long id) throws Exception{
        
        Address address = findByID(id);
        
        address.setStreet(request.getStreet());
        address.setNumber(request.getNumber());
        address.setCity(request.getCity());
                
        addressRepository.save(address);
        return mapper.map(address);
    }

    public Address findByID(Long id) throws Exception{
      
        Optional <Address> address = addressRepository.findById(id);
        
        if(address.isPresent()){
            return address.get();
        }else{
            throw new Exception("O endereço solicitado não existe");
        }
    }
    
    public AddressResponseHomeDto getResponseId(Long id) throws Exception{
        
        return mapper.map(findByID(id));
    };
    
}
