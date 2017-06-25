package com.cards.deck;

import com.cards.deck.enums.CardNumber;
import com.cards.deck.enums.Suit;

/**
 * An object of type Card represents a poker-style playing card.
 * card can have a suit and face value associated with it.
 */
public class Card
{
    private Suit suit;
    private CardNumber cardNumber;

    /**
     * Creates a card with a specified face value and suit.
     * @param cardNumber the face value of the card.
     * @param suit the suit of the card.
     */
    public Card (CardNumber cardNumber, Suit suit)
    {
        this.cardNumber = cardNumber;
        this.suit = suit;
    }

    /**
     * Returns the suit of the card.
     * @returns the suit, Ex: Suit.SPADES, Suit.HEARTS etc.
     */
    public Suit getSuit()
    {
        return suit;
    }

    /**
     * Returns the value of the card.
     * @return the value, Ex: numbers 1 through 13.
     */
    public CardNumber getCardNumber()
    {
        return cardNumber;
    }

    /**
     * Returns a String representation of card's value and suit.
     * @return string including face value and suit Ex: SIX of DIAMONDS.
     */
    public String getDisplayString() {
        return cardNumber.toString() + " of " + suit.toString();
    }
}
