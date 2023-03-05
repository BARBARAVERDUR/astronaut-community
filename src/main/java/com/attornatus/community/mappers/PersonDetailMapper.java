
package com.attornatus.community.mappers;

import com.attornatus.community.model.dto.request.PersonRequestDto;
import com.attornatus.community.model.dto.response.PersonResponseDetailsDto;
import com.attornatus.community.model.entity.Address;
import com.attornatus.community.model.entity.Person;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.springframework.stereotype.Component;


@Component
public class PersonDetailMapper {
    
    public Person map(PersonRequestDto request) throws ParseException{
         
        Person person = new Person();
        
        person.setName(request.getName());
   
        String stringDate = request.getBirthdate();
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
        Date date = format.parse(stringDate);
        person.setBirthdate(date);
        
        
        
        List <Address> addressList = new ArrayList <>();
        addressList.add(request.getAddress());
        
        person.setAddress(addressList);
        
        return person;
    }
    
    public PersonResponseDetailsDto map(Person person){
        
        PersonResponseDetailsDto response = new PersonResponseDetailsDto();
       
         Address address = new Address();
       
        response.setId(person.getId());
        response.setName(person.getName()); 
        
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        String stringDate = sdf.format(person.getBirthdate());
        
        response.setBirthdate(stringDate);
        
        return response;
    }
      
    
    public List<PersonResponseDetailsDto> map (List<Person> people){
        
       List<PersonResponseDetailsDto> listResponseDetail = new ArrayList<>();
       
       for(Person p : people){
           listResponseDetail.add((PersonResponseDetailsDto) map(p));
       }
        
       return listResponseDetail; 
    }
    
  

}
