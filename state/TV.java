package state;

/**
 * @author Mia Silver
 * creates a TV object
 */
 public class TV {
    private State HomeState;
    private State NetflixState;
    private State HuluState;
    private State state;

    /**
     * Constructs a TV object and turns it on to the home screen
     */
    public TV() {
        HomeState = new HomeState(this);
        NetflixState = new NetflixState(this);
        HuluState = new HuluState(this);
        setState(HomeState);
    }

    /**
     * Presses the home button on the remote
     * @return the string that confirms the tv is going to the home screen
     */
    public String pressHomeButton() {
        return state.pressHomeButton();
    }

    /**
     * Presses the netfliix button on the remote
     * @return the string that confirms the tv is going to netflix
     */
    public String pressNetflixButton() {
        return state.pressNetflixButton();
    }

    /**
     * Presses the hulu button on the remote
     * @return the string that confirms the tv is going to hulu
     */
    public String pressHuluButton() {
        return state.pressHuluButton();
    }

    /**
     * Presses the movie button on the remote
     * @return the string that prints out the movies available
     */
    public String pressMovieButton() {
        return state.pressMovieButton();
    }

     /**
     * Presses the tv button on the remote
     * @return the string that prints out the tv shows available
     */
    public String pressTVButton() {
        return state.pressTVButton();
    }

    /**
     * Sets the state to a new state
     * @param state the state to be set in
     */
    public void setState(State state) {
        this.state = state;
    }

    /**
     * Gets the home state
     * @return the home state
     */
    public State getHomeState() {
        return HomeState;
    }

    /**
     * Gets the Netflix state
     * @return the netflix state
     */
    public State getNetflixState() {
        return NetflixState;
    }

    /**
     * Gets the hulu state
     * @return the hulu state
     */
    public State getHuluState() {
        return HuluState;
    }
}
