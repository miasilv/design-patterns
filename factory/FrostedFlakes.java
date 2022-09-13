package factory;

/**
 * @author Mia Silver
 * a Frosted Flakes object that extends cereal
 */
public class FrostedFlakes extends Cereal{
    
    /**
     * constructs a Frosted Flakes cereal by adding name, price, and toys
     */
    public FrostedFlakes() {
        super("Frosted Flakes", 2.99);
        toys.add("Spider man Tattoo");
        toys.add("Barbie Tattoo");
        toys.add("Snap Bracelet");
        toys.add("Happy Feet Figurine");
    }

    /**
     * Returns the steps used to prepare the Frosted Flakes
     * @return the string of steps
     */
    public String prepare() {
        String prep = super.prepare();
        prep += "\t- Gather the grain\n";
        prep += "\t- Shape into flakes\n";
        prep += "\t- Sprinkle with frosting\n";
        return prep;
    }
}