package com.cards.deck;

import org.junit.*;
import static org.junit.Assert.*;
import com.cards.deck.enums.CardNumber;
import com.cards.deck.enums.Suit;

public class CardTest {

    @Test
    public void testInitialize() {
        Card testCard = new Card( CardNumber.ACE, Suit.CLUBS);
        assertEquals(true, testCard instanceof Card);
    }

    @Test
    public void testGetSuit() {
        Card testCard = new Card( CardNumber.ACE, Suit.CLUBS);
        assertEquals(Suit.CLUBS, testCard.getSuit());
    }

    @Test
    public void testGetCardNumber() {
        Card testCard = new Card( CardNumber.ACE, Suit.CLUBS);
        assertEquals(CardNumber.ACE, testCard.getCardNumber());
    }

    @Test
    public void testGetDisplayString() {
        Card testCard = new Card( CardNumber.ACE, Suit.CLUBS);
        assertEquals("ACE of CLUBS", testCard.getDisplayString());
    }
}
