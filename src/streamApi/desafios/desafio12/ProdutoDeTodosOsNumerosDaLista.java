package streamApi.desafios.desafio12;

import java.util.Arrays;
import java.util.List;

public class ProdutoDeTodosOsNumerosDaLista {
    public static void main(String[] args) {
        // Lista de números para verificar
        final List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        // Calcula o produto dos números
        int produtoDosNumeros = numeros.stream()
                .reduce(1, (a, b) -> a * b); // Multiplica os elementos

        // Imprime o resultado
        System.out.println("O produto dos números é: " + produtoDosNumeros);
    }
}