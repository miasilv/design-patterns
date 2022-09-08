package decorator;

import java.util.ArrayList;

/**
 * @author Mia Silver
 * a tree decorator abstract class that extends tree and is able to decorate a tree.
 */
public abstract class TreeDecorator extends Tree {
    
    /**
     * constructs a decorated tree.
     * @param lines the array list that contains the tree
     */
    public TreeDecorator(ArrayList<String> lines) {
        super(lines);
    }

    /**
     * Replaces all decor elements in the decor array list into the tree.
     * @param decor the decor array list you want to add.
     */
    protected void integrateDecor(ArrayList<String> decor) {
        ArrayList<String> decoratedTree = new ArrayList<String>();
        
        for(int i = 0; i < decor.size(); i++) {
            String treeLine = lines.get(i);
            String decorLine = decor.get(i);
            String newLine = "";
            
            for(int j = 0; j < decorLine.length(); j++) {
                if(!(decorLine.charAt(j) == ' ')) {
                    newLine += decorLine.charAt(j);
                }
                else {
                    newLine += treeLine.charAt(j);
                }
                
                //fills in the rest of the tree line after decor is done
                if(j == decorLine.length()) {
                    newLine += treeLine.substring(j);
                }
            }
            decoratedTree.add(newLine);
        }
        this.lines = decoratedTree;
    }
    
}
