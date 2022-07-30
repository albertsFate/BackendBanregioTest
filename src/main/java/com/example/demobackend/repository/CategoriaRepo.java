package com.example.demobackend.repository;

import com.example.demobackend.entity.Categoria;
import org.springframework.data.repository.CrudRepository;

public interface CategoriaRepo extends CrudRepository<Categoria, Integer> {
}
