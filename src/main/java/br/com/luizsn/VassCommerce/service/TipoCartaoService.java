package br.com.luizsn.VassCommerce.service;

import br.com.luizsn.VassCommerce.model.formasdepagamento.Cartao;
import br.com.luizsn.VassCommerce.model.formasdepagamento.TipoCartao;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;



@Service
public class TipoCartaoService {
    //Listar todos tipos de cartão
    public List<TipoCartao>todosTipoCartao(){
        return Arrays.asList(TipoCartao.values());
    }


}
