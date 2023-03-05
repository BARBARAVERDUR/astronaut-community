
package com.attornatus.community.controllers;

import com.attornatus.community.model.dto.request.AddressRequestDto;
import com.attornatus.community.model.dto.request.PersonRequestDto;
import com.attornatus.community.model.dto.response.ListPeopleResponseDto;
import com.attornatus.community.model.dto.response.PersonResponseDetailsDto;
import com.attornatus.community.model.entity.Address;
import com.attornatus.community.model.entity.Person;
import com.attornatus.community.repository.AddressRepository;
import com.attornatus.community.repository.PersonRepository;
import com.attornatus.community.service.PersonService;
import jakarta.transaction.Transactional;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/person")
@CrossOrigin(origins = "*")
public class PersonController {

    @Autowired
    private PersonService personService;
    
    @Autowired
    private PersonRepository personRepository;

    
     @PostMapping
    @Transactional
    public ResponseEntity<PersonResponseDetailsDto> save (@RequestBody PersonRequestDto request ) throws Exception{
        return ResponseEntity.status(HttpStatusCode.valueOf(201)).body(personService.create(request ));
    }
    
    @GetMapping
    public ResponseEntity<ListPeopleResponseDto> list(){
        return ResponseEntity.ok().body(personService.findAll());
    }
    
    @DeleteMapping("/{id}")
    @Transactional
    public ResponseEntity<Void> delete(@PathVariable Integer id) throws Exception{     
        personService.delete(id);
        return ResponseEntity.noContent().build();    
    }
    
    @GetMapping("/{id}")
    public ResponseEntity<PersonResponseDetailsDto> findById(@PathVariable Integer id) throws Exception{
        return ResponseEntity.ok().body(personService.getResponseById(id));
    }
    
    @PutMapping("/{id}")
    @Transactional
    public ResponseEntity<PersonResponseDetailsDto> update(@PathVariable Integer id, 
            @RequestBody PersonRequestDto request)throws Exception {
        
        return ResponseEntity.ok().body(personService.update(request, id));
    }
    
    @PostMapping("/{id}/{idAddress}")
    public ResponseEntity<PersonResponseDetailsDto> selectFavorite(
    @PathVariable Integer id, @PathVariable Long idAddress
    ) throws Exception{
        
        Person person = personRepository.getById(id);
        List<Address> address = person.getAddress();
        for (Address a : address) {
            if(a.getId().equals(idAddress)){
                 a.setFavorite(true);
            }else{
                a.setFavorite(false);
            }
        } 
        PersonResponseDetailsDto personDto = personService.getResponseById(id);

        return ResponseEntity.ok().body(personDto);
    }
}