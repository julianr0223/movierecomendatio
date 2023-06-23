package com.julianr0223.movierecommendation.entity;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.neo4j.core.schema.GeneratedValue;
import org.springframework.data.neo4j.core.schema.Node;
import org.springframework.data.neo4j.core.schema.Relationship;

@Node
@Getter
@Setter
public class Movie {

    @Id
    @GeneratedValue
    private Long id;

    private int released;

    private String tagline;

    private String title;
}
