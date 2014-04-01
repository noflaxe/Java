package com.model.pokerLogic;

import com.model.PlayingHand;

/**
 * Created by Nazar_Sheremeta on 1/21/14.
 */
public interface HandPowerAnalyzer {

public int getHandPower(PlayingHand hand);
public boolean isFirstHandIsStrongerThanSecond(PlayingHand first,PlayingHand second);
}
