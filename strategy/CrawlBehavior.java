package strategy;

import java.util.ArrayList;

/**
 * A version of MoveBehavior that crawls.
 * @author Mia Silver
 */
public class CrawlBehavior extends MoveBehavior {

    /**
     * A method to override the MoveBehvaior into a crawling speed (Default speed times 2).
     * @param character the ArrayList of the robot that is crawling.
     */
    @Override
    public void move(ArrayList<String> character) {
        this.move(character, DEFAULT_SPEED*2);    
    }
    
}
