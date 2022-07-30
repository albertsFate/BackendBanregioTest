package com.example.demobackend;

import static org.junit.Assert.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import com.example.demobackend.controllers.ProductoController;
import com.example.demobackend.entity.Producto;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;
import java.util.Optional;

@SpringBootTest
class DemoBackendApplicationTests {

    @Autowired
    ProductoController productoController;

    @Test
    void contextLoads() {
        int x=5;
        int y=4;
        assertEquals(9, x+y);
    }

    @Test
    public void buscarProductos() {
        List<Producto> p;
        p = productoController.findAllProductos();
        assertNotNull(p);
    }

    @Test
    public void ingresarProducto() {
        Producto aux=new Producto();
        aux.setIdprod(9);
        aux.setPro_nombre("Xbox Series S");
        aux.setPro_precio(8000.50);
        productoController.saveProducto(aux);
        assertEquals(aux.getIdprod(), productoController.findById(9).get().getIdprod());
        assertEquals(aux.getPro_nombre(), productoController.findById(9).get().getPro_nombre());
        assertEquals(aux.getPro_precio(), productoController.findById(9).get().getPro_precio());
    }

    @Test
    public void modificarProducto() {
        Producto aux=new Producto();
        aux.setIdprod(9);
        aux.setPro_nombre("Xbox Serie X");
        aux.setPro_precio(13000.50);
        productoController.updateProducto(aux);
        assertEquals(aux.getIdprod(), productoController.findById(9).get().getIdprod());
        assertEquals(aux.getPro_nombre(), productoController.findById(9).get().getPro_nombre());
        assertEquals(aux.getPro_precio(), productoController.findById(9).get().getPro_precio());
    }

    @Test
    public void deleteProducto() {
        productoController.deleteProducto(4);
        assertEquals(Optional.empty(), productoController.findById(4));
    }

}
