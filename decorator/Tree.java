package decorator;

import java.util.ArrayList;

/**
 * @author Mia Silver
 * A tree object.
 */
public abstract class Tree {
    protected ArrayList<String> lines;
    
    /**
     * Constructs a tree using an array list.
     * @param lines the array list containing the image of the tree in string format.
     */
    public Tree(ArrayList<String> lines) {
        this.lines = lines;
    }

    /**
     * returns the image of the tree.
     * @return the string of the tree.
     */
    public String toString() {
        String tree = "";
        for(int i = 0; i < lines.size(); i++) {
            tree += lines.get(i) + "\n";
        }
        return tree;
    }
}