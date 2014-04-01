package com.epam.responces;

import com.epam.subject.VolumeLevel;

/**
 * Created by Nazar_Sheremeta on 2/11/14.
 */
public interface ResponseAdvisor {

    ResponseEnum giveAdvice(VolumeLevel volumeLevel);
}
