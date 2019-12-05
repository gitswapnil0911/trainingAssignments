package com.jpm.collectionrevision;
@FunctionalInterface
public interface DataProcessor<O, R> {
    R processData(O obj);
}
