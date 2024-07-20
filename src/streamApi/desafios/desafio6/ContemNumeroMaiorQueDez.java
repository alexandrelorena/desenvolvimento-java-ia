package streamApi.desafios.desafio6;

import java.util.Arrays;
import java.util.List;

public class ContemNumeroMaiorQueDez {
    public static void main(String[] args) {
        // Lista de números para verificar
        final List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 15, 20, 4, 3);

        // Filtra os números maiores que 10 e coleta-os em uma lista
        List<Integer> numerosMaioresQueDez = numeros.stream()
                .filter(n -> n > 10)
                .toList();

        // Verifica se a lista não está vazia e imprime os números
        if (!numerosMaioresQueDez.isEmpty()) {
            numerosMaioresQueDez.forEach(n -> System.out.println(n + " é maior que 10!"));
        } else {
            System.out.println("Não há números maiores que 10 na lista!");
        }
    }
}
