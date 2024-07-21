package streamApi.desafios.desafio18;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class VerificaSeNumerosSaoIguais {
    public static void main(String[] args) {
        // Lista de números para verificar
        final List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 6, 9);

        Set<Integer> unicos = new HashSet<>();
        List<Integer> numerosDuplicados = numeros.stream()
                .filter(n -> !unicos.add(n))
                .toList();

        if(!numerosDuplicados.isEmpty()) {
            System.out.println("Números duplicados: " + numerosDuplicados);
        } else {
            System.out.println("Não há números duplicados na lista!");
        }

    }
}
