package com.tuuniversidad.biblioteca.controllers;

import com.tuuniversidad.biblioteca.exceptions.LibroException;
import com.tuuniversidad.biblioteca.models.Libro;
import com.tuuniversidad.biblioteca.services.LibroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/libros")
public class LibroController {

    @Autowired
    private LibroService libroService;

    @GetMapping
    public List<Libro> getAllLibros() {
        return libroService.findAll();
    }

    @GetMapping("/{id_libro}")
    public Libro getLibroById(@PathVariable("id_libro") Long id) {
        Libro libro = libroService.findById(id);
        if (libro == null) {
            throw new LibroException("El libro con ID " + id + " no fue encontrado.");
        }
        return libro;
    }

    @PostMapping
    public ResponseEntity<Void> addLibro(@RequestBody Libro libro) {
        libroService.save(libro);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @ExceptionHandler(LibroException.class)
    public ResponseEntity<String> handleLibroException(LibroException ex) {
        return new ResponseEntity<>(ex.getMessage(), HttpStatus.NOT_FOUND);
    }
}
