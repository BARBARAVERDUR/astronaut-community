
package com.attornatus.community.mappers;

import com.attornatus.community.model.dto.AddressResponse;
import com.attornatus.community.model.dto.PersonRequest;
import com.attornatus.community.model.dto.PersonResponse;
import com.attornatus.community.model.entity.Person;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Component;

@Component
public class PersonMapper {
    
    public Person map(PersonRequest request){
        
        Person person = new Person();
        
        person.setName(request.getName());
        person.setBirthdate(request.getBirthdate());
        person.setAddress(request.getAddress());
        
        return person;
    }
    
    public PersonResponse map(Person person){
        
        PersonResponse response = new PersonResponse();
        
        response.setName(person.getName());
        response.setAddress((AddressResponse) person.getAddress());
        response.setBirthdate(person.getBirthdate());
        
        return response;
    }
    
    
    public List<PersonResponse> map (List<Person> people){
        
       List<PersonResponse> listResponse = new ArrayList<>();
       
        for (Person person : people) {
            listResponse.add(map(person));   
        }
       return listResponse; 
    }
    
    
}
