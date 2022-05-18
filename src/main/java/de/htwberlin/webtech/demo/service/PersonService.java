package de.htwberlin.webtech.demo.service;

import de.htwberlin.webtech.demo.persistence.PersonEntity;
import de.htwberlin.webtech.demo.persistence.PersonRepository;
import de.htwberlin.webtech.demo.web.api.Person;
import de.htwberlin.webtech.demo.web.api.PersonManipulationRequest;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class PersonService {

    private final PersonRepository personRepository;

    public PersonService(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

   public List<Person> findAll(){
        List<PersonEntity> persons = personRepository.findAll();
        return persons.stream()
                .map(this::transformEntity)
                .collect(Collectors.toList());
   }

   public Person create(PersonManipulationRequest request){
     var personEntity = new PersonEntity(request.getFirstname(),
                                         request.getLastname(),
                                         request.isOfferedSomething(),
                                         request.isSearchedSomething(),
                                         request.getContactDetails());
     personEntity =personRepository.save(personEntity);
     return transformEntity(personEntity);
   }

   private Person transformEntity(PersonEntity personEntity){
        return new Person(personEntity.getId(),
                personEntity.getFirstname(),
                personEntity.getLastname(),
                personEntity.isOfferedSomething(),
                personEntity.isSearchedSomething(),
                personEntity.getContactDetails());

   }

    public Person findById(Long id) {
        var personEntity= personRepository.findById(id);
        return personEntity.isPresent()? transformEntity(personEntity.get()) : null;
    }

   public Person update(Long id, PersonManipulationRequest request) {
        var personEntityOptional= personRepository.findById(id);
        if(personEntityOptional.isEmpty()){return  null;}
        var personEntity =  personEntityOptional.get();
        personEntity.setFirstname(request.getFirstname());
        personEntity.setLastname(request.getLastname());
        personEntity.setContactDetails(request.getContactDetails());
        personEntity.setOfferedSomething(request.isOfferedSomething());
        personEntity.setSearchedSomething(request.isSearchedSomething());
        personEntity= personRepository.save(personEntity);
        return transformEntity(personEntity);
   }

   public boolean deleteById(Long id){
        if(!personRepository.existsById(id)){return false;}
        personRepository.deleteById(id);
        return true;
   }
}
