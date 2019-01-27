package com.example.docker.dockerdemo.DAO;

import com.example.docker.dockerdemo.Models.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by adahiy3 on 26/01/19.
 */
public interface PersonServiceDAO extends CrudRepository<Person, Integer> {

    List<Person> findByPersonLastName(String lastname);

    @Query(value = "Select  * from PERSON p where p.FIRST_NAME=?1 and p.LAST_NAME=?2", nativeQuery = true)
    List<Person> getPersonByFirstNameAndLastName(String firstName, String lastName);
}
