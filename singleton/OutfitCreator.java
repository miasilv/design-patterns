package singleton;
import java.util.ArrayList;
import java.util.Random;

public class OutfitCreator {
    private ArrayList<ClothingItem> tops;
    private ArrayList<ClothingItem> bottoms;
    private ArrayList<ClothingItem> wholes;
    private Random rand;
    private static OutfitCreator outfitCreator;

    private OutfitCreator() {
        tops = FileReader.getClothing("singleton/txt/tops.txt", ClothingPart.TOP);
        bottoms = FileReader.getClothing("singleton/txt/bottoms.txt", ClothingPart.BOTTOM);
        wholes = FileReader.getClothing("singleton/txt/wholes.txt", ClothingPart.WHOLE);
        rand = new Random();
    }
    
    public static OutfitCreator getInstance() {
        if(outfitCreator == null) {
            System.out.println("Creating an Outfit Creator");
            outfitCreator = new OutfitCreator();
        }
        return outfitCreator;
    }

    public String getOutfit(Season season) {
        if(rand.nextBoolean()) {
            ClothingItem whole = wholes.get(rand.nextInt(wholes.size()));
            while(!whole.hasSeason(season)) {
                whole = wholes.get(rand.nextInt(wholes.size()));
            }
            return whole.toString();
        }
        
        ClothingItem top = tops.get(rand.nextInt(tops.size()));
        while(!top.hasSeason(season)) {
            top = tops.get(rand.nextInt(tops.size()));
        }

        ClothingItem bottom = bottoms.get(rand.nextInt(bottoms.size()));
        while(!bottom.hasSeason(season)) {
            bottom = bottoms.get(rand.nextInt(bottoms.size()));
        }
        
        return top.toString() + "and " + bottom.toString();
    }

}
