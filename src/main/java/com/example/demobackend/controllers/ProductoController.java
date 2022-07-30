package com.example.demobackend.controllers;

import com.example.demobackend.entity.Producto;
import com.example.demobackend.service.ProductoService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/producto")
public class ProductoController {

    @Autowired
    ProductoService productoService;


    @CrossOrigin
    @ApiOperation(value="Consulta de todos los productos.",notes="Regresa todos los productos que existen.")
    @GetMapping
    @ResponseBody
    public List<Producto> findAllProductos(){
        return productoService.findAllProducts();
    }

    @CrossOrigin
    @ApiOperation(value="Consulta un producto por id",notes="Consulta el producto con el id ingresado.")
    @GetMapping(value = "/{id}")
    @ResponseBody
    public Optional<Producto> findById(@PathVariable("id")int id){
        return productoService.findById(id);
    }

    @CrossOrigin
    @ApiOperation(value="Guarda un nuevo producto.",notes="Guarda un producto en la BD para hacer uso después de el")
    @PostMapping
    public Producto saveProducto(@RequestBody Producto producto){
        return productoService.saveProducto(producto);
    }

    @CrossOrigin
    @ApiOperation(value="Actualizar el objeto de producto",notes="Actualiza los valores de un producto existente")
    @PutMapping("/")
    public Producto updateProducto(@RequestBody Producto producto){
        return productoService.saveProducto(producto);
    }

    @CrossOrigin
    @ApiOperation(value="Eliminar un producto",notes="Busca un producto por ID y si existe lo elimina")
    @DeleteMapping(value = "/{id}")
    public void deleteProducto(@PathVariable("id")int id) {
        productoService.deleteProducto(id);
    }


}
