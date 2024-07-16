package streamApi.functional_interface.examples;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

/**
 * Representa uma operação que aceita um argumento do tipo T e não retorna nenhum resultado.
 * É utilizada principalmente para realizar ações, ou efeitos colaterais nos elementos do Stream sem modificar, ou
 * retornar um valor.
 */
public class ConsumerExample {
    public static void main(String[] args) {
        // Criar uma lista de números inteiros
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 8);

        // Usar o Consumer com expressão lambda para imprimir números pares
        Consumer<Integer> imprimirNumeroPar = numero -> {
            if (numero % 2 == 0) {
                System.out.println(numero);
            }
        };

        // Usar o Consumer para imprimir números pares no Stream

        // 1ª forma: Passando uma instância de Consumer definida previamente
        System.out.println("Forma 1: Passando uma instância de Consumer definida previamente");
        numeros.stream().forEach(imprimirNumeroPar);

        // 2ª forma: Usar uma classe anônima para definir o Consumer diretamente no forEach
        System.out.println("Forma 2: Usar uma classe anônima para definir o Consumer diretamente no forEach");
        numeros.stream().forEach(new Consumer<Integer>() {
            @Override
            public void accept(Integer n) {
                if (n % 2 == 0) {
                    System.out.println(n);
                }
            }
        });

        // 3ª forma: Usar uma expressão lambda diretamente no forEach
        System.out.println("Forma 3: Usar uma expressão lambda diretamente no forEach");
        numeros.stream().filter(n -> n % 2 == 0).forEach(System.out::println);
    }
}