package streamApi.desafios.desafio14;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class EncontreMaiorNumeroPrimoDaLista {
    public static void main(String[] args) {
        // Lista de números para verificar
        final List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        // Encontra o maior número primo na lista
        Optional<Integer> maiorNumeroPrimo = numeros.stream()
                .filter(EncontreMaiorNumeroPrimoDaLista::isPrimo) // Filtra números primos
                .max(Integer::compare); // Encontra o maior número primo

        // Imprime o resultado
        if (maiorNumeroPrimo.isPresent()) {
            System.out.println("O maior número primo na lista é: " + maiorNumeroPrimo.get());
        } else {
            System.out.println("Não há números primos na lista.");
        }
    }

    // Método para verificar se um número é primo
    private static boolean isPrimo(int numero) {
        if (numero <= 1) {
            return false; // Números menores ou iguais a 1 não são primos
        }
        if (numero == 2) {
            return true; // 2 é o único número primo par
        }
        if (numero % 2 == 0) {
            return false; // Números pares maiores que 2 não são primos
        }
        for (int i = 3; i <= Math.sqrt(numero); i += 2) {
            if (numero % i == 0) {
                return false; // Encontrou um divisor, então não é primo
            }
        }
        return true; // Se não encontrou divisores, é primo
    }
}
