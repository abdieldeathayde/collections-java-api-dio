package main.java.list.pesquisa;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateExample {
    public static void main(String[] args) {
        //criar uma lista de palavras
        List<String> palavras = Arrays.asList("Abacate", "Abacaxi", "maca", "Laranja", "Limão", "Poca", "Uva", "Abóbora", "Morango");

        Predicate<String> maisDeCincoCaracteres = palavra -> palavra.length() < 5;

        palavras.stream().filter(maisDeCincoCaracteres).forEach(System.out::println);
    }
}
