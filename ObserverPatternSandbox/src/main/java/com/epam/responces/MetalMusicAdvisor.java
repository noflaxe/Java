package com.epam.responces;

import com.epam.subject.VolumeLevel;

/**
 * Created by Nazar_Sheremeta on 2/11/14.
 */
public class MetalMusicAdvisor implements ResponseAdvisor {


    @Override
    public ResponseEnum giveAdvice(VolumeLevel volumeLevel) {
        double level = volumeLevel.getInPercentageValue();
        if (level < 0.8)
            return ResponseEnum.HIGHER;
        else if (level > 0.95)
            return ResponseEnum.LOWER;
        else
            return ResponseEnum.OK;
    }
}
