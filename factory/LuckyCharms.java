package factory;

/**
 * @author Mia Silver
 * a Lucky Charms object that extends cereal
 */
public class LuckyCharms extends Cereal {
   
    /**
     * constructs a Lucky Charms cereal by adding name, price, and toys
     */
    public LuckyCharms() {
        super("Lucky Charms", 1.55);
        toys.add("My Little Pony Stickers");
        toys.add("Elsa ring");
        toys.add("Play doe");
        toys.add("Toy Truck");
    }

    /**
     * Returns the steps used to prepare the Lucky Charms
     * @return the string of steps
     */
    public String prepare() {
        String prep = super.prepare();
        prep += "\t- Gather the grain\n";
        prep += "\t- Shape into Xs and Ox\n";
        prep += "\t- Create Marshmallow shapes\n";
        prep += "\t- Mix grain and marshmallows\n";
        return prep;
    }
}