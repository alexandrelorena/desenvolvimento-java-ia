package streamApi.desafios.desafio13;

import java.util.Arrays;
import java.util.List;

public class FiltraNumerosDentroDoIntervalo {
    public static void main(String[] args) {
        // Lista de números para verificar
        final List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        // Define o intervalo
        int intervaloInicio = 4;
        int intervaloFim = 8;

        // Filtra números dentro do intervalo e remove duplicatas
        List<Integer> numerosNoIntervalo = numeros.stream()
                .filter(n -> n >= intervaloInicio && n <= intervaloFim)
                .distinct()
                .toList(); // No Java 16+; usar collect(Collectors.toList()) para versões anteriores

        // Imprime os números filtrados
        System.out.println("Os números dentro do intervalo de " + intervaloInicio + " e " + intervaloFim + " são: " + numerosNoIntervalo);
    }
}
