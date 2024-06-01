package com.tuuniversidad.biblioteca.services;

import com.tuuniversidad.biblioteca.models.Libro;
import java.util.List;

public interface LibroService {
    List<Libro> findAll();
    Libro findById(Long id);
    void save(Libro libro);
}
