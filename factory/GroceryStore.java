package factory;

/**
 * @author Mia Silver
 * A grocery store creates different cereal types
 */
public class GroceryStore {
    /**
     * constructs a cereal based on type
     * @param type the type of cereal you want to create
     * @return the created cereal
     */
    public Cereal createCereal(String type) {
        Cereal cereal = null;

        if(type.equalsIgnoreCase("Lucky Charms")) {
            cereal = new LuckyCharms();
        } 
        else if (type.equalsIgnoreCase("Frosted Flakes")) {
            cereal = new FrostedFlakes();
        } 
        else if (type.equalsIgnoreCase("Fruit Loops")) {
            cereal = new FruitLoops();
        }
        else {
            cereal = new FrostedFlakes();
        }

        return cereal;
    }
}