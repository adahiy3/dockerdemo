package com.example.docker.dockerdemo.Models;

import javax.persistence.*;

/**
 * Created by adahiy3 on 26/01/19.
 */
@Entity
@Table(name = "person")
public class Person {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "person_id")
    Integer personId;

    @Column(name = "first_name",nullable = false)
    String personFirstName;
    @Column(name = "last_name")
    String personLastName;

    public Person(String personFirstName, String personLastName) {
        this.personFirstName = personFirstName;
        this.personLastName = personLastName;
    }

    public Integer getPersonId() {
        return personId;
    }

    public String getPersonFirstName() {
        return personFirstName;
    }

    public void setPersonFirstName(String personFirstName) {
        this.personFirstName = personFirstName;
    }

    public String getPersonLastName() {
        return personLastName;
    }

    public void setPersonLastName(String personLastName) {
        this.personLastName = personLastName;
    }

    public Person() {
    }
}
