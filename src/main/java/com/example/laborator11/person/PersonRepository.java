package com.example.laborator11.person;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

//interfata responsabila cu data acces
@Repository
public interface PersonRepository extends JpaRepository<Person, Integer> {
}
