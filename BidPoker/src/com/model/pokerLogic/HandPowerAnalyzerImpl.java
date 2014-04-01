package com.model.pokerLogic;

import com.model.JokerPlayingCard;
import com.model.PlayingCard;
import com.model.PlayingHand;

import java.util.List;

/**
 * Created by Nazar_Sheremeta on 1/21/14.
 */
public class HandPowerAnalyzerImpl implements HandPowerAnalyzer{

    private static final PlayingCard joker = new JokerPlayingCard();

    @Override
    public int getHandPower(PlayingHand hand) {
       List<PlayingCard> cards = hand.getCards();
        if(cards.contains(joker)){
          return analyzeHandWithJoker(cards);
        } else {
            return analyzeHand(cards);
        }
    }

    private int analyzeHand(List<PlayingCard> cards) {
        if()
    }

    private int analyzeHandWithJoker(List<PlayingCard> cards) {
        return 0;
    }

    @Override
    public boolean isFirstHandIsStrongerThanSecond(PlayingHand first, PlayingHand second) {
        return false;
    }
}
