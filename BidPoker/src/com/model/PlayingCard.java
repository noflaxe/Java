package com.model;

import com.model.enums.Suit;
import com.model.enums.Value;

/**
 * Created by Nazar_Sheremeta on 1/21/14.
 */
public interface PlayingCard {

   public Value getValue();
   public Suit getSuit();
}
