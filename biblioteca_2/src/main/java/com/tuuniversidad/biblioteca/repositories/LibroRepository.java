package com.tuuniversidad.biblioteca.repositories;

import com.tuuniversidad.biblioteca.models.Libro;
import java.util.List;

public interface LibroRepository {
    List<Libro> findAll();
    Libro findById(Long id);
    void save(Libro libro);
}
