package com.example.cinema_spring.controllers;

import com.example.cinema_spring.models.Movie;
import com.example.cinema_spring.services.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/movies")
public class MovieController {

    @Autowired
    MovieService movieService;


    @GetMapping // display all movies

    public ResponseEntity <List<Movie>>getAllMovies(){
        List<Movie>movies = movieService.getAllMovies();
        return new ResponseEntity<>(movies, HttpStatus.OK);
    }

    @GetMapping(value = "/{id}") // display movies using id
    public ResponseEntity<Movie> getMovieById(@PathVariable long id){
        Movie movie = movieService.getMovieById(id);
        return new ResponseEntity<>(movie,HttpStatus.OK);
    }


    @PostMapping // add new movie to the database

    public  ResponseEntity<Movie> saveMovietoList(@RequestBody Movie movie){
        Movie saveMovie = movieService.saveMovieToList(movie);
        return new ResponseEntity<>(saveMovie, HttpStatus.CREATED);
    }

//    extension to complete for weekend
    @PatchMapping





    @DeleteMapping(value = "/{id") // delete by id method
    public ResponseEntity<Movie>removeMovie(@PathVariable long id){
         movieService.removeMovie(id);
        return  new ResponseEntity<>(null, HttpStatus.GONE);
    }




}
