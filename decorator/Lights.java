package decorator;

/**
 * @author Mia Silver
 * A lights class that extends tree decorator.
 */
public class Lights extends TreeDecorator {
    private Tree tree;

    /**
     * adds lights to a tree.
     * @param tree the tree you want to add lights to.
     */
    public Lights(Tree tree) {
        super(tree.lines);
        this.tree = tree;        
        integrateDecor(FileReader.getLines("decorator/txt/lights.txt"));
    }
    
}
