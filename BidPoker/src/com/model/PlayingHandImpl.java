package com.model;

import java.util.List;

/**
 * Created by Nazar_Sheremeta on 1/21/14.
 */
public class PlayingHandImpl implements PlayingHand {

    private List<PlayingCard> hand;

    public PlayingHandImpl(List<PlayingCard> hand) {
        this.hand = hand;
    }


    @Override
    public List<PlayingCard> getCards() {
        return hand;
    }
}
