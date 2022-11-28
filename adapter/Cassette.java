package adapter;

import java.util.ArrayList;

/**
 * @author Mia Silver
 * A Cassette object which implements an Analog Album
 */
public class Cassette implements AnalogAlbum {
    private ArrayList<String> songs;
    private int currentIndex;

    /**
     * Constructs a cassette object
     * @param songs the array list of songs on the cassette tape
     */
    public Cassette(ArrayList<String> songs) {
        this.songs = songs;
        currentIndex = 0;
    }

    /**
     * Plays the cassette at the current song
     * @return the String verifying the action
     */
    public String play() {
        if(currentIndex >= songs.size()) {
            return "At the end of the cassette, you need to rewind";
        }
        currentIndex++;
        return "Playing song " + currentIndex + ": " + songs.get(currentIndex - 1);
    }

    /**
     * Rewinds the cassette a single song, if at the beginning it does not rewind anymore
     * @return the String verifying the action
     */
    public String rewind() {
        if(currentIndex <= 0) {
            return "Fully Re-wound";
        }
        currentIndex--;
        return "Rewinding to song " + (currentIndex + 1);
    }

    /**
     * Forward the cassette a single song, if at the end it does not forward anymore
     * @return the String verifying the action
     */
    public String ffwd() {
        if(currentIndex >= songs.size()) {
            return "Forwareded to the end of the cassette";
        }
        currentIndex++;
        return "Forwarding to song " + (currentIndex + 1);
    }

    /**
     * Pauses the casette
     * @return the String verifying the action
     */
    public String pause() {
        return "Pausing...";
    }

    /**
     * Stops and ejects the cassette
     * @return the String verifying the action
     */
    public String stopEject() {
        return "Stopping casette and ejecting";
    }
    
}
