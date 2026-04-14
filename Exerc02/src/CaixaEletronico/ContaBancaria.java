package CaixaEletronico;

public class ContaBancaria {

    protected int numero;
    protected String titular;
    protected double saldo;

    private int contadorSaques = 0;
    private final int LIMITE_SAQUES = 3;
    private final double MAX_SAQUE = 1000.0;

    public ContaBancaria(int numero, String titular, double saldoInicial){
        this.numero = numero;
        this.titular = titular;
        this.saldo = saldoInicial + 50.0;
    }

    public double getSaldo(){
        return saldo;
    }

    public void depositar(double valor){
        if (valor > 0) {
            saldo += valor;
            System.out.println("Depósito realizado com sucesso!");
        } else {
            System.out.println("Valor inválido.");
        }
    }

    public void sacar(double valor) {
        if (contadorSaques >= LIMITE_SAQUES) {
            System.out.println("ERRO: Limite de saques diários atingido.");
        } else if (valor > MAX_SAQUE) {
            System.out.println("ERRO: O valor máximo por saque é R$ 1.000,00.");
        } else if (valor > saldo) {
            System.out.println("ERRO: Saldo insuficiente.");
        } else if (valor <= 0) {
            System.out.println("ERRO: Valor inválido.");
        } else {
            saldo -= valor;
            contadorSaques++;
            System.out.println("Saque realizado com sucesso!");
        }
    }

}
