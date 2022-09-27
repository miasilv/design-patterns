package singleton;

import java.util.ArrayList;
/**
 * A Clothing Item object
 * @author Mia Silver
 */
public class ClothingItem {
    
    private String name;
    private ClothingPart part;
    private String color;
    private ArrayList<Season> seasons;

    /**
     * Constructs a clothing item.
     * @param name the name of the item
     * @param part the type of item it is (Top, Bottom, Whole)
     * @param color the color of the item
     */
    public ClothingItem(String name, ClothingPart part, String color) {
        this.name = name;
        this.part = part;
        this.color = color;
        seasons = new ArrayList<Season>();
    }

    /**
     * Checks if the clothing item is good for a specific season
     * @param season the season to be checked
     * @return true if the clothing item is good in that season
     */
    public boolean hasSeason(Season season) {
        for(int i = 0; i < seasons.size(); i++) {
            if(seasons.get(i) == season) {
                return true;
            }
        }
        return false;
    }

    /**
     * Adds a season to the clothing item
     * @param season the season to be added
     */
    public void addSeason(Season season) {
        seasons.add(season);
    }

    /**
     * Creates a string of the clothing item including color and name
     * @return the string of the clothing item
     */
    public String toString() {
        return "A " + color + " " + name;
    }
}
