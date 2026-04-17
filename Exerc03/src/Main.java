public class Main {

    public static void main(String[] args) {

        // Cenário 1: pedido que ganha frete grátis
        Cliente clara = new Cliente("Clara", "123.456.789-00", "Clara@email.com");
        Pedido pedido1 = new Pedido(clara);
        pedido1.adicionarItem(new ItemPedido("Teclado", 1, 180.00));
        pedido1.adicionarItem(new ItemPedido("Mouse Gamer",      1,  95.00));
        pedido1.adicionarItem(new ItemPedido("Carregador", 1, 80.00));
        pedido1.fecharPedido();

        // Cenário 2: pedido com frete cobrado
        Cliente lucas = new Cliente("Lucas", "987.654.321-00", "Lucas@email.com");
        Pedido pedido2 = new Pedido(lucas);
        pedido2.adicionarItem(new ItemPedido("Mousepad", 2, 45.00));
        pedido2.adicionarItem(new ItemPedido("Carregador", 1, 80.00));
        pedido2.fecharPedido();
    }
}


