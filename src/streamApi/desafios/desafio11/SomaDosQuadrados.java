package streamApi.desafios.desafio11;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SomaDosQuadrados {
    public static void main(String[] args) {
        // Lista de números para verificar
        final List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        // Imprime cada número e seu quadrado
        numeros.stream()
                .map(n -> "O quadrado de " + n + " = " + (n * n))
                .forEach(System.out::println);

        // Calcula a soma dos quadrados
        int somaDosQuadrados = numeros.stream()
                .map(n -> n * n)
                .reduce(0, Integer::sum);

        // Imprime a soma dos quadrados
        System.out.println("A soma dos quadrados é: " + somaDosQuadrados);
    }
}
