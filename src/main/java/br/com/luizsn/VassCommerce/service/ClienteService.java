package br.com.luizsn.VassCommerce.service;

import br.com.luizsn.VassCommerce.model.Cliente;
import br.com.luizsn.VassCommerce.model.FormasDePagamento.Cartao;
import br.com.luizsn.VassCommerce.model.FormasDePagamento.FormasDePagamento;
import br.com.luizsn.VassCommerce.model.FormasDePagamento.TipoCartao;
import org.springframework.stereotype.Service;

import org.springframework.web.bind.annotation.RequestParam;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;

@Service

public class ClienteService {
    private final List<Cliente> cliente =  new ArrayList<>();

    LocalDate dataNascimento = LocalDate.of(2005, 3, 3);
    public ClienteService(){

                List<FormasDePagamento> formasDePagamentos = new ArrayList<>();
                formasDePagamentos.add(new Cartao(123, new Date(), false, TipoCartao.CREDITO));
                formasDePagamentos.add(new Cartao(122, new Date(), false,TipoCartao.DEBITO));

                cliente.add(new Cliente(
                1,
                "Luiz Henrique",
                "luiz@gmail.com",
                "1234",
                new Date(),new Date(),
                "",
                dataNascimento,
                "1234567",
                formasDePagamentos
        ));
    }

    //visualizar dados do cliente pelo ID

    public Cliente dadosCliente(long id){
        return cliente.stream()
                .filter(c -> c.getId() == id)
                .findFirst()
                .orElse(null);
    }

    //Listar todas as formas de pagamento pelo ID do cliente
    public List<FormasDePagamento>  formasDePagamentosCliente(@RequestParam long id){
        return cliente.stream()
                .filter(c -> c.getId() == id)
                .map(Cliente::getFormasDePagamento)
                .findFirst()
                .orElse(Collections.emptyList());
    }
}
