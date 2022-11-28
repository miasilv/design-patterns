package adapter;

import java.util.ArrayList;

/**
 * @author Mia Silver
 * A CD object which implements a Digital Album
 */
public class CD implements DigitalAlbum {
    private ArrayList<String> songs;
    private int currentIndex;

    /**
     * Constructs a CD object
     * @param songs the array list of songs on the cd
     */
    public CD(ArrayList<String> songs) {
        this.songs = songs;
        currentIndex = -1;
    }

    /**
     * Plays the cd from the beginning
     * @return the String verifying the action
     */
    public String playFromBeginning() {
        currentIndex = 0;
        return "Playing song 1: " + songs.get(currentIndex);
    }

    /**
     * Plays a specific song on the cd
     * @param num the index of the song you want to play
     * @return the String verifying the action
     */
    public String playSong(int num) {
        if(num < 0 || num >= songs.size()) {
            return "Not a valid song number";
        }
        currentIndex = num;
        return "Playing song " + (currentIndex + 1) + ": " + songs.get(currentIndex);
    }

    /**
     * Plays the previous song on the CD, if it is at the beginning it plays the first song
     * @return the String verifying the action
     */
    public String prevSong() {
        if(currentIndex <= 0) {
            currentIndex = 0;
            return "At the beginning, " + playSong(currentIndex);
        }
        currentIndex--;
        return "Skipping back and playing song " + (currentIndex + 1) + ": " + songs.get(currentIndex);

    }

    /**
     * Plays the next song on the CD, if it is at the end it loops back to the first song
     * @return the String verifying the action
     */
    public String nextSong() {
        if(currentIndex >= songs.size() - 1) {
            currentIndex = 0;
        }
        else {
            currentIndex++;
        }
        return "Playing song " + (currentIndex + 1) + ": " + songs.get(currentIndex);
    }

    /**
     * Stops the CD and resets the current Index to the beginning
     * @return the String verifying the action
     */
    public String stop() {
        currentIndex = -1;
        return "Stopping CD and ejecting";
    }

    /**
     * Pauses the CD
     * @return the String verifying the action
     */
    public String pause() {
        return "Pausing...";
    }
    
}
