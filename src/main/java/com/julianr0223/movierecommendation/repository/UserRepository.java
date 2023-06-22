package com.julianr0223.movierecommendation.repository;

import com.julianr0223.movierecommendation.entity.User;
import org.springframework.data.neo4j.repository.Neo4jRepository;

public interface UserRepository extends Neo4jRepository<User, Long> {
}
