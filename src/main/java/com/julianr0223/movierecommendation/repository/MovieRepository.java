package com.julianr0223.movierecommendation.repository;

import com.julianr0223.movierecommendation.entity.Movie;
import org.springframework.data.neo4j.repository.Neo4jRepository;

public interface MovieRepository extends Neo4jRepository<Movie, Long> {
}
