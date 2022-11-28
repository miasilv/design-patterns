package adapter;

/**
 * @author Mia Silver
 * An Analog Adapter which implments Analog Album
 */
public class AnalogAdapter implements AnalogAlbum {
    private DigitalAlbum album;

    /**
     * Constructs an Analog Adapter
     * @param album the Digital Album being adapted
     */
    public AnalogAdapter(DigitalAlbum album) {
        this.album = album;
    }
    
    /**
     * Plays the digital album's 
     * @return the String verifying the action
     */
    public String play() {
        return album.nextSong();
    }

    /**
     * Rewinds the digital album by one song
     * @return the String verifying the action
     */
    public String rewind() {
        return album.prevSong();
    }

    /**
     * Forwards the digital album by one song
     * @return the String verifying the action
     */
    public String ffwd() {
        return album.nextSong();
    }

    /**
     * Pauses the digital album
     * @return the String verifying the action
     */
    public String pause() {
        return album.pause();
    }

    /**
     * Stops the digital album
     * @return the String verifying the action
     */
    public String stopEject() {
        return album.stop();
    }
    
}
