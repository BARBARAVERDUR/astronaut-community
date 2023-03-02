
package com.attornatus.community.repository;

import com.attornatus.community.model.entity.Address;
import org.springframework.data.jpa.repository.JpaRepository;


public interface AddressRepository extends JpaRepository<Address, Long> {
    
}
