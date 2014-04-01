package com.epam.subject;

import com.epam.observer.Observer;
import com.google.common.collect.Lists;

import java.util.List;

/**
 * Created by Nazar_Sheremeta on 2/11/14.
 */
public class VolumeLevelStation  implements Observerable{

    private List<Observer> subscribers;
    private VolumeLevel volumeLevel;

    public void setVolumeLevel(VolumeLevel volumeLevel) {
        this.volumeLevel = volumeLevel;
    }

    public void init(){
        subscribers = Lists.newArrayList();
    }

    @Override
    public void registerObserver(Observer o) {
        subscribers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        subscribers.remove(o);
    }

    @Override
    public void notifyObserver() {
        notifyObserver(volumeLevel);
    }

    @Override
    public void notifyObserver(Object o) {
        for (Observer subscriber : subscribers) {
            subscriber.update(o);
        }
    }
}
