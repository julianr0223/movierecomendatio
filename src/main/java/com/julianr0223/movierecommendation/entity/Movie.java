package com.julianr0223.movierecommendation.entity;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.neo4j.core.schema.Node;

@Node
@Getter
@Setter
public class Movie {

    @Id
    private Long id;
    private String title;
    private double imdbRating;
}
