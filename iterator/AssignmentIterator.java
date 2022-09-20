package iterator;
import java.util.Iterator;

/**
 * An Assignment Iterator
 * @author Mia Silver
 */
public class AssignmentIterator implements Iterator {
    private Assignment[] assignments;
    private int position;

    /**
     * initializes an Assignment Iterator.
     * @param assignments
     */
    public AssignmentIterator(Assignment[] assignments) {
        this.assignments = assignments;
        position = 0;
    }

    /**
     * Checks if assignments has more assignments
     */
    public boolean hasNext() {
        return (position < assignments.length && assignments[position] != null);
    }

    /**
     * Returns the next assignment and moves the position to the next assignment
     */
    public Assignment next() {
        if(!hasNext()) {
            return null;
        }
        return assignments[position++];
    }
}
