package state;

/**
 * @author Mia Silver
 * a Home State
 */
public class HomeState implements State {
    private TV tv;

    /**
     * Constructs a home state state
     * @param tv the tv that contains the state given
     */
    public HomeState(TV tv) {
        this.tv = tv;
    }

    /**
     * Presses the home button
     * @return the string confirmation that the state is already in the home screen
     */
    public String pressHomeButton() {
        return "TV is already on the home screen\n";
    }

    /**
     * Presses the netflix button
     * @return the string confirmation of going to netflix
     */
    public String pressNetflixButton() {
        tv.setState(tv.getNetflixState());
        return "Loading Netflix...\n";
    }

    /**
     * Presses the hulu button
     * @return the string confirmation of going to hulu
     */
    public String pressHuluButton() {
        tv.setState(tv.getHuluState());
        return "Loading Hulu...\n";
    }

    /**
     * presses the movie button
     * @return there are no movies in the home screen
     */
    public String pressMovieButton() {
        return "TV is in the home screen, no movies found\n";
    }

    /**
     * presses the tv button
     * @return there are no tv shows in the home screen
     */
    public String pressTVButton() {
        return "TV is in the home screen, no tv shows found\n";
    }
    
}
