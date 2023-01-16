package org.example.my_practice_classes;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class LfcMain {
    public static void main(String[] args) {

        LiverpoolFC[] playersArray = {
                new LiverpoolFC("Stevie G", "Midfield", 8),
                new LiverpoolFC("Ian Rush", "Striker", 9),
                new LiverpoolFC("Alexander Trent-Arnold", "Wing back", 8),
                new LiverpoolFC("Alison Becker", "Goalie", 9),
                new LiverpoolFC("Gomez", "Center back", 6),
                new LiverpoolFC("Andy Robertson", "Wing back", 8),
                new LiverpoolFC("Jordan Henderson", "Midfielder", 8),
                new LiverpoolFC("Andy Carrol", "Striker", 7),
                new LiverpoolFC("Virgil Van Dijk", " Center back", 8)
        };

        List<LiverpoolFC> players = new ArrayList<>(Arrays.asList(playersArray));

        List<String> names = players
                .stream()
                .map(play -> play.name)
                .toList();

        System.out.println(names);

    }
}
