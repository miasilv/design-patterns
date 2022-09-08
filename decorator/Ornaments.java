package decorator;

/**
 * @author Mia Silver
 * an Ornament class that extends tree decorator.
 */
public class Ornaments extends TreeDecorator {
    private Tree tree;
    
    /**
     * adds ornaments to a tree.
     * @param tree the tree that you want to add the ornaments to.
     */
    public Ornaments(Tree tree) {
        super(tree.lines);
        this.tree = tree;
        integrateDecor(FileReader.getLines("decorator/txt/ornaments.txt"));
    }
    
}
