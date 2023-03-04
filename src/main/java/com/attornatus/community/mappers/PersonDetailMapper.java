
package com.attornatus.community.mappers;

import com.attornatus.community.model.dto.request.PersonRequestDto;
import com.attornatus.community.model.dto.response.PersonResponseDetailsDto;
import com.attornatus.community.model.entity.Address;
import com.attornatus.community.model.entity.Person;
import com.attornatus.community.repository.AddressRepository;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
public class PersonDetailMapper {
    
    @Autowired
    private AddressRepository addressRepository;
    
    public Person map(PersonRequestDto request){
 
        Optional<Address> addressResponse = addressRepository.findById(request.getIdAddress());
        
        Address address = new Address();
        
        if(addressResponse.isPresent()){
            address = addressResponse.get();
        }
       
        
        Person person = new Person();
        
        person.setName(request.getName());
        person.setBirthdate(request.getBirthdate());
        person.setAddress((List<Address>) address);
        
        return person;
    }
    
    public PersonResponseDetailsDto map(Person person){
        
        PersonResponseDetailsDto response = new PersonResponseDetailsDto();
       
       Address address = new Address();
       Long idAddress = null;
       
       for(Address a : person.getAddress()){
           if(a.equals(address)){
               idAddress = a.getId();           
           }
       }
        
        response.setId(person.getId());
        response.setName(person.getName());
        response.setIdAddress(idAddress);
        response.setBirthdate(person.getBirthdate());
        
        return response;
    }
      
    
    public List<PersonResponseDetailsDto> map (List<Person> people){
        
       List<PersonResponseDetailsDto> listResponseDetail = new ArrayList<>();
       
       for(Person p : people){
           listResponseDetail.add((PersonResponseDetailsDto) map(people));
       }
        
       return listResponseDetail; 
    }
    
    
}
