package com.epam.observer;

import com.epam.responces.ResponseAdvisor;
import com.epam.subject.VolumeLevel;

/**
 * Created by Nazar_Sheremeta on 2/11/14.
 */
public class MusicVolumeChangerAdvisor implements Observer {

    private ResponseAdvisor advisor;

    public MusicVolumeChangerAdvisor() {
    }

    public MusicVolumeChangerAdvisor(ResponseAdvisor advisor) {
        this.advisor = advisor;
    }

    public void setAdvisor(ResponseAdvisor advisor) {
        this.advisor = advisor;
    }

    @Override
    public void update() {
        throw new UnsupportedOperationException("Not supported in MusicVolumeChangerAdvisor");
    }

    @Override
    public void update(Object o) {
        System.out.println(advisor.getClass()+" Says: "+advisor.giveAdvice((VolumeLevel) o));
    }


}
