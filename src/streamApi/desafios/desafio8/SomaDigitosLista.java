package streamApi.desafios.desafio8;

import java.util.Arrays;
import java.util.List;

public class SomaDigitosLista {
    public static void main(String[] args) {
        // Lista de números para verificar
        final List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 15, 4, 3);

        int soma = numeros.stream()
                .mapToInt(Integer::intValue)
                .sum();

        System.out.println("A soma dos números é: " + soma);

    }
}
