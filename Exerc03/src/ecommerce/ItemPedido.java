package ecommerce;

public class ItemPedido {

    private String nomeProduto;
    private int quantidade;
    private double precoUnitario;

    public ItemPedido(String nomeProduto, int quantidade, double precoUnitario) {
        this.nomeProduto = nomeProduto;
        this.quantidade = quantidade;
        this.precoUnitario = precoUnitario;
    }

    public double getSubtotal(){
        return quantidade * precoUnitario;
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public double getPrecoUnitario() {
        return precoUnitario;
    }


    @Override
        public String toString(){
        return String.format("%-20s %dx R$ %6.2f = R$ %.2f", nomeProduto, quantidade, precoUnitario, getSubtotal());
    }
}
