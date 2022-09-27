package singleton;

import java.util.ArrayList;

public class ClothingItem {
    
    private String name;
    private ClothingPart part;
    private String color;
    private ArrayList<Season> seasons;

    public ClothingItem(String name, ClothingPart part, String color) {
        this.name = name;
        this.part = part;
        this.color = color;
        seasons = new ArrayList<Season>();
    }

    public boolean hasSeason(Season season) {
        for(int i = 0; i < seasons.size(); i++) {
            if(seasons.get(i) == season) {
                return true;
            }
        }
        return false;
    }

    public void addSeason(Season season) {
        seasons.add(season);
    }

    public String toString() {
        return "A " + color + " " + name;
    }
}
