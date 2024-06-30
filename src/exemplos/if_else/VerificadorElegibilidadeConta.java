package exemplos.if_else;

import java.util.Scanner;

public class VerificadorElegibilidadeConta {

    public static void main(String[] args) {
        System.out.println("Digite a sua idade: ");
        Scanner scanner = new Scanner(System.in);

        int idade = scanner.nextInt();

        if (idade >= 18) { // Verifica se a idade do cliente é maior ou igual a 18.
            System.out.println("Voce esta elegivel para criar uma conta bancaria.");
        } else {
            System.out.println("Voce nao esta elegivel para criar uma conta bancaria.");         
        }
        scanner.close(); // Fecha o scanner para evitar vazamentos de recursos
    }
}