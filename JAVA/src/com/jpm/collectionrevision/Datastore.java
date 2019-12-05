package com.jpm.collectionrevision;

import java.util.Collection;

public interface Datastore<T, K> {
    void add(T t);
    T getById(K key);
    Collection<T> getAll();
}
