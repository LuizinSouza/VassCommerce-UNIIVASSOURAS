package br.com.luizsn.VassCommerce.service;

import br.com.luizsn.VassCommerce.model.Categoria;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CategoriaService {
    private List<Categoria> categorias;

    public CategoriaService() {
        categorias = new ArrayList<>();
        categorias.add(new Categoria(1 ,"eletronicos.png","eletronicos","aparelhos eletronicos" ));
        categorias.add(new Categoria(2,"livros.png","livro","livros de todos os generos"));
        categorias.add(new Categoria(3,"blusas masculinas", "blusas","blusas masculinas"));
    }

    public List<Categoria> listarTodos(){
    return categorias;
    }

    public List<Categoria> buscarPorNome(String nome){
        return categorias.stream()
                .filter(c -> c.getNome().toLowerCase().contains(nome.toLowerCase()))
                .toList();
    }
}
