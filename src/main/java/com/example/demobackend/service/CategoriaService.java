package com.example.demobackend.service;

import com.example.demobackend.entity.Categoria;
import com.example.demobackend.facade.CategoriaFacade;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoriaService {

    @Autowired
    private CategoriaFacade categoriaFacade;

    public List<Categoria> findAllCategories(){
        return categoriaFacade.findAllCategories();
    }

    public Categoria saveCategoria(Categoria categoria) {
        return categoriaFacade.saveCategoria(categoria);
    }

    public void deleteCategoria(Integer id) {
        categoriaFacade.deleteCategoria(id);
    }

}
