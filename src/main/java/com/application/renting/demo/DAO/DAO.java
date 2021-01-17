package com.application.renting.demo.DAO;

import java.util.List;
import java.util.Optional;

public interface DAO<T> {
    Optional<T> get(int id);

    List<T> getAll();

    int save(T t);

    int update(T t, String[] params);

    int delete(T t);
}
