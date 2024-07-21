package streamApi.desafios.desafio10;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class AgrupaImparesMultiplosDeTresOuCinco {
    public static void main(String[] args) {
        // Lista de números para verificar
        final List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        List<Integer> imparesMultiplosDeTresOuCinco = numeros.stream()
                .filter(n -> n % 2 != 0) // Filtra números ímpares
                .filter(n -> n % 3 == 0 || n % 5 == 0)// Filtra múltiplos de 3 ou 5
                .distinct()// Filtra sem repetir
                .collect(Collectors.toList()); // Coleta o resultado em uma lista

        // Imprime o resultado
        System.out.println(imparesMultiplosDeTresOuCinco);
    }
}
