package com.julianr0223.movierecommendation.entity.relationShip;

import com.julianr0223.movierecommendation.entity.Movie;
import com.julianr0223.movierecommendation.entity.Person;
import org.springframework.data.neo4j.core.schema.GeneratedValue;
import org.springframework.data.neo4j.core.schema.Id;
import org.springframework.data.neo4j.core.schema.RelationshipProperties;

//@RelationshipEntity(type = "ACTED_IN")
@RelationshipProperties()
public class ActedIn {
    @Id
    @GeneratedValue
    private Long id;

//    @Start
    private Person person;

//    @EndNode
    private Movie movie;

    // Add additional properties or methods if needed

    // Getters and setters
}
