package com.epam.responces;

import com.epam.subject.VolumeLevel;

/**
 * Created by Nazar_Sheremeta on 2/11/14.
 */
public class LoungeMusicAdvisor implements ResponseAdvisor {
    @Override
    public ResponseEnum giveAdvice(VolumeLevel volumeLevel) {
        double level = volumeLevel.getInPercentageValue();
        if (level > 0.5)
            return ResponseEnum.LOWER;
        else if (level < 0.15)
            return ResponseEnum.HIGHER;
        else
            return ResponseEnum.OK;
    }
}
