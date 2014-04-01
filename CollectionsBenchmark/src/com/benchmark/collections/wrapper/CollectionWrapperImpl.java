package com.benchmark.collections.wrapper;

import java.util.Collection;

/**
 * Created by Nazar_Sheremeta on 1/22/14.
 */
public class CollectionWrapperImpl<T> implements CollectionWrapper<T> {

    private Collection<T> storage;

    public CollectionWrapperImpl(Collection<T> storage) {
        this.storage = storage;
    }

    @Override
    public void insertElement(T element) {
        storage.add(element);
    }

    @Override
    public void insertArray(T[] elements) {
        for (T element : elements) {
            insertElement(element);
        }
    }

    @Override
    public T getElement(int index) {
       throw new RuntimeException("Not supported here");
    }

    @Override
    public boolean contains(T element) {
        return storage.contains(element);
    }

    @Override
    public void remove(T element) {
        storage.remove(element);
    }
}
