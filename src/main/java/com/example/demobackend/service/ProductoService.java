package com.example.demobackend.service;

import com.example.demobackend.entity.Producto;
import com.example.demobackend.facade.ProductoFacade;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductoService {

    @Autowired
    private ProductoFacade productoFacade;


    public List<Producto> findAllProducts(){
        return productoFacade.findAllProducts();
    }

    public Producto saveProducto(Producto producto) {
        return productoFacade.saveProducto(producto);
    }

    public void deleteProducto(Integer id) {
        productoFacade.deleteProducto(id);
    }

    public Optional<Producto> findById(Integer id) {
        return productoFacade.findById(id);
    }
}
