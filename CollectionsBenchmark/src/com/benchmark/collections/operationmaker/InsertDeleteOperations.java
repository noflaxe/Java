package com.benchmark.collections.operationmaker;

/**
 * Created by Nazar_Sheremeta on 1/22/14.
 */
public interface InsertDeleteOperations<T> {

    void insertNRandomElements(int quantity);
    void removeElements(int quantity);
}
