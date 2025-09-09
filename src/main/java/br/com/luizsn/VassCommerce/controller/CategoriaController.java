package br.com.luizsn.VassCommerce.controller;


import br.com.luizsn.VassCommerce.model.Categoria;
import br.com.luizsn.VassCommerce.service.CategoriaService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
@RequestMapping
public class CategoriaController {

    private final CategoriaService categoriaService;

    public CategoriaController(CategoriaService categoriaService) {
        this.categoriaService = categoriaService;
    }

    //  GET /categoria - filtragem de lista por nome
    @GetMapping("/categoria")
    public List<Categoria> listarCategorias(@RequestParam(required = false) String nome ) {
        if (nome != null && !nome.isBlank()) {
            return categoriaService.buscarPorNome(nome);
        }
        return categoriaService.listarTodos();
    }
}