package Stream.model;

import java.lang.reflect.Array;
import java.util.*;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.ToIntFunction;
import java.util.stream.Collectors;

public class ExerciciosStreamAPI {

    public static void main(String[] args) {

        List<String> numerosAleatórios =
                Arrays.asList("1","0","5","6","6","8");

        System.out.println("Imprima todos os elementos dessa lista de String: ");
        //Operação forEach com métod accept e imprimido lista stream
       /* numerosAleatórios.stream().forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        });*/
        // lambada
        numerosAleatórios.forEach(System.out::println);

        System.out.println("Pegue as 5 primeiros números e coloque dentro de um Set: ");
        // maneria simplificada
       /* numerosAleatórios.stream()
                .limit(5)
                .collect(Collectors.toSet())
                .forEach(System.out::println);*/

        Set<String>collectSet = numerosAleatórios.stream()
                .limit(5)
                .collect(Collectors.toSet());
        System.out.println(collectSet);

        System.out.println("Transforme esta lista de String em uma lista de números inteiros.");

        List<Integer> numerosAleatoriosInteger = numerosAleatórios.stream()
                .map(Integer::parseInt)
                        .collect(Collectors.toList());

        /*numerosAleatórios.stream()
                .map(Integer::parseInt)
                .toList()
                .forEach(System.out::println);*/

        System.out.println("Peque os números pares e maiores que 2 e coloque em uma lista:");
        List<Integer> listParesMaioresQue2 = numerosAleatórios.stream()
                .map(Integer::parseInt)
                        .filter(new Predicate<Integer>() {
                            @Override
                            public boolean test(Integer i){
                                if (i % 2 == 0 && i >2) return true;
                                return false;
                            }
                        }).collect(Collectors.toList());
        System.out.println(listParesMaioresQue2);

        //simplificada os códigos
        /*numerosAleatórios.stream()
                .map(Integer::parseInt)
                .filter(i -> i % 2 == 0 && i > 2).toList()
                .forEach(System.out::println);*/

        System.out.println("Mostre a média dos números: ");
        numerosAleatórios.stream()
                .mapToInt(Integer::parseInt)// transforma string para valores inteiro
                .average() // código média
                .ifPresent(System.out::println);

        System.out.println("Remova os valores impares");
        /*numerosAleatoriosInteger.removeIf(new Predicate<Integer>() {
            @Override
            public boolean test(Integer integer) {
                if (integer % 2 !=0) return true;
                return false;
            }
        });
        System.out.println(numerosAleatoriosInteger);*/

        // código simplificado
        numerosAleatoriosInteger.removeIf(i -> i % 2 != 0);
        System.out.println(numerosAleatoriosInteger);

        System.out.println("Ignore os 3 primeiros elementos da lista e imprima o restante:");
        numerosAleatórios.stream()
                .skip(3) // código para pular os elementos da lista
                .forEach(System.out::println);


        long countNumerosUnicos = numerosAleatoriosInteger.stream()
                .distinct()
                .count();
        System.out.println("Retirando os números repetidos da lista, quantos números ficam? " + countNumerosUnicos);

        System.out.println("Mostre o menor valor da lista: ");
        numerosAleatoriosInteger.stream()
                .mapToInt(Integer::intValue)
                .min()
                .ifPresent(System.out::println);

        System.out.println("Mostre o maior valor da lista: ");
        numerosAleatoriosInteger.stream()
                .mapToInt(Integer::intValue)
                .max()
                .ifPresent(System.out::println);


         int somaDosNumerosPares = numerosAleatoriosInteger.stream()
                 .filter(i -> i % 2 != 0)
                 .mapToInt(Integer::intValue)
                 .sum();
        System.out.println("Pegue apenas os números impares e some: " + somaDosNumerosPares);

        System.out.println("Mostre a lista na ordem númerica: ");
        List<Integer> numerosOrdemNatural = numerosAleatoriosInteger.stream()
                .sorted(Comparator.naturalOrder())
                .collect(Collectors.toList());
        System.out.println(numerosOrdemNatural);


        System.out.println("Agrupe os valores impares multiplos de 3 a 5:");
        Map<Boolean,List<Integer>> collectNumerosMultiplos = numerosAleatoriosInteger.stream()
                .collect(Collectors.groupingBy(i-> i % 3 == 0 || i % 5 == 0));
        System.out.println(collectNumerosMultiplos);










    }
}
