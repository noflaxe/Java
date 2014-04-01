package com.benchmark.collections.utils;

/**
 * Created by Nazar_Sheremeta on 1/22/14.
 */
public interface Timer {

    void beginCountDown();
    void finishCountDown();
    long retrieveResultMills();
    String retrieveResultsSeconds();

}
