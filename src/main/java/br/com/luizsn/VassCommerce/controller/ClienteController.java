package br.com.luizsn.VassCommerce.controller;




import br.com.luizsn.VassCommerce.model.Cliente;
import br.com.luizsn.VassCommerce.service.ClienteService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class ClienteController {
    private final  ClienteService clienteService;

    public ClienteController(ClienteService clienteService){
        this.clienteService = clienteService;
    }

    //Get /CLIENTE/{id}/ -> visualizar dados do cliente

    @GetMapping("/cliente/{id}")
    public Cliente VisuzalizarDadosCliente(@PathVariable long id){
        return clienteService.dadosCliente(id);
    }
}
