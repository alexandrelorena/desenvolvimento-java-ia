package streamApi.desafios.desafio2;

/* Desafio 2 - Imprima a soma dos números pares da lista:
Utilizando a Stream API, realize a soma dos números pares da lista e exiba o resultado no console.
*/

import java.util.Arrays;
import java.util.List;

public class ImprimeSomaNumerosPares {

    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        // Filtra os números pares e calcula a soma
        List<Integer> pares = numeros.stream()
                .filter(numero -> numero % 2 == 0)
                .toList(); // => collect(Collectors.toList());

        // Imprime os números pares
        System.out.println("Os números pares são: " + pares);

        // Calcula a soma dos números pares
        int soma = pares.stream().reduce(0, Integer::sum);

        // Imprime a soma dos números pares
        System.out.println("A soma dos números pares da lista é: " + soma);
    }
}
