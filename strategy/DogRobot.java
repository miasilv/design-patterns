package strategy;

import java.util.ArrayList;

/**
 * A Dog-shaped Robot
 * @author Mia Silver
 */
public class DogRobot extends Robot {

    /**
     * Creates a DogRobot. The DogRobot is shaped like a dog and crawls.
     * @param name the name of the robot
     */
    public DogRobot(String name) {
        super(name);
        this.character = new ArrayList<String>();
        this.character.add("  _____");
        this.character.add("(| o o |)");
        this.character.add(" ( (Y) )");
        this.character.add("  (\\U/)");
        this.setMoveBehavior(new CrawlBehavior());
    }

    /**
     * Creates a string representation of the robot.
     */
    @Override
    public String toString() {
        return name + " is a dog robot:";
        
    }
    
}
