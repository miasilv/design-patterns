package factory;

/**
 * @author Mia Silver
 * a Fruit Loops object that extends cereal
 */
public class FruitLoops extends Cereal {
   
    /**
     * constructs a Fruit Loops cereal by adding name, price, and toys
     */
    public FruitLoops() {
        super("Fruit Loops", 1.89);
        toys.add("Paw Patrol Stickers");
        toys.add("Bat Man ring");
        toys.add("Silly Putty");
        toys.add("Tiny Car");
    }

    /**
     * Returns the steps used to prepare the Fruit Loops
     * @return the string of steps
     */
    public String prepare() {
        String prep = super.prepare();
        prep += "\t- Gather the grain\n";
        prep += "\t- Shape into circles\n";
        prep += "\t- Randomly color circles\n";
        prep += "\t- Let circles dry\n";
        return prep;
    }
}