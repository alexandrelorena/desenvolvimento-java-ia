package streamApi.desafios.desafio17;

import java.util.Arrays;
import java.util.List;

public class FiltraNumerosPrimos {
    public static void main(String[] args) {
        // Lista de números para verificar
        final List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        // Filtra os números primos
        List<Integer> numerosPrimos = numeros.stream()
                .filter(FiltraNumerosPrimos::isPrimo)
                .toList();

        System.out.println("Números primos: " + numerosPrimos);
    }

    private static boolean isPrimo(int numero) {
        if (numero <= 1) return false;
        if (numero <= 3) return true;
        if (numero % 2 == 0 || numero % 3 == 0) return false;
        for (int i = 5; i * i <= numero; i += 6) {
            if (numero % i == 0 || numero % (i + 2) == 0) return false;
        }
        return true;
    }
}
