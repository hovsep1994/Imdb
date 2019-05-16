package com.aca.imdb.movie;

import com.aca.repository.Repository;

public class MovieRepository extends Repository<Movie> {

    private static final MovieRepository movieRepository = new MovieRepository();

    private MovieRepository() {
    }

    public static MovieRepository getInstance() {
        return movieRepository;
    }

    public Movie search(String searchQuery) {
        for (Movie movie : map.values()) {
            if (movie.getTitle().startsWith(searchQuery)) {
                return movie;
            }
        }
        return null;
    }

}
