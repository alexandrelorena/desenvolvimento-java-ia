package exemplos.swichCase;

import java.util.Scanner;

public class Banco {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double saldo = 0;
        boolean continuar = true;

        while (continuar) {
            // Exibe menu
            System.out.println("\n--- Menu Bancário ---");
            System.out.println("1 - Depositar");
            System.out.println("2 - Sacar");
            System.out.println("3 - Ver Saldo");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");

            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Digite um valor a ser depositado: ");
                    double valorDeposito = scanner.nextDouble();                    
                    if (valorDeposito > 0) {
                        saldo += valorDeposito;
                        System.out.println("O valor depositado foi: " + valorDeposito + " | Saldo atual: " + saldo);
                    } else {
                        System.out.println("Valor de deposito inválido.");
                    }
                    break;
                case 2:
                    System.out.println("Digite um valor a ser sacado: ");
                    double valorSaque = scanner.nextDouble();
                    if (valorSaque <= saldo){
                        saldo -= valorSaque;
                        System.out.println("O valor sacado foi de: " + valorSaque + " | Saldo atual: " + saldo);
                    } else {
                        System.out.println("Saldo insuficiente.");
                    }
                    break;
                case 3:
                    System.out.println("Saldo atual: " + saldo);
                    break;
                case 0:
                    System.out.println("Programa encerrado.");
                    continuar = false;  // Atualiza a variável de controle para encerrar o loop
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
        scanner.close();
    }
}