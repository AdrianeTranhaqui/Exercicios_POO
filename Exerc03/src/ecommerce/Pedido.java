package ecommerce;

import java.util.List;

public class Pedido {

    private int numero;
    private Cliente cliente;
    private List<ItemPedido> itens;
    private double frete;

    public Pedido(int numero, Cliente cliente, List<ItemPedido> itens, double frete) {
        this.numero = numero;
        this.cliente = cliente;
        this.itens = itens;
        this.frete = frete;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public List<ItemPedido> getItens() {
        return itens;
    }

    public void setItens(List<ItemPedido> itens) {
        this.itens = itens;
    }

    public double getFrete() {
        return frete;
    }

    public void setFrete(double frete) {
        this.frete = frete;
    }
}
