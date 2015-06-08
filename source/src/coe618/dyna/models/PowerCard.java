package coe618.dyna.models;

/**
 *
 * @author Josh Williams, Sander Fels-Leong and Philip Feldman
 */
public class PowerCard extends Card {

    /**
     * Constructor returns an instance of class with specified parameters.
     * @param _power The power type that this provides.
     * @param _setNumber the unique set number.
     * @param _name the name of the card.
     * @param _cost the cost to cast the card.
     * @param _effect the effects of the card.
     * @param _artwork the url for the location in bundle of art.
     */

    public PowerCard( String _power, int _setNumber, String _name,  int _cost, String _effect, String _artwork) {
        super(_setNumber, _name, "power", _cost, _effect, _artwork);
        this._power = _power;
    }

   /**
     * Returns an instance of the card objects.
     * @param compressedObject the csv representation of a card object.
     */
    public PowerCard(String compressedObject) {
        super(compressedObject);
        
      String[] tokens =compressedObject.split(",");
           _power =tokens[6]; 
   
    }
        private final String _power;
	
     /**
     * The csv representation of the card.
     * @return a string as csv.
     */
           @Override
    public String toString() {
        return super.toString() +","+_power;
    }

    /**
     * Returns the power type this card provides.
     * @return a string with power type.
     */
    public String getPower() {
        return _power;
    }

}