package org.example.linkedIn_learning.lambdas_and_streams.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {

        Integer[] scores = new Integer[]{80, 66, 73, 92, 43};
//        Stream<Integer> scoresStream = Arrays.stream(scores);
//        scoresStream.sorted().forEach(num -> System.out.println(num)); // OR simply
        Arrays.stream(scores).sorted().forEach(System.out::println);

        System.out.println("--");

        List<String> shoppingList = new ArrayList<>();
        shoppingList.add("coffee");
        shoppingList.add("bread");
        shoppingList.add("pineapple");
        shoppingList.add("milk");
        shoppingList.add("pasta");

        List<String> shopListStream =
//        shopListStream.sorted().forEach(item -> System.out.println(item)); // OR
        shoppingList.stream().sorted()
                .map(item -> item.toUpperCase())
                .filter(item -> item.startsWith("B"))
                .collect(Collectors.toList());
        System.out.println(shopListStream);

        Stream<String> lettersStream = Stream.of("a", "b", "c");
        System.out.println(lettersStream.toList());

    }
}
