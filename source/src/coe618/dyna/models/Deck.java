package coe618.dyna.models;

import java.util.*;

/**
 * This object represents a deck which can contain cards.
 * The deck can contain at most 4 copies of a non-power card.
 * The deck can contain at most 60 cards.
 * @author Josh Williams, Sander Fels-Leong and Philip Feldman
 */
public class Deck {

    private int _numOfCards;
    private ArrayList<Card> _cards = new ArrayList<Card>();
    private final int _cardLimit;
    private String _deckName;

     /**
     * The csv representation of the card.
     * @return a string as csv.
     */
    @Override
    public String toString() {
        return _deckName +"\n"+ _cards;
    }

    /**
     *  The name of a deck to distinguish between multiple decks.
     * @param _deck_name a string with the users deck name.
     */
    public Deck(String _deck_name) {
        this._deckName = _deck_name;
        this._cardLimit = 60;
        this._numOfCards = 0;
    }

    /**
     * This method adds a card to the deck if it is valid to add such a card.
     * @param newCard a card to be added to the deck.
     */
    public void addCard(Card newCard)  {
        int count = 0;

        for (Card x : _cards) {
            if (x.getName().equals(newCard.getName())) {
                count++;
            }
        }
        if (count < 4 || (newCard instanceof PowerCard))  {
           if (_numOfCards < _cardLimit) {
                _cards.add(newCard);
                _numOfCards++;
            } 
        }

    }

    /**
     * Removes a card object from the deck if it exists.
     * @param card the card to remove from the deck.
     */
    public void removeCard(Card card)  {

        if (_cards.contains(card)) {
            _cards.remove(card);
            _numOfCards--;
        } else {
       
        }

    }

    /**
     * This returns the arrary list of cards in the deck object.
     * @return the arrarylist of Card type objects that represent the deck.
     */
    public ArrayList<Card> getCards() {
        return (ArrayList<Card>)_cards.clone();
    }

    /**
     * This returns the number of cards in the deck.
     * @return an int with deck total.
     */
    public int getNumOfCards() {
        return _numOfCards;
    }

    /**
     * This returns the card limit which is always 60.
     * @return returns the card limit.
     */
    public int getCardLimit() {
        return _cardLimit;
    }

    /**
     * This returns the deck name.
     * @return a string with the deck name.
     */
    public String getDeck_name() {
        return _deckName;
    }

}
