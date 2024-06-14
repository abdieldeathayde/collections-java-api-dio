package main.java.list.desafios;


import java.util.Arrays;
import java.util.List;


public class Desafio2Soma {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        int numero = 0;
        for (int i = 0; i < numeros.size(); i++) {
            numero = numeros.stream()
                    .filter(n -> n % 2 == 0)
                    .reduce(0, Integer::sum);
        }
        System.out.println("A soma é: " + numero);
    }
}
