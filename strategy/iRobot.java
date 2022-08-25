package strategy;

import java.util.ArrayList;

/**
 * An Eye-Shaped Robot
 * @author Mia Silver
 */
public class iRobot extends Robot {

    /**
     * Creates an iRobot. The iRobot is shaped like an eye and runs.
     * @param name name of the robot
     */
    public iRobot(String name) {
        super(name);
        this.character = new ArrayList<String>();
        character.add(" ___");
        character.add("( o )");
        character.add(" ````");
        this.setMoveBehavior(new RunBehavior());
    }

    /**
     * Creates a string representation of the robot.
     */
    @Override
     public String toString() {
        return name + " is an iRobot";
    }
    
}
