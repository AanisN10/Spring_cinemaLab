package com.example.cinema_spring.controllers;

import com.example.cinema_spring.models.Movie;
import com.example.cinema_spring.services.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/games")
public class MovieController {

    @Autowired
    MovieService movieService;


    @GetMapping

    public ResponseEntity <List<Movie>>getAllMovies(){
        List<Movie>movies = movieService.getAllMovies();
        return new ResponseEntity<>(movies, HttpStatus.OK);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<Movie> getMovieById(@PathVariable long id){
        Movie movie = movieService.getMovieById(id);
        return new ResponseEntity<>(movie,HttpStatus.OK);
    }


    @PostMapping

    public  ResponseEntity<Movie> addtoMovie(@RequestBody Movie movie){
        Movie addToMovie = movieService.addToMovie(movie);
        return new ResponseEntity<>(addToMovie, HttpStatus.OK);
    }

    //extension
    @PatchMapping





    @DeleteMapping




}
