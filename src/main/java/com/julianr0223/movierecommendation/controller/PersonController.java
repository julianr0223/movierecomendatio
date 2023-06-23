package com.julianr0223.movierecommendation.controller;

import com.julianr0223.movierecommendation.entity.Person;
import com.julianr0223.movierecommendation.repository.PersonRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/person")
public class PersonController {

    private final PersonRepository personRepository;

    public PersonController(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    @GetMapping
    public List<Person> getAllUsers() {
        return personRepository.findAll();
    }

    @GetMapping("/{id}")
    public Person getUserById(@PathVariable Long id) {
        return personRepository.findById(id).orElse(null);
    }

    @PostMapping
    public Person createUser(@RequestBody Person person) {
        return personRepository.save(person);
    }

    @PutMapping("/{id}")
    public Person updateUser(@PathVariable Long id, @RequestBody Person person) {
        Person existingPerson = personRepository.findById(id).orElse(null);
        if (existingPerson != null) {
            existingPerson.setName(person.getName());
            existingPerson.setBorn(person.getBorn());
            return personRepository.save(existingPerson);
        }
        return null;
    }

    @DeleteMapping("/{id}")
    public void deleteUser(@PathVariable Long id) {
        personRepository.deleteById(id);
    }

}
