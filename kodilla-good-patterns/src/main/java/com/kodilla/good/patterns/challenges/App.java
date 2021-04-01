package com.kodilla.good.patterns.challenges;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class App {
    public static void main(String[] args) {

        MovieStore movieStore = new MovieStore();
        Map<String, List<String>> allMovies = movieStore.getMovies();

        String movies = allMovies.entrySet()
                .stream()
                .flatMap(e -> e.getValue().stream())
                .collect(Collectors.joining("!")).toUpperCase();

        System.out.println(movies);
    }
}
