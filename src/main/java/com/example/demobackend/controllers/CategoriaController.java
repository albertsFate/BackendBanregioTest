package com.example.demobackend.controllers;

import com.example.demobackend.entity.Categoria;
import com.example.demobackend.service.CategoriaService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/categoria")
public class CategoriaController {
    @Autowired
    CategoriaService categoriaService;

    @CrossOrigin
    @ApiOperation(value="Consulta de todas las categorias.",notes="Regresa todas las categorias que existen")
    @GetMapping("/")
    @ResponseBody
    public List<Categoria> findAllCategorias(){
        return categoriaService.findAllCategories();
    }

    @CrossOrigin
    @ApiOperation(value="Guarda una nueva categoria",notes="Guarda una categoria en la lista para poder hacer uso de ella.")
    @PostMapping("/")
    public Categoria saveCategoria(@RequestBody Categoria categoria){
        return categoriaService.saveCategoria(categoria);
    }

    @CrossOrigin
    @ApiOperation(value="Actualiza los valores de una categoria",notes="Actualiza los valores de una categoria existente")
    @PutMapping("/")
    public Categoria updateCategoria(@RequestBody Categoria categoria){
        return categoriaService.saveCategoria(categoria);
    }

    @CrossOrigin
    @ApiOperation(value="Eliminar una categoria",notes="Busca por id una categoria y si existe sera eliminada de la BD")
    @DeleteMapping(value = "/{id}")
    public void deleteCategoria(@PathVariable("id")int id) {
        categoriaService.deleteCategoria(id);
    }
}
