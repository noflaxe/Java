package com.epam.subject;

import com.epam.observer.Observer;

/**
 * Created by Nazar_Sheremeta on 2/11/14.
 */
public interface Observerable {

    void registerObserver(Observer o);

    void removeObserver(Observer o);

    void notifyObserver();

    void notifyObserver(Object o);
}
