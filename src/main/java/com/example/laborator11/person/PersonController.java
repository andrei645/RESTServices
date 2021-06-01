package com.example.laborator11.person;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping
public class PersonController {
    private final PersonService personService;

    @Autowired
    public PersonController(PersonService personService) {
        this.personService = personService;
    }

    @GetMapping () //get request
    public List<Person> getPerson(){
            return personService.getPerson();
    }

    @PostMapping
    public void registerPerson(@RequestBody Person person){
        personService.addPerson(person);
    }

    @PutMapping (path = "api/v1/problemcontroller/response")
    public void updatePerson (
            @PathVariable("personId") Integer personId,
            @RequestParam (required = false) Integer age){
            personService.updatePerson(personId, age);
    }


    @DeleteMapping (path = "{personId}")
    public void deletePerson(@PathVariable("personId") Integer id) {
        personService.deletePerson(id);
    }
}
