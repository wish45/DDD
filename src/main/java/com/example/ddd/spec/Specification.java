package com.example.ddd.spec;

public interface Specification<T> {
    public boolean isSatisfiedBy(T agg);
}
