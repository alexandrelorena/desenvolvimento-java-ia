package streamApi.desafios.desafio5;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;

public class CalculaMediaMaiores5 {
    public static void main(String[] args) {
        // Lista de números para verificar
        final List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        // Filtrar números maiores que 5 e calcular a média
        OptionalDouble media = numeros.stream()
                .filter(n -> n > 5)
                .mapToInt(Integer::intValue)
                .average();

        // Verificar se a média está presente e imprimir o resultado
        if (media.isPresent()) {
            System.out.println("A média dos números maiores que 5 é: " + media.getAsDouble());
        } else {
            System.out.println("Não há números maiores que 5 na lista.");
        }
    }
}
