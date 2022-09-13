package factory;

import java.util.ArrayList;
import java.util.Random;

/**
 * @author Mia Silver
 * An abstract genaric cereal object
 */
public abstract class Cereal {
    
    protected String name;
    protected double price;
    protected ArrayList<String> toys;

    /**
     * constructs a cereal type
     * @param name the name of the cereal
     * @param price the price of the cereal
     */
    public Cereal(String name, double price) {
        this.name = name;
        this.price = price;
        this.toys = new ArrayList<String>();
    }

    /**
     * Returns the steps used to prepare the cereal
     * @return the string of steps
     */
    public String prepare() {
        String prep = "Preparing the " + name + "\n";
        return prep;
    }

    /**
     * Returns the steps used to box the cereal
     * @return the string of steps
     */
    public String boxCereal() {
        Random rand = new Random();
        String box = "";
        box += "Boxing the " + name + "\n";
        box += "\t- Drawing fun pictures of " + name + " on the box\n";
        box += "\t- Pouring the " + name + " into the box\n";
        box += "\t- Adding the " + toys.get(rand.nextInt(toys.size())) + "\n";
        return box;
    }

    /**
     * Returns the price of the cereal
     * @return the string putting the price on the box
     */
    public String priceCereal() {
       return "Putting the price tag of $" + price +  " on the " + name + " box\n";
    }
}
