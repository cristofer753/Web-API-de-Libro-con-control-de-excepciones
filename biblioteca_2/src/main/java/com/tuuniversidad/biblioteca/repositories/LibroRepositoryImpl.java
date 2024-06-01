package com.tuuniversidad.biblioteca.repositories;

import com.tuuniversidad.biblioteca.models.Libro;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class LibroRepositoryImpl implements LibroRepository {
    private List<Libro> libros = new ArrayList<>();

    public LibroRepositoryImpl() {
        libros.add(new Libro(1L, "El Quijote", "Miguel de Cervantes", "Francisco de Robles", 1605));
        libros.add(new Libro(2L, "Cien años de soledad", "Gabriel García Márquez", "Editorial Sudamericana", 1967));
        libros.add(new Libro(3L, "Don Juan Tenorio", "José Zorrilla", "Juan de la Cuesta", 1844));
    }

    public List<Libro> findAll() {
        System.out.println("Conectando a la base de datos POSTGRESQL");
        return libros;
    }

    public Libro findById(Long id) {
        return libros.stream().filter(libro -> libro.getId().equals(id)).findFirst().orElse(null);
    }

    public void save(Libro libro) {
        libros.add(libro);
    }
}
