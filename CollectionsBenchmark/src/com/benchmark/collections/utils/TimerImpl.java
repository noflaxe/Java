package com.benchmark.collections.utils;

/**
 * Created by Nazar_Sheremeta on 1/22/14.
 */
public class TimerImpl implements Timer {

    private long currentTimeCpu;
    private long currentTimeElapsed;

    @Override
    public void beginCountDown() {
        currentTimeElapsed = 0;
        currentTimeCpu = retrieveCurrentTime();
    }

    @Override
    public void finishCountDown() {
        if(currentTimeCpu == 0){
            throw new RuntimeException("Timer was not started");
        }
        if(currentTimeElapsed != 0){
            throw new RuntimeException("Timer was already stoped");
        }

        currentTimeElapsed = retrieveCurrentTime() - currentTimeCpu;
    }

    @Override
    public long retrieveResultMills() {
        return currentTimeElapsed;
    }

    @Override
    public String retrieveResultsSeconds() {
        double seconds = currentTimeElapsed/1000.0;
        int fullSeconds = (int)seconds;
        String fancyResult = fullSeconds+" seconds and "+(seconds-fullSeconds)+" mills has passed";
        return fancyResult;
    }

    private long retrieveCurrentTime(){
        return System.currentTimeMillis();
    }

}
