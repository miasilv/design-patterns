package strategy;

import java.util.ArrayList;

/**
 * A version of MoveBehavior that walks.
 * @author Mia Silver
 */
public class WalkBehavior extends MoveBehavior {

    /**
     * A method to override the MoveBehavior into a walking speed (the default speed).
     * @param character the ArrayList of the robot that is walking.
     */
    @Override
    public void move(ArrayList<String> character) {
        this.move(character, DEFAULT_SPEED);        
    }
    
}
