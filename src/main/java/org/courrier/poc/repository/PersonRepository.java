package org.courrier.poc.repository;

import org.courrier.poc.domain.Person;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by simon on 02/09/2016.
 */
public interface PersonRepository extends JpaRepository<Person,Long>{
    Person findByUsername(String username);
}
