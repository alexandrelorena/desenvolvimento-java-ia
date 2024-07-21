package streamApi.functional_interface.examples;

import java.util.Optional;

class OptionalExample {
    public static void main(String[] args) {

        // of(value): Cria um Optional contendo o valor fornecido. Se o valor for nulo, lançará uma exceção NullPointerException.
        Optional<String> optionalValueOf = Optional.of("Hello");
        System.out.println("\nof(value): Cria um Optional com um valor não nulo.\n" + optionalValueOf.get() + "\n");
        System.out.println("------------------------------------------------------------------------------------------");

        // ofNullable(value): Cria um Optional contendo o valor fornecido, mas permite que o valor seja nulo.
        String nullableValue = null;
        Optional<String> optionalValueOfNullable = Optional.ofNullable(nullableValue);
        System.out.println("ofNullable(value): Cria um Optional que pode conter um valor nulo.\n" + optionalValueOfNullable.isPresent() + "\n");
        System.out.println("------------------------------------------------------------------------------------------");

        // empty(): Retorna um Optional vazio (sem valor).
        Optional<String> optionalValueEmpty = Optional.empty();
        System.out.println("empty(): Retorna um Optional vazio (sem valor).\n" + optionalValueEmpty.isPresent() + "\n");
        System.out.println("------------------------------------------------------------------------------------------");

        // isPresent(): Verifica se o Optional contém um valor não nulo.
        Optional<String> optionalValueIsPresent = Optional.of("Hello");
        System.out.println("isPresent(): Verifica se o Optional contém um valor não nulo.\n" + optionalValueIsPresent.isPresent() + "\n");
        System.out.println("------------------------------------------------------------------------------------------");

        // isEmpty() (A partir do Java 11): Verifica se o Optional está vazio (não contém um valor não nulo).
        Optional<String> optionalValueIsEmpty = Optional.ofNullable(null);
        System.out.println("isEmpty(): Verifica se o Optional está vazio (não contém um valor não nulo).\n" + optionalValueIsEmpty.isEmpty() + "\n");
        System.out.println("------------------------------------------------------------------------------------------");

        // get(): Obtém o valor contido no Optional. Se o valor for nulo, lançará uma exceção NoSuchElementException.
        Optional<String> optionalValueGet = Optional.of("Hello");
        System.out.println("get(): Obtém o valor do Optional, lançando uma exceção se estiver vazio.\n" + optionalValueGet.get() + "\n");
        System.out.println("------------------------------------------------------------------------------------------");

        // orElse(defaultValue): Obtém o valor contido no Optional, ou retorna um valor padrão se o Optional estiver vazio.
        Optional<String> optionalValueOrElse = Optional.ofNullable(null);
        String result = optionalValueOrElse.orElse("Default");
        System.out.println("orElse(defaultValue): Retorna o valor do Optional ou um valor padrão se estiver vazio.\n" + result + "\n");
        System.out.println("------------------------------------------------------------------------------------------");

        // orElseGet(supplier): Obtém o valor contido no Optional, ou retorna um valor fornecido por um Supplier se o Optional estiver vazio.
        Optional<String> optionalValueOrElseGet = Optional.ofNullable(null);
        String result2 = optionalValueOrElseGet.orElseGet(() -> "Value from Supplier");
        System.out.println("orElseGet(supplier): Retorna o valor do Optional ou um valor fornecido por um Supplier se estiver vazio.\n" + result2 + "\n");
        System.out.println("------------------------------------------------------------------------------------------");

        // orElseThrow(exceptionSupplier): Obtém o valor contido no Optional, ou lança uma exceção fornecida por um Supplier se o Optional estiver vazio.
        Optional<String> optionalValueOrElseThrow = Optional.ofNullable(null);
        System.out.println("orElseThrow(exceptionSupplier): Retorna o valor do Optional ou lança uma exceção se estiver vazio.\n");
        try {
            String result3 = optionalValueOrElseThrow.orElseThrow(() -> new RuntimeException("Value not present"));
            System.out.println("orElseThrow(exceptionSupplier): " + result3 + "\n");
        } catch (RuntimeException e) {
            System.out.println("orElseThrow(exceptionSupplier): " + e.getMessage() + "\n");
        }
        System.out.println("------------------------------------------------------------------------------------------");

        // ifPresent(consumer): Executa uma ação fornecida por um Consumer se o Optional contiver um valor.
        Optional<String> optionalValueIfPresent = Optional.of("Hello");
        optionalValueIfPresent.ifPresent(value -> System.out.println("ifPresent(consumer): Executa uma ação se o Optional contiver um valor.\n" + value + "\n"));
    }
}
