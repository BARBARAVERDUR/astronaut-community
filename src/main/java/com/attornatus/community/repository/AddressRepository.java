
package com.attornatus.community.repository;

import com.attornatus.community.model.entity.Address;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;


public interface AddressRepository extends JpaRepository<Address, Long> {
    
    @Query
    ("SELECT a FROM Address a WHERE a.favorite = :favorite")
    public Address favorite(@Param("favorite") Boolean favorite);
}
