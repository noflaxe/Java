package com.benchmark.collections.operationmaker;

import com.benchmark.collections.wrapper.CollectionWrapper;

import java.util.Random;

/**
 * Created by Nazar_Sheremeta on 1/22/14.
 */
public class InsertDeleteManipulator implements InsertDeleteOperations<Integer>{

    private CollectionWrapper<Integer> storage;

    public InsertDeleteManipulator(CollectionWrapper<Integer> storage) {
        this.storage = storage;
    }

    @Override
    public void insertNRandomElements(int quantity) {
        Random random = new Random();
        for (int i = 0; i < quantity; i++) {
           // storage.insertElement(random.nextInt(quantity));
            storage.insertElement(100+i);
        }
    }

    @Override
    public void removeElements(int quantity) {
        for (int i = 0; i < quantity; i++) {
            storage.remove(i);
        }
    }


}
