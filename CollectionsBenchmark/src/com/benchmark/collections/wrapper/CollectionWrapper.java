package com.benchmark.collections.wrapper;

/**
 * Created by Nazar_Sheremeta on 1/22/14.
 */
public interface CollectionWrapper<T> {

 void insertElement(T element);
 void insertArray(T[] elements);
 T getElement(int index);
 boolean contains(T element);
 void remove(T element);
}
