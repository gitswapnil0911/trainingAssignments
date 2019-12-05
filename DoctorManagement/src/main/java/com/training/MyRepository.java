package com.training;

import com.training.resources.Medicine;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

public interface MyRepository<T> {

    public int add(T t) throws SQLException;
    public List<Medicine> findAll();
    public T findById(long key);
    public int update(T t);
    public int remove(long key);

}


