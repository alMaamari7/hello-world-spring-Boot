package de.htwberlin.webtech.demo.web;

import de.htwberlin.webtech.demo.web.api.Person;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class PersonRestController {

   private List<Person> persons;

   public PersonRestController(){
       persons= new ArrayList<>();
        persons.add(new Person(1, "Asaad", "al-Maamari"));
       persons.add(new Person(2, "Nour", "al-Hasan"));
   }

    @GetMapping(path ="/api/v1/persons")
    public ResponseEntity <List<Person>> fetchPersons(){
      return ResponseEntity.ok(persons) ;
    }

}

