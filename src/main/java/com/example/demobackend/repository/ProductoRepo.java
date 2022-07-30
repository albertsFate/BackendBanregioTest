package com.example.demobackend.repository;


import com.example.demobackend.entity.Producto;
import org.springframework.data.repository.CrudRepository;

public interface ProductoRepo extends CrudRepository<Producto, Integer> {
}
