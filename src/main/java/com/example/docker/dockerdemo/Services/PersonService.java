package com.example.docker.dockerdemo.Services;

import com.example.docker.dockerdemo.DAO.PersonServiceDAO;
import com.example.docker.dockerdemo.Models.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by adahiy3 on 26/01/19.
 */
@Service
public class PersonService {

    @Autowired
    private PersonServiceDAO personServiceDAO;

    public Person savePerson(Person person){

        return personServiceDAO.save(person);

    }

    public Iterable<Person> savepersons(List<Person> persons) {

        return personServiceDAO.saveAll(persons);
    }

    public List<Person> getAllPerson(List<Integer> listofid) {

        return (List<Person>) personServiceDAO.findAllById(listofid);
    }

    public List<Person> findpersonByLastname(String lastname) {

        return personServiceDAO.findByPersonLastName(lastname);

    }

    public List<Person> findPersonUsingFirstNameandLastName(String firstName, String lastName) {
        return personServiceDAO.getPersonByFirstNameAndLastName(firstName, lastName);
    }



   /* public Person findPersonByFirstName(String firstname) {
        return personServiceDAO.findByFirstName();
    }*/
}
