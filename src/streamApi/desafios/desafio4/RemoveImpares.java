package streamApi.desafios.desafio4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class RemoveImpares {

    public static void main(String[] args) {
        // Lista de números para verificar
        final List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        // Criar uma nova lista apenas com números pares
        final List<Integer> numerosPares = numeros.stream().filter(numero -> numero % 2 == 0).toList();

        System.out.println("Lista com números positivos: " + numerosPares);

        // Usar um Iterator para remover números ímpares
//        final List<Integer> numeros = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3));
//
//        Iterator<Integer> iterator = numeros.iterator();
//        while (iterator.hasNext()) {
//            Integer numero = iterator.next();
//            if (numero % 2 != 0) {
//                iterator.remove();
//            }
//        }
//
//        System.out.println("Lista com números pares: " + numeros);
    }
}

