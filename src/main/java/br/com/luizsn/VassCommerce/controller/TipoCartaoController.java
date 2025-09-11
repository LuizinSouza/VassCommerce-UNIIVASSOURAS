package br.com.luizsn.VassCommerce.controller;

import br.com.luizsn.VassCommerce.model.formasdepagamento.TipoCartao;
import br.com.luizsn.VassCommerce.service.TipoCartaoService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping
public class TipoCartaoController {

    private final TipoCartaoService tipoCartaoService;

    public TipoCartaoController(TipoCartaoService tipoCartaoService){
        this.tipoCartaoService = tipoCartaoService;
    }

    //Get /tipo-cartao -> listar todos os tipos de cartoes

    @GetMapping("/tipo-cartao")
    public List<TipoCartao> listarTipoCartao(){
        return tipoCartaoService.todosTipoCartao();
    }
}
