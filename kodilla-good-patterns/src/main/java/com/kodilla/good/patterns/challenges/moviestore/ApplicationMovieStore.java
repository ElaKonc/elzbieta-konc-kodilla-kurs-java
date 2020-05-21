package com.kodilla.good.patterns.challenges.moviestore;

import java.util.stream.Collectors;

public class ApplicationMovieStore {
    public static void main(String[] args){
        MovieStore movieStore = new MovieStore();

        String movies = movieStore.getMovies().values().stream()
                .flatMap(m -> m.stream())
                .collect(Collectors.joining("!"));
        System.out.println(movies);
    }
}
