import java.util.ArrayList;
import java.util.List;


import java.util.ArrayList;
import java.util.List;

public class Pedido {

        private static int contador = 1;

        private int numero;
        private Cliente cliente;
        private List<ItemPedido> itens;
        private double frete;

        public Pedido(Cliente cliente) {
            this.numero  = contador++;
            this.cliente = cliente;
            this.itens   = new ArrayList<>();
            this.frete   = 0.0;
        }

    public void adicionarItem(ItemPedido item) {
        itens.add(item);
    }

    public double calcularTotal() {
        double subtotal = 0;
        for (ItemPedido item : itens) {
            subtotal += item.getSubtotal();
        }
        return subtotal;
    }

    public void fecharPedido() {
        double subtotal = calcularTotal();

        if (subtotal > 250.00) {
            this.frete = 0.00;   // frete grátis
        } else {
            this.frete = 25.00;  // taxa fixa
        }

        imprimirRecibo();
    }

    private void imprimirRecibo() {
        double subtotal  = calcularTotal();
        double totalFinal = subtotal + frete;

        System.out.println("");
        System.out.println("         RECIBO DO PEDIDO #" + numero);
        System.out.println("");
        System.out.println("Cliente: " + cliente.getNome());
        System.out.println("CPF    : " + cliente.getCpf());
        System.out.println("--------------------------------------------");
        System.out.println("Itens:");

        for (ItemPedido item : itens) {
            System.out.println(item);
        }

        System.out.println("--------------------------------------------");
        System.out.printf("Subtotal: R$ %.2f%n", subtotal);

        if (frete == 0) {
            System.out.println("Frete grátis (pedido acima de R$ 250,00)");
        } else {
            System.out.printf("Frete R$ %.2f%n", frete);
        }

        System.out.printf("Total : R$ %.2f%n", totalFinal);
        System.out.println(".......................\n");
    }
}
