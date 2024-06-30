package exemplos.usoFor;

import java.util.Scanner;

public class ControleSimplesDeSaques {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o valor do limite diário: ");
        double limiteDiario = scanner.nextDouble();

        System.out.println("Digite o valor do saque: ");
        double valorSaque = scanner.nextDouble();
        // Loop for para iterar sobre os saques
        for (int i = 1; ; i++) {

            if (valorSaque <= 0) {  
                System.out.println("Transacoes encerradas.");
                break; // Encerra o loop
            } else if (valorSaque > limiteDiario) {
                System.out.println("Limite diario de saque atingido. Transacoes encerradas.");
                break; // Encerra o loop
            } else {
                System.out.println("Saque realizado. Limite restante: " + (limiteDiario - valorSaque) + "\nTransacoes encerradas.");
                System.out.println("Número de saques realizados: " + i);
                // break;
            }
        }
        scanner.close(); // Fechar o scanner para evitar vazamentos de recursos
    }
}