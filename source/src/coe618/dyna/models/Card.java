package coe618.dyna.models;

/**
 * This class is the model for the card structure interface and implements the
 * properties common to all cards.
 * @author Josh Williams, Sander Fels-Leong and Philip Feldman
 */
public abstract class Card {

    /**
     * This is constructor than initalizes the class using all instance properties.
     * @param _setNumber The unique card set number.
     * @param _name The unique name.
     * @param _type The card type.
     * @param _cost The cost to cast this card.
     * @param _effect The effect of the card. 
     * @param _artwork A string with the folder URL.
     */
    public Card(int _setNumber, String _name, String _type, int _cost, String _effect, String _artwork) {
        this._setNumber = _setNumber;
        this._name = _name;
        this._type = _type;
        this._cost = _cost;
        this._effect = _effect;
        this._artwork = _artwork;
    }

    /**
     *  This is a constructor initalizes the class using the string representation.
     * @param compressedObject a csv representation of a card.
     */
    public Card (String compressedObject){
    
        String[] tokens =compressedObject.split(",");
           _type = tokens[0];
           _name = tokens[1];
           _setNumber = Integer.parseInt(tokens[2]);
           _cost =  Integer.parseInt(tokens[3]);
           _effect = tokens[4];
           _artwork = tokens[5];
    }
	private final int _setNumber;
	private final String _name;
        private final String _type;
	private final int _cost;
	private final String _effect;
	private final String _artwork;

    /**
     * This method returns the string representation to store class in a file.
     * @return a comma seperated list of instance variables
     */
    @Override
    public String toString() {
        return _type + "," +_name + "," + _setNumber+","+_cost+","+_effect+","+_artwork;
    }

    /**
     * Returns the set number of a card.
     * @return an integer with a unique number.
     */
    public int getSetNumber() {
        return _setNumber;
    }

    /**
     * Returns the name of card.
     * @return a string with card name.
     */
    public String getName() {
        return _name;
    }

    /**
     * Returns the card type.
     * @return returns a string with card type.
     */
    public String getType() {
        return _type;
    }

    /**
     * Returns the card cost to play it.
     * @return  an integer with the cost to use card.
     */
    public int getCost() {
        return _cost;
    }

    /**
     * Returns the effect text.
     * @return a string with the card effect.
     */
    public String getEffect() {
        return _effect;
    }

    /**
     * Returns the artwork url of the object.
     * @return a string with url of art.
     */
    public String getArtwork() {
        return _artwork;
    }

  
       
}