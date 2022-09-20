package iterator;

/**
 * A course object
 * @author Mia Silver
 */
public class Course {
    private Assignment[] assignments;
    private int count;
    private String name;
    private String title;
    
    /**
     * Initializes a course object
     * @param name the name of the course
     * @param title the title of the course
     */
    public Course(String name, String title) {
        this.name = name;
        this.title = title;
        count = 0;
        assignments = new Assignment[5];
    }
    
    /**
     * Adds an assignment to the course
     * @param title the title of the assignment
     * @param description the description of the assignment
     * @param topic the topic of the assignment
     */
    public void addAssignment(String title, String description, Topic topic) {
        for (int i = 0; i < assignments.length; i++) {
            if(assignments[i] == null) {
                assignments[i] = new Assignment(title, description, topic);
                return;
            }
        }
        int index = assignments.length;
        this.growArray(assignments);
        assignments[index] = new Assignment(title, description, topic);
        count++;
    }

    /**
     * Creates an iterator for assignments
     * @return the assignment iterator
     */
    public AssignmentIterator createIterator() {
       return new AssignmentIterator(assignments);
    }

    /**
     * Returns the string version on a course
     * @return the name and title of the course
     */
    public String toString() {
        return name + ": " + title;
    }

    /**
     * grows the array when assignments needs to add a new assignment and it is not the right size
     * @return the bigger array
     */
    private Assignment[] growArray(Assignment[] first) {
        Assignment[] second = new Assignment[assignments.length * 2];
        for(int i = 0; i < assignments.length; i++) {
            second[i] = assignments[i];
        }
        assignments = second;
        return second;
    }
}
