package strategy;

import java.util.ArrayList;

/**
 * A version of MoveBehavior that runs.
 * @author Mia Silver
 */
public class RunBehavior extends MoveBehavior {

    /**
     * A method to override the MoveBehavior into a running speed (Default speed divided by 2).
     * @param character the ArrayList of the robot that is running.
     */
    @Override
    public void move(ArrayList<String> character) {
        this.move(character, DEFAULT_SPEED/2);       
    }
    
}
