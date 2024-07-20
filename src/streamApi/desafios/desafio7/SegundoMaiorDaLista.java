package streamApi.desafios.desafio7;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class SegundoMaiorDaLista {
    public static void main(String[] args) {
        // Lista de números para verificar
        final List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 15, 4, 3);

        // Encontra o segundo maior número
        Optional<Integer> segundoMaior = numeros.stream()
                .distinct() // Remove duplicados
                .sorted(Comparator.reverseOrder()) // Ordena em ordem decrescente
                .skip(1) // Pula o maior número
                .findFirst(); // Encontra o segundo maior número

        // Verifica se o segundo maior número está presente e o imprime
        if (segundoMaior.isPresent()) {
            System.out.println(segundoMaior.get() + " é o segundo número mais alto da lista!");
        } else {
            System.out.println("Não há um segundo número mais alto na lista!");
        }
    }
}
