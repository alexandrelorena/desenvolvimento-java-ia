package exemplos.condicionalEncadeada;

import java.util.Scanner;

public class VerificacaoChequeEspecial {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o seu saldo atual: ");
        double saldo = scanner.nextDouble();

        System.out.println("Informe o valor do saque: ");
        double saque = scanner.nextDouble();

        double limiteChequeEspecial = 500; // Define um limite para o cheque especial

        if (saque <= saldo) { // Verifica se o saque ultrapassa o saldo disponível
            System.out.println("Transacao realizada com sucesso.");

        } else if (saque > saldo && saque <= (saldo + limiteChequeEspecial)) {
              System.out.println("Transacao realizada com sucesso utilizando o cheque especial.");
        } else {
              System.out.println("Transacao nao realizada. Limite do cheque especial excedido.");
        }
        scanner.close(); // Fecha o scanner para evitar vazamentos de recursos
    }
}
            