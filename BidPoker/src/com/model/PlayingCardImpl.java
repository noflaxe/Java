package com.model;

import com.model.enums.Suit;
import com.model.enums.Value;

/**
 * Created by Nazar_Sheremeta on 1/21/14.
 */
public class PlayingCardImpl implements PlayingCard {

    private Value value;
    private Suit suit;


    public PlayingCardImpl(Value value, Suit suit) {
        this.value = value;
        this.suit = suit;
    }

    @Override
    public Value getValue() {
        return value;
    }

    @Override
    public Suit getSuit() {
        return suit;
    }
}
