package br.com.luizsn.VassCommerce.model.FormasDePagamento;
import java.util.Date;

public class FormasDePagamento {

    private long id;
    private Date dataCriacao;
    private boolean exluido;

    public FormasDePagamento(long id, Date dataCriacao, boolean excluido) {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
    public Date getDataCriacao() {
        return dataCriacao;
    }
    public void setDataCriacao(Date dataCriacao) {
        this.dataCriacao = dataCriacao;
    }
    public boolean isExluido() {
        return exluido;
    }
    public void setExluido(boolean exluido) {
        this.exluido = exluido;
    }
}
