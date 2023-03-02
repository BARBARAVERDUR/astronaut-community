
package com.attornatus.community.mappers;


import com.attornatus.community.model.dto.request.PersonRequestDto;
import com.attornatus.community.model.dto.response.AddressResponseHomeDto;
import com.attornatus.community.model.dto.response.PersonResponseHomeDto;
import com.attornatus.community.model.entity.Person;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Component;

@Component
public class PersonMapper {
    
    public Person map(PersonRequestDto request){
        
        Person person = new Person();
        
        person.setName(request.getName());
        person.setBirthdate(request.getBirthdate());
        person.setAddress(request.getAddress());
        
        return person;
    }
    
    public PersonResponseHomeDto map(Person person){
        
        PersonResponseHomeDto response = new PersonResponseHomeDto();
        
        response.setName(person.getName());
        response.setAddressHome((AddressResponseHomeDto) person.getAddress());
        response.setBirthdate(person.getBirthdate());
        
        return response;
    }
    
    
    public List<PersonResponseHomeDto> map (List<Person> people){
        
       List<PersonResponseHomeDto> listResponseHome = new ArrayList<>();
       
       for(Person person : people){
           listResponseHome.add((PersonResponseHomeDto) map(people));
       }
        
       return listResponseHome; 
    }
    
    
}
