package com.aca.repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Repository<MODEL extends Persistable> {

    protected Map<Long, MODEL> map;

    protected Repository() {
        this.map = new HashMap<>();
    }

    public MODEL getById(Long id) {
        return map.get(id);
    }

    public MODEL create(MODEL model) {
        map.put(model.getId(), model);
        return model;
    }

    public Collection<MODEL> getAll() {
        return map.values();
    }
}
