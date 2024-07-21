package streamApi.desafios.desafio16;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class AgrupaNumerosParesAndImpares {
    public static void main(String[] args) {
        // Lista de números para verificar
        final List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

//        List<Integer> numerosPares = numeros.stream()
//                .filter(p -> p % 2 == 0)
//                .toList();
//
//        List<Integer> numerosImpares = numeros.stream()
//                .filter(i -> i % 2 != 0)
//                .toList();

        // Particiona os números em pares e ímpares
        Map<Boolean, List<Integer>> numerosParticionados = numeros.stream()
                .collect(Collectors.partitioningBy(n -> n % 2 == 0));

        List<Integer> numerosPares = numerosParticionados.get(true);
        List<Integer> numerosImpares = numerosParticionados.get(false);

        System.out.println("Numeros pares: " + numerosPares);

        System.out.println("Números impares: " + numerosImpares);
    }
}
