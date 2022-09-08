package observer;

import java.util.Random;

/**
 * Creates a new Dad that implements Observer.
 * @author Mia Silver
 */
public class Dad implements Observer {
    private Subject baby;
    private Random rand;
    
    /**
     * Constructs a new dad with a subject to observe.
     * @param baby the subject observed.
     */
    public Dad(Subject baby) {
        baby.registerObserver(this);
        this.rand = new Random();
    }

    /**
     * Randomly gives one of three responses when notified.
     * @param cry the current cry.
     */
    public void update(Cry cry) {
        int temp = rand.nextInt(3);
        if(temp == 0) {
            System.out.println("Dad puts a pillow over his head.");
        } else if (temp == 1) {
            System.out.println("Dad nudges mom.");
        } else {
            System.out.println("Dad screams .... aaaaa!");
        }
    }
}
