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
}
