package coe618.dyna.models;

/**
 *
 * @author Josh Williams, Sander Fels-Leong and Philip Feldman
 */
public class EventCard extends Card {

    /**
     *
     * @param _setNumber
     * @param _name
     * @param _cost
     * @param _effect
     * @param _artwork
     */
    public EventCard(int _setNumber, String _name, int _cost, String _effect, String _artwork) {
        super(_setNumber, _name,"event", _cost, _effect, _artwork);
    }

    /**
     *
     * @param compressedObject
     */
    public EventCard(String compressedObject) {
        super(compressedObject);
    }


}