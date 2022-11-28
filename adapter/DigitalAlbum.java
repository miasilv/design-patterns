package adapter;

/**
 * @author Mia Silver
 * a Digital Album interface
 */
public interface DigitalAlbum {
    public String playFromBeginning();  
    public String playSong(int num);
    public String prevSong();
    public String nextSong();
    public String stop();
    public String pause();
}
