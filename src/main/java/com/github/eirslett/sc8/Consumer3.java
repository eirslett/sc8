package com.github.eirslett.sc8;

public interface Consumer3<T1, T2, T3> {
    void apply(T1 v1, T2 v2, T3 v3);
}