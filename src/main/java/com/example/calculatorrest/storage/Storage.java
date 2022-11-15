package com.example.calculatorrest.storage;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public abstract class Storage<T, E> implements CrudDao<T, E> {
    List<T> list = new ArrayList<>();

    public List<T> getOperationList() {
        return list;
    }

    public abstract Optional<T> findEntity(String parameter);
}
