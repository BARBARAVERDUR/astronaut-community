
package com.attornatus.community.repository;

import com.attornatus.community.model.entity.Person;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonRepository extends JpaRepository<Person, Integer>{
    
    @Query
    ("SELECT p FROM Person p WHERE p.name = :name")
    public List<Person> lookForName(@Param("name")String name);

    @Query
    ("SELECT p FROM Persona p WHERE P.address.CEP = :CEP")
    public List<Person> lookForCep(@Param("CEP") String CEP);
    
    
}
