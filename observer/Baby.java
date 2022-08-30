package observer;

import java.util.ArrayList;
import java.util.Random;

/**
 * Creates a new Baby that implements Subject.
 * @author Mia Silver
 */
public class Baby implements Subject {
    private String name;
    private ArrayList<Observer> observers;
    private Random rand;

    /**
     * Constructs a baby.
     * @param name the name of the baby.
     */
    public Baby(String name) {
        this.name = name;
        this.observers = new ArrayList<Observer>();
        this.rand = new Random();
    }

    /**
     * Returns the baby's name.
     * @return the baby's name.
     */
    public String getName() {
        return name;
    }

    /**
     * Randomly decides if the baby is happy after recieving love or still upset.
     */
    public void recieveLove() {
        if(rand.nextBoolean()) {
            System.out.println(name + " feels appreciated and loved.");
        } else {
            System.out.println(name + " pushes everyone away and continues to cry.");
        }
    }

    /**
     * Randomly decides the the baby is happy after eating or still upset.
     */
    public void eat() {
        if(rand.nextBoolean()) {
            System.out.println(name + " has a happy full tummy.");
        } else {
            System.out.println(name + " throws all their food on the floor.");
        }
    }

    /**
     * The baby's diaper is changed.
     */
    public void getChanged() {
        System.out.println(name + " is having a diaper change.");
    }

    /**
     * Adds an observer to the baby.
     * @param observer the observer being added.
     */
    public void registerObserver(Observer observer) {
        this.observers.add(observer);
    }

    /**
     * Removes an observer from the baby.
     * @param observer the observer being removed.
     */
    public void removeObserver(Observer observer) {
        this.observers.remove(observer);
    }

    /**
     * Notifies all observers that the baby is crying and why the baby is crying.
     * @param cry the type of cry that the baby is crying.
     */
    public void notifyObservers(Cry cry) {
        for(int i = 0; i < observers.size(); i++) {
            observers.get(i).update(cry);
        }
    }

    /**
     * The baby is lonely and cries to notify the observers.
     */
    public void angryCry() {
        System.out.println("Waaaaaaaaaa! " + name + " is feeling abandoned and angry.");
        this.notifyObservers(Cry.ANGRY);
    }

    /**
     * The baby is hungry and cries to notify the observers.
     */
    public void hungryCry() {
        System.out.println("Neh Neh Neh! " + name + " is starving!!!!");
        this.notifyObservers(Cry.HUNGRY);
    }

    /**
     * The baby has a dirty diaper and cries to notify the observers.
     */
    public void wetCry() {
        System.out.println("Aaaaaaaa! " + name + " is WET!");
        this.notifyObservers(Cry.WET);
    }
}
