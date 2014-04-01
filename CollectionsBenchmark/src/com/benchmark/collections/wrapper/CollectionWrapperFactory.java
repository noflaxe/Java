package com.benchmark.collections.wrapper;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Created by Nazar_Sheremeta on 1/22/14.
 */
public final class CollectionWrapperFactory {

    public static CollectionWrapper<Integer> getLinkedList(){
        return new CollectionWrapperImpl<Integer>(new LinkedList());
    }

    public static CollectionWrapper<Integer> getArrayList(){
        return new CollectionWrapperImpl<Integer>(new ArrayList());
    }

    public static CollectionWrapper<Integer> getTreeSet(){
        return new CollectionWrapperImpl<Integer>(new TreeSet());
    }

    public static CollectionWrapper<Integer> getHashSet(){
        return new CollectionWrapperImpl<Integer>(new HashSet());
    }

    public static CollectionWrapper<Integer> getConcurrentHashSet(){
        return new CollectionWrapperImpl<Integer>(Collections.newSetFromMap(new ConcurrentHashMap()));
    }

    public static CollectionWrapper<Integer> getWeakHashSet(){
        return new CollectionWrapperImpl<Integer>(Collections.newSetFromMap(new WeakHashMap()));
    }


}
