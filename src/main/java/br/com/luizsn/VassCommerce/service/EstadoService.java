package br.com.luizsn.VassCommerce.service;

import br.com.luizsn.VassCommerce.model.Cliente;
import br.com.luizsn.VassCommerce.model.endereco.Cidade;
import br.com.luizsn.VassCommerce.model.endereco.Endereco;
import br.com.luizsn.VassCommerce.model.endereco.Estado;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class EstadoService {

    private final List<Cliente> cliente;

    public EstadoService(ClienteService clienteService){
        this.cliente = clienteService.getCliente();
    }
    //LISTAR TODOS OS ESTADOS
    public List<Estado> todosEstados(){
        return cliente.stream()
                .map(Cliente::getEndereco)
                .map(Endereco::getCidade)
                .map(Cidade::getEstado)
                .distinct()
                .collect(Collectors.toList());
    }

    //LISTAR TODASS CIDADES DE UM ESTADO
    public List<Cidade> todasCidadesEstado(@PathVariable long idEstado){
        return cliente.stream()
                .map(Cliente::getEndereco)
                .map(Endereco::getCidade)
                .filter(cidade -> cidade.getEstado().getId() == idEstado)
                .distinct()
                .collect(Collectors.toList());
    }
}
