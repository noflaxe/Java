package com.benchmark.collections.stage;

import com.benchmark.collections.operationmaker.InsertDeleteManipulator;
import com.benchmark.collections.utils.Timer;
import com.benchmark.collections.utils.TimerImpl;
import com.benchmark.collections.wrapper.CollectionWrapper;
import com.benchmark.collections.wrapper.CollectionWrapperFactory;

/**
 * Created by Nazar_Sheremeta on 1/22/14.
 */
public class Stage {
    private final static int insertQuantity = 20*1000 * 1000;
    private static final int removeQuantity = 1000;

    public static void main(String[] args) {
        System.out.println("ArrayList");
        runExperement(insertQuantity, removeQuantity, CollectionWrapperFactory.getArrayList());
        System.out.println("LinkedList");
        runExperement(insertQuantity, removeQuantity, CollectionWrapperFactory.getLinkedList());
        System.out.println("HashSet");
        runExperement(insertQuantity, removeQuantity, CollectionWrapperFactory.getHashSet());
        System.out.println("ConcurrentHashSet");
        runExperement(insertQuantity, removeQuantity, CollectionWrapperFactory.getConcurrentHashSet());
        System.out.println("WeakHashSet");
        runExperement(insertQuantity, removeQuantity, CollectionWrapperFactory.getWeakHashSet());
        System.out.println("TreeSet");
        runExperement(insertQuantity, removeQuantity, CollectionWrapperFactory.getTreeSet());
    }


    public static void runExperement(int insertQuantity, int removeQuantity, CollectionWrapper<Integer> collection) {
        if (removeQuantity > insertQuantity) {
            throw new RuntimeException("Invalid params");
        }
        Timer timer = new TimerImpl();
        InsertDeleteManipulator operator = new InsertDeleteManipulator(collection);
        System.out.println("Insert started");
        timer.beginCountDown();
        operator.insertNRandomElements(insertQuantity);
        timer.finishCountDown();
        System.out.println(timer.retrieveResultsSeconds());
        System.out.println("Remove started");
        timer.beginCountDown();
        operator.removeElements(removeQuantity);
        timer.finishCountDown();
        System.out.println(timer.retrieveResultsSeconds());
    }
}
