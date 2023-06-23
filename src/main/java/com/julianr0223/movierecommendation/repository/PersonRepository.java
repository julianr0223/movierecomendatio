package com.julianr0223.movierecommendation.repository;

import com.julianr0223.movierecommendation.entity.Person;
import org.springframework.data.neo4j.repository.Neo4jRepository;

public interface PersonRepository extends Neo4jRepository<Person, Long> {
}
