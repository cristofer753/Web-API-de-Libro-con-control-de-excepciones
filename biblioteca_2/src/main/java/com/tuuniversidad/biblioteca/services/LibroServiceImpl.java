package com.tuuniversidad.biblioteca.services;

import com.tuuniversidad.biblioteca.models.Libro;
import com.tuuniversidad.biblioteca.repositories.LibroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LibroServiceImpl implements LibroService {

    @Autowired
    private LibroRepository libroRepository;

    @Override
    public List<Libro> findAll() {
        return libroRepository.findAll();
    }

    @Override
    public Libro findById(Long id) {
        return libroRepository.findById(id);
    }

    @Override
    public void save(Libro libro) {
        libroRepository.save(libro);
    }
}

