
package com.attornatus.community.mappers;

import com.attornatus.community.model.dto.response.ListAddressResponseDto;
import com.attornatus.community.model.dto.response.PersonResponseDetailsDto;
import com.attornatus.community.model.entity.Person;
import java.util.ArrayList;
import java.util.List;

public class PersonDetailMapper {
    
    public PersonResponseDetailsDto map(Person person){
        
        PersonResponseDetailsDto response = new PersonResponseDetailsDto();
        
        response.setId(person.getId());
        response.setName(person.getName());
        response.setListAddress((ListAddressResponseDto) person.getAddress());
        response.setBirthdate(person.getBirthdate());
        
        return response;
    }
    
    public List<PersonResponseDetailsDto> map (List<Person> people){
        
       List<PersonResponseDetailsDto> listResponseDetail = new ArrayList<>();
       
       for(Person person : people){
           listResponseDetail.add((PersonResponseDetailsDto) map(people));
       }
        
       return listResponseDetail; 
    }
    
}
