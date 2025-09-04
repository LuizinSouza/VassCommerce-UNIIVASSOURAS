package br.com.luizsn.VassCommerce.service;


import br.com.luizsn.VassCommerce.model.Produto;
import org.springframework.stereotype.Service;


import java.util.List;
import java.util.ArrayList;
import java.util.Date;
import java.math.BigDecimal;



@Service
public class ProdutoService {
    private final List<Produto> produtos;

    public ProdutoService(){
        produtos = new ArrayList<>();
        produtos.add(new Produto(1,
                "notebook",
                "Notebook 16gb RAM",
                "http//lojaweb/notebook.jpg",
                new Date(),new Date(), new BigDecimal("4500")
        ));

        produtos.add(new Produto(
                2,
                "teclado gamer",
                "teclado mecanico 80%",
                "http://lojaweb/jpg",
                new Date(),new Date(), new BigDecimal("4500")
        ));
    }

    public Produto buscarProdutoId(int id){
        return produtos.stream()
                .filter(p-> p.getId() == id)
                .findFirst()
                .orElseThrow(() -> new RuntimeException("Este produto não existe! id:"+ id));
    }

    public List<Produto> listarTodos(){
        return produtos;
    }



}
