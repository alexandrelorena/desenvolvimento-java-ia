package exemplos.tryCatch;
import java.util.Scanner;

public class VerificadorNumeroConta {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Digite o número da conta: ");
            String numeroConta = scanner.nextLine();
            verificarNumeroConta(numeroConta); // Chama o método que veritica se o número da conta é valido
            System.out.println("Numero de conta valido."); // Caso nenhuma exceção seja lançada, imprime a mensagem de sucesso.
        } catch (IllegalArgumentException e) {
            System.out.println("Erro: " + e.getMessage()); // Informa que o número de conta é inválido e exibe a mensagem de erro
        } finally {
            scanner.close(); // Fecha o scanner para evitar vazamentos de recursos
        }
    }
    private static void verificarNumeroConta(String numeroConta) {
        if (numeroConta.length() != 8) {
            throw new IllegalArgumentException("Numero de conta invalido. Digite exatamente 8 digitos.");
        }
    }
}