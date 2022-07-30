package com.example.demobackend.facade;

import com.example.demobackend.entity.Categoria;
import com.example.demobackend.repository.CategoriaRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.transaction.Transactional;
import java.util.List;


@Component
public class CategoriaFacade {

    @Autowired
    private CategoriaRepo categoriaRepo;

    @Transactional
    public List<Categoria> findAllCategories(){
        List<Categoria> todascategorias = (List<Categoria>) categoriaRepo.findAll();
        return todascategorias;
    }

    @Transactional
    public Categoria saveCategoria(Categoria categoria) {
        Categoria caProducto = categoriaRepo.save(categoria);
        return caProducto;
    }

    @Transactional
    public void deleteCategoria(Integer id) {
        categoriaRepo.deleteById(id);
    }
}
