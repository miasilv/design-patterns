package observer;

/**
 * Creates a new Mom that implements Observer.
 * @author Mia Silver
 */
public class Mom implements Observer {
    private Subject baby;

    /**
     * Creates a new mom with a subject to observe.
     * @param baby the subject observed.
     */
    public Mom(Subject baby) {
        this.baby = baby;
        baby.registerObserver(this);
    }

    /**
     * The mom's response to the subject's cries.
     * @param cry the current cry.
     */
    public void update(Cry cry) {
        if(cry == Cry.ANGRY) {
            System.out.println("Mom hugs " + ((Baby)baby).getName() + ".");
            ((Baby)baby).recieveLove();
        }
        if(cry == Cry.HUNGRY) {
            System.out.println("Mom feeds " + ((Baby)baby).getName() + ".");
            ((Baby)baby).eat();
        }
        if(cry == Cry.WET) {
            System.out.println("Mom changes " + ((Baby)baby).getName() + ".");
            ((Baby)baby).getChanged();
        }
    }
}
