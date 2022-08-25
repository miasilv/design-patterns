package strategy;
import java.util.ArrayList;

/**
 * A Genaric Robot
 * @author Mia Silver
 */
public abstract class Robot {
    protected String name;
    protected ArrayList<String> character;
    protected MoveBehavior moveBehavior;

    /**
     * Creates a Robot object.
     * @param name name of the robot
     */
    public Robot (String name) {
        this.name = name;
        this.character = new ArrayList<>();
        this.character.add("*");         
    }

    /**
     * Sets the move behavior to either run, walk, or crawl based on a given object.
     * @param moveBehavior the MoveBehavior object
     */
    public void setMoveBehavior (MoveBehavior moveBehavior) {
        this.moveBehavior = moveBehavior;
    }

    /**
     * Moves the robot.
     */
    public void move() {
       moveBehavior.move(character);
    }

    /**
     * Creates a string representation of the robot.
     */
    public String toString() {
        return name + " is a genaric robot";
    }

    /**
     * Returns the name of the Robot
     * @return Robot's name
     */
    public String getName() {
        return name;
    }
}
