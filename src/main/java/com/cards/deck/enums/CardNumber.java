package com.cards.deck.enums;

/**
 * Face value of poker-style playing cards.
 */
public enum CardNumber
{
    ACE(1),
    TWO(2),
    THREE(3),
    FOUR(4),
    FIVE(5),
    SIX(6),
    SEVEN(7),
    EIGHT(8),
    NINE(9),
    TEN(10),
    JACK(11),
    QUEEN(12),
    KING(13);

    private int cardNumber;

    private CardNumber (int value)
    {
        this.cardNumber = value;
    }

    public int getCardNumber() {
        return cardNumber;
    }
}