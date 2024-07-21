package streamApi.desafios.desafio9;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class VerificaDadosDistintos {
    public static void main(String[] args) {
        // Lista de números para verificar
        final List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 15, 4, 3);


        numeros.stream()
                .distinct()
                .forEach(System.out::println);
    }
}
