package org.example.linkedIn_learning.functional_interface.functional_programming.first_class_functions;

public interface TriFunction<T, U, V, R> {
    R apply(T t, U u, V v);
}
