package br.com.luizsn.VassCommerce.controller;

import br.com.luizsn.VassCommerce.model.pedido.Pedido;
import br.com.luizsn.VassCommerce.service.PedidoService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class PedidoController {

    private final PedidoService pedidoService;

    public PedidoController(PedidoService pedidoService) {
        this.pedidoService = pedidoService;
    }


    //  GET /cliente/{idCliente}/pedido → Listar todos Pedidos do Cliente
    @GetMapping("/cliente/{id}/pedido")
    public Pedido listarPedido(@PathVariable long id) {
        return pedidoService.listarPedidosCliente(id);
    }

}