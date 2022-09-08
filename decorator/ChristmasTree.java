package decorator;

/**
 * @author Mia Silver
 * A Christmas Tree object that extends tree
 */
public class ChristmasTree extends Tree {

    /**
     * constructs a christmas tree by using the file tree.txt
     */
    public ChristmasTree() {
        super(FileReader.getLines("decorator/txt/tree.txt"));
    }
    
}
