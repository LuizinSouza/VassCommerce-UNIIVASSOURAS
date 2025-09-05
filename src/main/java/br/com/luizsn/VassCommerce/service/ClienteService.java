package br.com.luizsn.VassCommerce.service;

import br.com.luizsn.VassCommerce.model.Cliente;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service

public class ClienteService {
    private final List<Cliente> clientes =  new ArrayList<>();

    LocalDate dataNascimento = LocalDate.of(2005, 3, 3);
    public ClienteService(){
        clientes.add(new Cliente(
                1,
                "Luiz Henrique",
                "luiz@gmail.com",
                "1234",
                new Date(),new Date(),
                "",
                dataNascimento,
                "1234567"
        ));
    }

    //visualizar dados do cliente pelo ID

    public Cliente dadosCliente(long id){
        return clientes.stream()
                .filter(c -> c.getId() == id)
                .findFirst()
                .orElse(null);
    }
}
