package com.example.cinema_spring.repositories;

import com.example.cinema_spring.models.Movie;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MovieRepository extends JpaRepository<Movie, Long> {
}
