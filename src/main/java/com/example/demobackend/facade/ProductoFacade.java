package com.example.demobackend.facade;

import com.example.demobackend.entity.Producto;
import com.example.demobackend.repository.CategoriaRepo;
import com.example.demobackend.repository.ProductoRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Component
public class ProductoFacade {

    @Autowired
    private ProductoRepo productoRepo;

    @Transactional
    public List<Producto> findAllProducts(){
        List<Producto> todosproductos = (List<Producto>) productoRepo.findAll();
        return todosproductos;
    }

    @Transactional
    public Producto saveProducto(Producto producto) {
        Producto productosave = productoRepo.save(producto);
        return productosave;
    }

    @Transactional
    public void deleteProducto(Integer id) {
        productoRepo.deleteById(id);
    }

    @Transactional
    public Optional<Producto> findById(Integer id) {
        Optional<Producto> productoPorId = productoRepo.findById(id);
        return productoPorId;

    }


}
