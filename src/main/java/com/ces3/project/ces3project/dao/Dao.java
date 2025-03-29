package com.ces3.project.ces3project.dao;

import java.util.List;
import java.util.Optional;

public interface Dao<T> {

    Optional<T> get(Integer id);

    List<T> getAll();

    void save(T t);

    void update(Integer id, T t);

    void delete(T t);
}
