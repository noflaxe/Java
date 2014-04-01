package com.model.pokerLogic;

/**
 * Created by Nazar_Sheremeta on 1/21/14.
 */
public enum PokerCombinations {
    @HandPower(1)
    PAIR,
    @HandPower(2)
    TWO_PAIRS,
    @HandPower(3)
    SET,
    @HandPower(4)
    STRAIGHT,
    @HandPower(5)
    FLUSH,
    @HandPower(6)
    FOUR_OF_A_KIND,
    @HandPower(7)
    STRAIGHT_FLUSH,
    @HandPower(8)
    FIVE_OF_A_KIND
}
