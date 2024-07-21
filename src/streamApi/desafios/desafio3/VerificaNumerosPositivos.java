package streamApi.desafios.desafio3;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

/**
 * Classe para verificar números positivos em uma lista.
 */
public class VerificaNumerosPositivos {

    public static void main(String[] args) {
        // Lista de números para verificar
        final List<Integer> numeros = Arrays.asList(1, 2, 3, 4, -5, 6, 7, 8, 9, 10, 5, 4, 3);

        // Consumer para verificar e imprimir se o número é positivo
        final Consumer<Integer> numerosPositivos = numero -> {
            if (numero > 0) {
                System.out.println("O número " + numero + " é positivo!");
            }
        };

        // Itera sobre a lista e aplica o Consumer a cada número
        numeros.forEach(numerosPositivos);
    }
}
