package strategy;

import java.util.ArrayList;

/**
 * A humanoid Robot
 * @author Mia Silver
 */
public class HumanRobot extends Robot {

    /**
     * Creates a HumanRobot. The HumanRobot is shaped like a person and walks.
     * @param name the name of the robot
     */
    public HumanRobot(String name) {
        super(name);
        this.character = new ArrayList<String>();
        this.character.add(" o");
        this.character.add("<|>");
        this.character.add("/ \\");
        this.setMoveBehavior(new WalkBehavior());
    }

    /**
     * Creates a string representation of the robot.
     */
    @Override
    public String toString() {
        return name + " is a human robot.";
    }
    
}
