package com.cards.deck;

import org.junit.*;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class DeckTest {


    Deck deck;

    @Before
    public void setUp() {
        deck = new Deck();
    }

    @Test
    public void testInitialize() {
        assertEquals(52, deck.getCards().size());
        assertEquals("ACE of HEARTS", deck.getCards().get(0).getDisplayString());
        assertEquals("KING of DIAMONDS", deck.getCards().get(51).getDisplayString());
    }

    @Test
    public void testShuffle() {

        boolean cardsInRandomOrder = false;

        Deck secondDeck = new Deck();
        ArrayList<Card> secondDeckCards = secondDeck.getCards();
        deck.shuffle();
        for (Card card : secondDeckCards) {
            Card shuffledCard = deck.dealOneCard();
            if (!card.getDisplayString().equals(shuffledCard.getDisplayString())) {
                cardsInRandomOrder = true;
            }
        }

        assertTrue(cardsInRandomOrder);
    }


    @Test
    public void testDealOneCard() {
        boolean returnedNull = false;

        ArrayList<Card> deckCards = deck.getCards();
        for (Card card : deckCards) {
            if (deck.dealOneCard() == null) {
                returnedNull = true;
            }
        }

        assertFalse(returnedNull);
        assertNull(deck.dealOneCard());
    }

}
