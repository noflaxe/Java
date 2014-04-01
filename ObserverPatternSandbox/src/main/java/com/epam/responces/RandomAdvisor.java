package com.epam.responces;

import com.epam.subject.VolumeLevel;

import java.util.Random;

/**
 * Created by Nazar_Sheremeta on 2/11/14.
 */
public class RandomAdvisor implements ResponseAdvisor{

    @Override
    public ResponseEnum giveAdvice(VolumeLevel volumeLevel) {
        Random rand = new Random();
        if(rand.nextDouble() > 0.4)
            return ResponseEnum.HIGHER;
        else if(rand.nextDouble() > 0.4)
            return ResponseEnum.LOWER;
        else
            return ResponseEnum.OK;
    }
}
