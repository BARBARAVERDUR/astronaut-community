
package com.attornatus.community.service;

/*
import com.attornatus.community.mappers.PersonMapper;
import com.attornatus.community.model.dto.ListPeopleResponse;
import com.attornatus.community.model.dto.PersonRequest;
import com.attornatus.community.model.dto.PersonResponse;
import com.attornatus.community.model.entity.Person;
import com.attornatus.community.repository.PersonRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonService {
    
  /*  @Autowired
    private PersonRepository personRepository;
    
    @Autowired
    private PersonMapper mapper;
    
    public PersonResponse create(PersonRequest request){
        
        Person person = mapper.map(request);    
        personRepository.save(person);
       
        return mapper.map(person);
    }
    
    public ListPeopleResponse findAll(){
        
        List<Person> people = personRepository.findAll();
        
        ListPeopleResponse peopleResponse = new ListPeopleResponse();
        peopleResponse.setPeople(mapper.map(people));
        
        return peopleResponse;
    }
    
    public void delete(Integer id) throws Exception {

        findByID(id);
        personRepository.deleteById(id);

    }
    
    public PersonResponse update(PersonRequest request,Integer id ) throws Exception{
        
        Person person = findByID(id);
        
        person.setName(request.getName());
        person.setBirthdate(request.getBirthdate());
        person.setAddress(request.getAddress());
  
        personRepository.save(person);
        return mapper.map(person);
    }

    private Person findByID(Integer id) throws Exception {
        
        Optional<Person> person = personRepository.findById(id);
        
        if (person.isPresent()) {
            return person.get();
        } else {
           throw new Exception("O usuário não está registrado."); 

        }
    }
    
    public PersonResponse getResponseById(Integer id) throws Exception{
        
     return mapper.map(findByID(id));   
    }

}*/
