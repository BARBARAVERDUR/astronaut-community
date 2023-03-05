
package com.attornatus.community.service;

import com.attornatus.community.mappers.AddressMapperDetail;
import com.attornatus.community.model.dto.request.AddressRequestDto;
import com.attornatus.community.model.dto.response.AddressResponseDetailsDto;
import com.attornatus.community.model.dto.response.ListAddressResponseDto;
import com.attornatus.community.model.entity.Address;
import com.attornatus.community.repository.AddressRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class AddressService {
  
    @Autowired
    private AddressRepository addressRepository;
    
    @Autowired
    private AddressMapperDetail mapperDetail;
    
    public AddressResponseDetailsDto create(AddressRequestDto request){
        
        Address address = mapperDetail.map(request);
        
        addressRepository.save(address);
        return mapperDetail.map(address);
    }
    
    public ListAddressResponseDto findAll(){
        
        List<Address> addresses = addressRepository.findAll();
        
        ListAddressResponseDto addressResponse = new ListAddressResponseDto();    
        addressResponse.setListAddressDitail(mapperDetail.map(addresses));
        
        return addressResponse;
    }
    
    public void delete(Long id) throws Exception {

        findByID(id);
        addressRepository.deleteById(id);

    }
    
    public AddressResponseDetailsDto update(AddressRequestDto request, Long id) throws Exception{
        
        Address address = findByID(id);
        
        address.setStreet(request.getStreet());
        address.setNumber(request.getNumber());
        address.setCEP(request.getCEP());
        address.setCity(request.getCity());
        address.setFavorite(request.getFavorite());
        
        addressRepository.save(address);
        return mapperDetail.map(address);
    }

    public Address findByID(Long id) throws Exception{
      
        Optional <Address> address = addressRepository.findById(id);
        
        if(address.isPresent()){
            return address.get();
        }else{
            throw new Exception("O endereço solicitado não existe");
        }
    }
    
    public AddressResponseDetailsDto getResponseId(Long id) throws Exception{
        
        return mapperDetail.map(findByID(id));
    }
 
 
 
 

    
}
