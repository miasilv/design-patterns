package iterator;

/**
 * an Assignment object 
 * @author Mia Silver
 */
public class Assignment {
    private String title;
    private String description;
    private Topic topic;

    /**
     * Creates an assignment
     * @param title the title of the assignment
     * @param description the description of the assignment
     * @param topic the topic of the assignment
     */
    public Assignment(String title, String description, Topic topic) {
        this.title = title;
        this.description = description;
        this.topic = topic;
    }

    /**
     * Checks if the assignment has a specific topic
     * @param topic the topic the assignemnt should have
     * @return true if the assignment has that topic, false if not
     */
    public boolean hasTopic(Topic topic) {
        if (this.topic == topic) {
            return true;
        }
        return false;
    }

    /**
     * returns the string form of the assignment
     * @return the title and description of the assignment
     */
    public String toString() {
        return title + ": " + description;
    }
}
