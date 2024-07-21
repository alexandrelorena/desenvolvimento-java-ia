package streamApi.desafios.desafio15;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class VerificaNumeroNegativoNaLista {
    public static void main(String[] args) {
        // Lista de números para verificar
        final List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, -6, 7, -8, -9, 10, 5, 4, 3);

        // Filtra e coleta os números negativos
        List<Integer> numerosNegativos = numeros.stream()
                .filter(numero -> numero <= 0)
                .toList();

        if (!numerosNegativos.isEmpty()) {
            System.out.println("Os números negativos são:");
            // Converte a lista de números negativos para uma string
            String negativosStr = numerosNegativos.stream()
                    .map(String::valueOf)
                    .collect(Collectors.joining(", "));
            System.out.println(negativosStr);
        } else {
            System.out.println("Não há números negativos na lista!");
        }
    }
}
