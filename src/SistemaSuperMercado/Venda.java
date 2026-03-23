package SistemaSuperMercado;

import java.util.ArrayList;

public class Venda {
    private Cliente cliente;
    private ArrayList<itemVenda> itens; //composição

    public Venda() {
    }

    public Venda(Cliente cliente) {
        this.cliente = cliente;
        this.itens = new ArrayList<itemVenda>();
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public ArrayList<itemVenda> getItens() {
        return itens;
    }

    void criaItemVenda(int id, int qtd, Produto produto){
           this.itens.add(new itemVenda(id, qtd, produto));
    }

    @Override
    public String toString() {
        return "\n Venda{" +
                "cliente=" + cliente +
                ", itens=" + itens +
                '}';
    }
}
