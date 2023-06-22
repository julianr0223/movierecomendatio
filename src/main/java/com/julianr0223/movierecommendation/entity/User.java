package com.julianr0223.movierecommendation.entity;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.neo4j.core.schema.Id;
import org.springframework.data.neo4j.core.schema.Node;

@Node
@Getter
@Setter
public class User {
    @Id
    private Long id;
    private String name;
    private String email;
}
