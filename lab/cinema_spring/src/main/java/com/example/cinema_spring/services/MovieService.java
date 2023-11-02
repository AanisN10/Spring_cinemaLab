package com.example.cinema_spring.services;

import com.example.cinema_spring.models.Movie;
import com.example.cinema_spring.repositories.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovieService {

    @Autowired
    MovieRepository movieRepository;


    public MovieService(){
     }


    public Movie getMovieById(long id) {
        return movieRepository.findById(id).get();
    }

    public List<Movie> getAllMovies() {
        return movieRepository.findAll();
    }


//    method to add movie or save movie
    public Movie saveMovieToList(Movie movie){
        return movieRepository.save(movie);
    }


   // method to delete
    public void removeMovie(long id){
        movieRepository.deleteById(id);
    }

    // method to update
}
