package com.aca.repository;

public abstract class Persistable {

    private long id;

    public Persistable(long id) {
        this.id = id;
    }

    public long getId() {
        return id;
    }

    @Override
    public String toString() {
        return "id : " + id;
    }
}
