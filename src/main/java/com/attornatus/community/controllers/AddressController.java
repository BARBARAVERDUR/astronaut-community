
package com.attornatus.community.controllers;

import com.attornatus.community.model.dto.request.AddressRequestDto;
import com.attornatus.community.model.dto.response.AddressResponseDetailsDto;
import com.attornatus.community.model.dto.response.ListAddressResponseDto;
import com.attornatus.community.service.AddressService;
import jakarta.transaction.Transactional;
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
@RequestMapping("/address")
@CrossOrigin(origins = "*")
public class AddressController {
    
    
    @Autowired
    private AddressService addressService;
    
    @PostMapping
    @Transactional
    public ResponseEntity<AddressResponseDetailsDto> save (@RequestBody AddressRequestDto request ){
        return ResponseEntity.status(HttpStatusCode.valueOf(201)).body(addressService.create(request));
    }
    
     
    @GetMapping
    public ResponseEntity<ListAddressResponseDto> list(){
        return ResponseEntity.ok().body(addressService.findAll());
    }
    
    @DeleteMapping("/{id}")
    @Transactional
    public ResponseEntity<Void> delete(@PathVariable Long id) throws Exception{     
        addressService.delete(id);
        return ResponseEntity.noContent().build();    
    }
    
    @GetMapping("/{id}")
    public ResponseEntity<AddressResponseDetailsDto> findById(@PathVariable Long id) throws Exception{
        return ResponseEntity.ok().body(addressService.getResponseId(id));
    }
    
    @PutMapping("/{id}")
    @Transactional
    public ResponseEntity<AddressResponseDetailsDto> update(@PathVariable Long id, 
            @RequestBody AddressRequestDto request)throws Exception {
        
        return ResponseEntity.ok().body(addressService.update(request, id));
    }
    
    
}
