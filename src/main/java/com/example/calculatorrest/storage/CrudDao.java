package com.example.calculatorrest.storage;

import java.util.List;
import java.util.Optional;

public interface CrudDao<T, E> {
    T save(T entity);
    List<T> getOperationList();
    Optional<T> findById(E id);
}
