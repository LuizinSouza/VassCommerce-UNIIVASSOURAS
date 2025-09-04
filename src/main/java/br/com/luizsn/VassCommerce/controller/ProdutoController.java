package br.com.luizsn.VassCommerce.controller;


import br.com.luizsn.VassCommerce.model.Produto;
import br.com.luizsn.VassCommerce.service.ProdutoService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping
public class ProdutoController {

    private final ProdutoService produtoService;
    public ProdutoController(ProdutoService produtoService) {
        this.produtoService = produtoService;
    }

    //GET /produto/{id} -> vizualiza os dados do produto
    @GetMapping("/produto/{id}")
    public Produto buscarProdutoPorId(@PathVariable int id){
        return  produtoService.buscarProdutoId(id);
    }
    @GetMapping("/produto")
    public List<Produto> listarTodosProdutos(){
        return produtoService.listarTodos();
    }
    //GET /categoria/{idCategoria}/produto")
    @GetMapping("/categoria/idCategoria}/produto")
    public List<Produto> listarProdutosCategoria(@PathVariable int idCategoria){
        return produtoService.listarPorCategoria(idCategoria);
    }

}
