package coe618.dyna.models;

/**
 * This class repesent the creature cards that are summonable in the game.
 * @author Josh Williams, Sander Fels-Leong and Philip Feldman
 */
public class CreatureCard extends Card {

    /**
     * Constructor returns an instance of class with specified parameters.
     * @param _setNumber the unqie set number.
     * @param _name the name of the card.
     * @param _cost the cost to cast the card.
     * @param _effect the effects of the card.
     * @param _artWork the url for the location in bundle of art.
     * @param atk the value of the attack stat.
     * @param def the value of the defence stat.
     * @param support the value of the support stat.
     */
    public CreatureCard(int _setNumber, String _name, int _cost, String _effect, String _artWork,int atk,int def,int support) {
        super(_setNumber, _name, "creature", _cost, _effect, _artWork);
        _atk = atk;
        _def = def;
        _support = support;
    }
    
    /**
     * Returns an instance of the card objects.
     * @param compressedObject the csv representation of a card object.
     */
    public CreatureCard(String compressedObject){
    
        super(compressedObject);
           String[] tokens =compressedObject.split(",");
           _atk = Integer.parseInt(tokens[6]); 
           _def = Integer.parseInt(tokens[7]);
           _support = Integer.parseInt(tokens[8]);
    }
     /**
     * The csv representation of the card.
     * @return a string as csv.
     */
    @Override
    public String toString() {
        return super.toString() +","+_atk+","+_def+","+_support;
    }

    /**
     * Returns the attack stat.
     * @return an integer with attack value.
     */
    public int getAtk() {
        return _atk;
    }

    /**
     * Returns the defence stat.
     * @return an integer with the defence value.
     */
    public int getDef() {
        return _def;
    }

    /**
     * Returns the support stat.
     * @return an integer with the support value.
     */
    public int getSupport() {
        return _support;
    }
    
	private int _atk;
	private int _def;
	private int _support;

        

   
}