package streamApi.functional_interface.examples;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class MetodoReduce {
    public static void main(String[] args) {

        List<Integer> numeros = Arrays.asList(50, 1, 2, 3, 4, 5);

        // Soma dos Elementos
        int soma = numeros.stream()
                .reduce(0, Integer::sum); // ou .reduce(0, (a, b) -> a + b);
        System.out.println("A soma dos números é: " + soma);

        // Produto dos Elementos
        int produto = numeros.stream()
                .reduce(1, (a, b) -> a * b);
        System.out.println("O produto dos números é: " + produto);

        // Encontrar valor mínimo
        int minimo = numeros.stream()
                .reduce(Integer.MAX_VALUE, Integer::min);
        System.out.println("O menor número é: " + minimo);

        // Encontrar valor máximo
        int maximo = numeros.stream()
                .reduce(Integer.MIN_VALUE, Integer::max);
        System.out.println("O maior número é: " + maximo);

        // Subtração Acumulativa Usando reduce()

        //    Sem valor de identidade, retornando um Optional:
        Optional<Integer> subtracao = numeros.stream()
                .reduce((a, b) -> a - b);

        // Imprime o resultado se presente
        subtracao.ifPresent(s -> System.out.println("O resultado da subtração é: " + s));


        // Subtração acumulativa com valor inicial
        int subtrair = numeros.stream()
                .reduce(0, (a, b) -> a - b);

        // Imprime o resultado
        System.out.println("O resultado da subtração é: " + subtrair);


        // Concatenar Strings
        List<String> palavras = Arrays.asList("Olá", "mundo", "Java", "Stream");
        String frase = palavras.stream()
                .reduce("", (a, b) -> a + " " + b).trim();
        System.out.println("A frase concatenada é: " + frase);
    }
}
