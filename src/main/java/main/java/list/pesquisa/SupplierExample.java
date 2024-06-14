package main.java.list.pesquisa;

import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SupplierExample {

    public static void main(String[] args) {
        // usar o supplier com expressão lambda para fornecer uma saudacao personalizada
        Supplier<String> saudacao = () -> "Hello, You are welcome";

        // usar o suplier para obter uma lista com 5 saudações
        List<String> listaSaudacaoes = Stream.generate(saudacao).limit(3).toList();

        //imprimir as saudações geradas
        listaSaudacaoes.forEach(System.out::println);
    }
}
