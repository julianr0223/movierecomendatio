package com.julianr0223.movierecommendation.controller;

import com.julianr0223.movierecommendation.entity.Movie;
import com.julianr0223.movierecommendation.repository.MovieRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/movie")
public class MovieController {

    private final MovieRepository movieRepository;

    public MovieController(MovieRepository movieRepository) {
        this.movieRepository = movieRepository;
    }

    @GetMapping
    public List<Movie> getAllMovies() {
        return movieRepository.findAll();
    }

    @GetMapping("/{title}")
    public Movie getMovieByTitle(@PathVariable String title) {
        return movieRepository.findByTitle(title);
    }

    @PostMapping
    public Movie createMovie(@RequestBody Movie movie){
        return movieRepository.save(movie);
    }

    @PutMapping("/{id}")
    public Movie updateMovie(@PathVariable Long id, @RequestBody Movie movie) {
        Movie existingMovie = movieRepository.findById(id).orElse(null);
        if (existingMovie != null) {
            existingMovie.setReleased(movie.getReleased());
            existingMovie.setTagline(movie.getTagline());
            existingMovie.setTitle(movie.getTitle());
            return movieRepository.save(existingMovie);
        }
        return null;
    }

    @DeleteMapping("/{id}")
    public void deleteMovie(@PathVariable Long id) {
        movieRepository.deleteById(id);
    }

    @GetMapping("/acted_in/{personName}")
    public List<Movie> getMoviesByPersonActedIn(@PathVariable String personName) {
        return movieRepository.findByActedIn(personName);
    }
}
