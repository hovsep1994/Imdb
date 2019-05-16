package com.aca.imdb.user;

import com.aca.imdb.movie.Movie;
import com.aca.imdb.movie.MovieRepository;

public class RegularUser extends User {

    public RegularUser(String username, String password) {
        super(username, password);
    }

    public void rateMovie(long movieId, Double rating) {
        Movie movie = MovieRepository.getInstance().getById(movieId);
        movie.rate(getUsername(), rating);
    }

    public Movie search(String string) {
        return MovieRepository.getInstance().search(string);
    }

}
