package coe618.dyna.models;

/**
 * This class represent the reaction card type. this card can be played on both players turns.
 * @author Josh Williams, Sander Fels-Leong and Philip Feldman
 */
public class ReactionCard extends Card {


       /**
     * Constructor returns an instance of class with specified parameters.
     * @param _setNumber the unqie set number.
     * @param _name the name of the card.
     * @param _cost the cost to cast the card.
     * @param _effect the effects of the card.
     * @param _artwork the url for the location in bundle of art.
     */
    public ReactionCard(int _setNumber, String _name, int _cost, String _effect, String _artwork) {
        super(_setNumber, _name, "reaction", _cost, _effect, _artwork);
    }

   /**
     * Returns an instance of the card objects.
     * @param compressedObject the csv representation of a card object.
     */
    public ReactionCard(String compressedObject) {
        super(compressedObject);
    }
    
}