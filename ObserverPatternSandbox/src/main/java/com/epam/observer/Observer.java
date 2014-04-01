package com.epam.observer;

/**
 * Created by Nazar_Sheremeta on 2/11/14.
 */
public interface Observer {
    void update();

    void update(Object o);
}
