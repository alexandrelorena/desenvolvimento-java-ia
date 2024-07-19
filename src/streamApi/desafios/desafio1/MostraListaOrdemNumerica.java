package streamApi.desafios.desafio1;

/*
* Desafio 1 - Mostre a lista na ordem numérica:
  Crie um programa que utilize a Stream API para ordenar a lista de números em ordem crescente
  e a exiba no console.
* */

import java.util.Arrays;
import java.util.List;

public class MostraListaOrdemNumerica {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        // Ordenando a lista de números em ordem crescente
        List<Integer> numerosOrdenados = numeros.stream().sorted().toList();

        // List<Integer> numerosOrdenados = numeros.stream().sorted().collect(Collectors.toList());

        // Imprimindo os números ordenados
        numerosOrdenados.forEach(System.out::println);
    }
}
