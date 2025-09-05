package br.com.luizsn.VassCommerce.model.FormasDePagamento;


import java.util.Date;


public class Cartao extends FormasDePagamento{
    private TipoCartao tipoCartao;

    public Cartao(long id, Date dataCriacao, boolean excluido, TipoCartao tipoCartao){
        super(id, dataCriacao, excluido);
        this.tipoCartao = tipoCartao;
    }

    public TipoCartao getTipoCartao() {
        return tipoCartao;
    }

    public void setTipoCartao(TipoCartao tipoCartao){
        this.tipoCartao = tipoCartao;
    }

}
