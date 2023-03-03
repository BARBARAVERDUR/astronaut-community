
package com.attornatus.community.service;

import com.attornatus.community.mappers.PersonMapper;
import com.attornatus.community.model.dto.request.PersonRequestDto;
import com.attornatus.community.model.dto.response.ListPeopleResponseDto;
import com.attornatus.community.model.dto.response.PersonResponseHomeDto;
import com.attornatus.community.model.entity.Person;
import com.attornatus.community.repository.PersonRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonHomeService {
    
    @Autowired
    private PersonRepository personRepository;
    
    @Autowired
    private PersonMapper personMapper;
   
    
    public PersonResponseHomeDto create(PersonRequestDto request){
        
        Person person = personMapper.map(request);    
        personRepository.save(person);
       
        return personMapper.map(person);
    }
    
    public ListPeopleResponseDto findAll(){
        
        List<Person> people = personRepository.findAll();
        
        ListPeopleResponseDto peopleResponse = new ListPeopleResponseDto();
        peopleResponse.setListPeople(personMapper.map(people));
        
        return peopleResponse;
    }
    
    public void delete(Integer id) throws Exception {

        findByID(id);
        personRepository.deleteById(id);

    }
    
    public PersonResponseHomeDto update(PersonRequestDto request,Integer id ) throws Exception{
        
        Person person = findByID(id);
        
        person.setName(request.getName());
        person.setBirthdate(request.getBirthdate());
        person.setAddress(request.getAddress());
  
        personRepository.save(person);
        return personMapper.map(person);
    }

    private Person findByID(Integer id) throws Exception {
        
        Optional<Person> person = personRepository.findById(id);
        
        if (person.isPresent()) {
            return person.get();
        } else {
           throw new Exception("O usuário não está registrado."); 

        }
    }
    
    public PersonResponseHomeDto getResponseById(Integer id) throws Exception{
        
     return personMapper.map(findByID(id));   
    }

}
