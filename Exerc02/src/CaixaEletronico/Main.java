package CaixaEletronico;

import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
        Scanner leitor = new Scanner(System.in);

        ContaBancaria conta = null;
        int opcao;

        do {
            System.out.println("\n--- CAIXA ELETRÔNICO ---");
            System.out.println("1 - Criar conta");
            System.out.println("2 - Ver Saldo");
            System.out.println("3 - Depositar");
            System.out.println("4 - Sacar");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");

            opcao = leitor.nextInt();

            switch (opcao) {

                case 1:
                    if (conta != null) {
                        System.out.println("ERRO: O titular já possui uma conta criada!");
                    } else {
                        leitor.nextLine();

                        System.out.print("Digite o nome do titular: ");
                        String titular = leitor.nextLine();

                        System.out.print("Digite o número da conta: ");
                        int numero = leitor.nextInt();

                        System.out.print("Digite o saldo inicial: ");
                        double saldoInicial = leitor.nextDouble();

                        conta = new ContaBancaria(numero, titular, saldoInicial);

                        System.out.println("Conta criada com sucesso!");
                        System.out.println("Bônus de R$ 50,00 aplicado.");
                        System.out.println("Bem-vindo(a), " + titular + "!");
                    }
                    break;

                case 2:
                    if (conta == null) {
                        System.out.println("ERRO: Crie uma conta primeiro.");
                    } else {
                        System.out.printf("Saldo: R$ %.2f\n", conta.getSaldo());
                    }
                    break;

                case 3:
                    if (conta == null) {
                        System.out.println("ERRO: Crie uma conta primeiro.");
                    } else {
                        System.out.print("Valor do depósito: ");
                        double deposito = leitor.nextDouble();
                        conta.depositar(deposito);
                    }
                    break;

                case 4:
                    if (conta == null) {
                        System.out.println("ERRO: Crie uma conta primeiro.");
                    } else {
                        System.out.print("Valor do saque: ");
                        double saque = leitor.nextDouble();
                        conta.sacar(saque);
                    }
                    break;

                case 0:
                    System.out.println("Sistema encerrado!");
                    break;

                default:
                    System.out.println("Opção inválida.");
            }

        } while (opcao != 0);

        leitor.close();


    }

}
