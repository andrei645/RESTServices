package com.example.laborator11.person;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class PersonService {

    private final PersonRepository personRepository;

    @Autowired
    public PersonService(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }


    public List<Person> getPerson() {
        return personRepository.findAll();
    }

    public void addPerson(Person person) {
        personRepository.save(person);
    }

    public void deletePerson(Integer personId) {
        boolean exists = personRepository.existsById(personId);
        if (!exists) {
            throw new IllegalStateException("persoana cu id-ul" + personId + "nu exista");
        }
        personRepository.deleteById(personId);
    }

    @Transactional
    public void updatePerson(Integer personId, Integer age) {
        Person person = personRepository.findById(personId).orElseThrow(() -> new IllegalStateException(
                "persoana cu id-ul" + personId + "nu exista"));


        if (person.getAge() != age){
            person.setAge(age);
        }
    }
}