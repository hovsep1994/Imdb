package com.aca.imdb.moviemaker.repository;

import com.aca.imdb.moviemaker.model.MovieMaker;
import com.aca.repository.Repository;

public abstract class MovieMakerRepository<T extends MovieMaker> extends Repository<T> {

    public abstract T create(String name);

}
