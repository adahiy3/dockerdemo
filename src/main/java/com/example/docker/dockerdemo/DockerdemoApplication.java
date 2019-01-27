package com.example.docker.dockerdemo;

import com.example.docker.dockerdemo.Models.Person;
import com.example.docker.dockerdemo.Services.PersonService;
import org.hibernate.boot.jaxb.SourceType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class DockerdemoApplication implements CommandLineRunner {

	@Autowired
	private PersonService personService;

	public static void main(String[] args) {
		SpringApplication.run(DockerdemoApplication.class, args);
	}

	@Override
	public void run(String... strings) throws Exception {

		List<Person>  persons = new ArrayList<>();



		Person p1 = new Person("sumit", "dahiya");
		Person p2;
		Person p3 = new Person("amit", "dahiya");

		persons.add(p1);
		persons.add(p3);

		//p2 = personService.savePerson(p1);
		Iterable<Person> personssaved =  personService.savepersons(persons);

		//System.out.println(p2);
		List<Person> personsdata = new ArrayList<>();
		List<Integer> listofid = new ArrayList<>();

		listofid.add(1);
		listofid.add(2);
		listofid.add(3);

		personsdata = personService.getAllPerson(listofid);
		personsdata.forEach(person->System.out.println(person.getPersonFirstName()));

		//query formed from method name example.
		//List<Person> p4 = personService.findpersonByLastname("dahiya");

		//example of names query
		List<Person> p4 = personService.findPersonUsingFirstNameandLastName("amit" , "dahiya");

	}
}

