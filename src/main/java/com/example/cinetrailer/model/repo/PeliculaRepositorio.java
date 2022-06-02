package com.example.cinetrailer.model.repo;

import com.example.cinetrailer.model.Pelicula;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PeliculaRepositorio extends JpaRepository<Pelicula, Integer> {
}
