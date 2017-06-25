package com.cards.deck;

import com.cards.deck.enums.CardNumber;
import com.cards.deck.enums.Suit;
import java.util.ArrayList;

/**
 *  An object of type Deck represents a deck of poker-style playing cards.
 *  (Fifty-two playing cards in four suits: hearts, spades, clubs, diamonds,
 *  with face values of Ace, 2-10, Jack, Queen, and King.)
 */
public class Deck
{
    /**
     * Represents a deck of cards
     */
    private ArrayList deck;

    /**
     * Track the number of cards that have been dealt from the deck so far.
     */
    private int cardsUsed;

    /**
     * Constructor. Create an un-shuffled deck of poker-style playing cards
     * based on suit and face value.
     */
    public Deck ()
    {
        this.deck = new ArrayList<Card>();

        for (Suit suit : Suit.values()) {
            for (CardNumber value : CardNumber.values()) {
                this.deck.add(new Card(value, suit));
            }
        }
    }

    public static void main(String[] args){
        Deck pokerDeck = new Deck();
        pokerDeck.shuffle();
        for (int i = pokerDeck.deck.size() - 1; i > 0; i--) {
            Card temp = pokerDeck.dealOneCard();
            System.out.println(temp.getDisplayString());
        }

    }

    /**
     * Shuffle returns no value,
     * but results in the cards in the deck being randomly permuted.
     */
    public void shuffle() {
        for (int i = deck.size() - 1; i > 0; i--) {
            int rand = (int) (Math.random() * (i + 1));

            Card temp = (Card) deck.get(i);
            deck.set( i , deck.get(rand) );
            deck.set( rand, temp );

        }
        cardsUsed = 0;
    }

    /**
     * This function returns one card from the deck to the caller.
     *
     * @return the next card from the deck and
     * if there is no card to deal then return null
     */
    public Card dealOneCard() {
        if (cardsUsed == deck.size()) {
            return null;
        }
        cardsUsed++;
        return (Card) deck.get(cardsUsed - 1);
    }

    /**
     * This function returns cards from the deck.
     *
     * @return ArrayList of cards
     */
    public ArrayList<Card> getCards() {
        return deck;
    }

}

