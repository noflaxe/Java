package com.model.factory;

import com.model.JokerPlayingCard;
import com.model.PlayingCard;
import com.model.PlayingCardImpl;
import com.model.enums.Suit;
import com.model.enums.Value;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Nazar_Sheremeta on 1/21/14.
 */
public class CardsFactory {


    public static List<PlayingCard> createPlayingDeck() {
        List<PlayingCard> deck = new ArrayList<PlayingCard>();
        generateCardsForDeck(deck);
        addJokerToDeck(deck);
        return deck;
    }

    private static void generateCardsForDeck(List<PlayingCard> deck) {

        for (Suit suit : Suit.values()) {
            for (Value value : Value.values()) {
                PlayingCard generatedCard = createPlayingCard(value, suit);
                deck.add(generatedCard);
            }

        }

    }


    private static void addJokerToDeck(List<PlayingCard> deck) {
        deck.add(new JokerPlayingCard());
    }

    private static PlayingCard createPlayingCard(Value value, Suit suit) {
        return new PlayingCardImpl(value, suit);
    }


}
