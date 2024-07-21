package streamApi.desafios.desafio19;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class NumerosDivisiveisPorTresOuCinco {
    public static void main(String[] args) {
        // Lista de números para verificar
        final List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        List<Integer> divisiveisPorTres = numeros.stream()
                .filter(n -> n % 3 == 0)
                .toList();

        List<Integer> divisiveisPorCinco = numeros.stream()
                .filter(n -> n % 5 == 0)
                .toList();

        System.out.println("Os números divisíveis por 3 são: " + divisiveisPorTres);

        System.out.println("Os números divisíveis por 5 são: " + divisiveisPorCinco);

        // Filtra números divisíveis por 3 ou 5 sem duplicatas e em uma única coleção
        Set<Integer> divisiveisPorTresOuCinco = numeros.stream()
                .filter(n -> n % 3 == 0 || n % 5 == 0)
                .collect(Collectors.toSet());

        System.out.println("Os números divisíveis por 3 ou 5 são: " + divisiveisPorTresOuCinco);
    }
}
