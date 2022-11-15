package state;

/**
 * @author Mia Silver
 * A HuluState object
 */
public class HuluState implements State {
    private TV tv;
    private String[] movies = {"Cars", "Cinderella", "Wall-E", "ET"};
    private String[] tvShows = {"Sesame Street", "Care Bares", "Looney Tunes"};

    /**
     * Constructs a Hulu State
     * @param tv the tv that contains the state given
     */
    public HuluState(TV tv) {
        this.tv = tv;
    }

    /**
     * presses the home button
     * @return the string confirmation of going to the home screen
     */
    public String pressHomeButton() {
        tv.setState(tv.getHomeState());
        return "Loading the Home Screen...\n";
    }

    /**
     * presses the netflix button
     * @return the string confirmation of going to netflix
     */
    public String pressNetflixButton() {
        tv.setState(tv.getNetflixState());
        return "Loading Netflix...\n";
    }

    /**
     * presses the hulu button
     * @return the string confirmation that the state is already in hulu
     */
    public String pressHuluButton() {
        return "TV is already on Hulu\n";
    }

    /**
     * Presses the movie button
     * @return the string of movies in hulu
     */
    public String pressMovieButton() {
        String str = "Hulu Movies:\n";
        for(int i = 0; i < tvShows.length; i++) {
            str += "- " + tvShows[i] + "\n";
        }
        return str;
    }

    /**
     * Presses the tv button
     * @return the string of tv shows in hulu
     */
    public String pressTVButton() {
        String str = "Hulu TV Shows:\n";
        for(int i = 0; i < tvShows.length; i++) {
            str += "- " + tvShows[i] + "\n";
        }
        return str;
    }
}
