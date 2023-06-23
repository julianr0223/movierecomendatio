package com.julianr0223.movierecommendation.repository;

import com.julianr0223.movierecommendation.entity.Movie;
import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.data.neo4j.repository.query.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface MovieRepository extends Neo4jRepository<Movie, Long> {
    Movie findByTitle(@Param("title") String title);

    @Query("MATCH (p:Person {name: $personName})-[:ACTED_IN]->(m:Movie) return m")
    List<Movie> findByActedIn(@Param("personName") String personName);
}
