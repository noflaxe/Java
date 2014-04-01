package com.model;

import com.model.enums.Suit;
import com.model.enums.Value;

/**
 * Created by Nazar_Sheremeta on 1/21/14.
 */
public class JokerPlayingCard implements PlayingCard{
    @Override
    public Value getValue() {
        return null;
    }

    @Override
    public Suit getSuit() {
        return null;
    }

    @Override
    public boolean equals(Object o){
        return o instanceof JokerPlayingCard;
    }
}
