package br.com.eduardomelle.streams_java;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        var items = new ArrayList<String>();
        items.add("apple");
        items.add("banana");
        items.add("orange");

        /*
        for (String item : items) {
            if (item.startsWith("a")) {
                System.out.println(item.toUpperCase());
            }
        }
        */

        // Stream - filtragem, ordenação, transformação, ...

        items.stream()
            .filter(item -> item.startsWith("a")) // intermediárias
            .map(String::toUpperCase) // intermediárias
            .forEach(System.out::println); // terminais

        // forEach, collect, reduce
        var listaModificada = items.stream()
            .filter(item -> item.startsWith("a")) // intermediárias
            .map(String::toUpperCase) // intermediárias
            .collect(Collectors.toList()); // terminais
        System.out.println(listaModificada); // terminal
        
        var numbers = List.of(1, 2, 3, 4, 5);
        
        Integer sum = numbers.stream().reduce(0, Integer::sum);
        System.out.println(sum);

        items.parallelStream().forEach(item ->
            System.out.println(Thread.currentThread() + " - " + item));
            
        items.stream().forEach(item ->
            System.out.println(Thread.currentThread() + " - " + item));
    }

}
