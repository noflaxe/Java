package com.epam.responces;

import com.epam.subject.VolumeLevel;

/**
 * Created by Nazar_Sheremeta on 2/11/14.
 */
public class SadisticAdvisor implements ResponseAdvisor {
    @Override
    public ResponseEnum giveAdvice(VolumeLevel volumeLevel) {
        double level = volumeLevel.getInPercentageValue();
        if (level < 0.97)
            return ResponseEnum.HIGHER;
        else
            return ResponseEnum.OK;
    }
}
