package br.com.luizsn.VassCommerce.controller;


import br.com.luizsn.VassCommerce.model.Categoria;
import br.com.luizsn.VassCommerce.service.CategoriaService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
@RequestMapping("/categoria")
public class CategoriaController {

    private final CategoriaService categoriaService;

    public CategoriaController(CategoriaService categoriaService) {
        this.categoriaService = categoriaService;
    }

    //  GET /categoria - lista todas categorais
    @GetMapping
    public List<Categoria> listarCategorias() {
        return categoriaService.ListarTodos();
    }
}