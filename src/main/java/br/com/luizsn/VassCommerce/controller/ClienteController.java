package br.com.luizsn.VassCommerce.controller;




import br.com.luizsn.VassCommerce.model.Cliente;
import br.com.luizsn.VassCommerce.model.endereco.Endereco;
import br.com.luizsn.VassCommerce.model.formasdepagamento.FormasDePagamento;
import br.com.luizsn.VassCommerce.service.ClienteService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

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


    // GET cliente/{id}/forma-de-pagamento -> Listar todas as formas de pagamento do cliente
    @GetMapping("/cliente/{id}/forma-de-pagamento")
    public List<FormasDePagamento> VisualizarFormasDePagamento(@PathVariable long id){
        return clienteService.formasDePagamentosCliente(id);
    }

    //Get /cliente/{id}Cliente/endereco -> buscar pelos dados do endereço do cliente
    @GetMapping("/cliente/{id}/endereco")
    public Endereco VisualizarEnderecosCliente(@PathVariable long id){
        return  clienteService.listarEnderecoCliente(id);
    }
}
