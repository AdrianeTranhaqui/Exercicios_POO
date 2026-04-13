package CaixaEletronico;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        double saldo = 4000.0;
        int contadorSaques = 0;
        int saques = 3;
        double maxsaques = 1000.0;
        int opcao;

        do {
            System.out.println("\n--- CAIXA ELETRÔNICO ---");
            System.out.println("1 - Ver Saldo");
            System.out.println("2 - Depositar");
            System.out.println("3 - Sacar");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");


            opcao = leitor.nextInt();


            switch (opcao) {
                case 1:
                    System.out.printf("Seu saldo atual é: R$ %.2f\n", saldo);
                    break;

                case 2:
                    System.out.println("Qual valor deseja depositar?");
                    double deposito = leitor.nextDouble();
                    if (deposito > 0) {
                        saldo += deposito;
                        System.out.println("Depósito realizado com sucesso!");
                    } else {
                        System.out.println("Valor inválido.");
                    }
                    break;

                case 3:
                    if (contadorSaques >= saques) {
                        System.out.println("ERRO: Limite de saques diários atingido.");
                    } else {
                        System.out.print("Digite o valor para o saque: ");
                        double valorSaque = leitor.nextDouble();

                        if (valorSaque > maxsaques) {
                            System.out.println("ERRO: O valor máximo por saque é R$ 1.000,00.");
                        } else if (valorSaque > saldo) {
                            System.out.println("ERRO: Saldo insuficiente.");
                        } else if (valorSaque <= 0) {
                            System.out.println("ERRO: Valor inválido.");
                        } else {
                            saldo -= valorSaque;
                            contadorSaques++;
                            System.out.println("Saque realizado com sucesso!");
                        }
                    }
                    break;

                case 0:
                    System.out.println("Sistema encerrado!");
                    break;
            }

        } while (opcao != 0) ;
        leitor.close();
    }
}

