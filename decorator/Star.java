package decorator;

/**
 * @author Mia Silver
 * a star class that extends tree decorator.
 */
public class Star extends TreeDecorator {
    private Tree tree;

    /**
     * adds a star to the tree.
     * @param tree the tree that you want to add the star to.
     */
    public Star(Tree tree) {
        super(tree.lines);
        this.tree = tree;
        integrateDecor(FileReader.getLines("decorator/txt/star.txt"));
    }
    
}
