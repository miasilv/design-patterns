package state;

/**
 * @author Mia Silver
 * A Netflix State object
 */
public class NetflixState implements State {
    private TV tv;
    private String[] movies = {"The Land Before Time", "Frozen", "The Little Mermaid", "Ice Age"};
    private String[] tvShows = {"Peppa Pig", "My Little Pony", "Garfield", "Teenage Mutant Ninja Turtles"};

    /**
     * Constructs a netflix state
     * @param tv the tv that contains the state given 
     */
    public NetflixState(TV tv) {
        this.tv = tv;
    }

    /**
     * Presses a home button
     * @return the string confirmation of going to the home screen
     */
    public String pressHomeButton() {
        tv.setState(tv.getHomeState());
        return "Loading the Home Screen...\n";
    }

    /**
     * Presses a netflix button
     * @return the string confirmation that the state is already in hulu
     * 
     */
    public String pressNetflixButton() {
        return "TV is already on Netflix\n";
    }

    /**
     * Presses a hulu button
     * @return the string confirmation of going to hulu
     */
    public String pressHuluButton() {
        tv.setState(tv.getHuluState());
        return "Loading Hulu...\n";
    }

    /**
     * Presses a movie button
     * @return the string of movies in netflix
     */
    public String pressMovieButton() {
        String str = "Netflix Movies:\n";
        for(int i = 0; i < movies.length; i++) {
            str += "- " + movies[i] + "\n";
        }
        return str;
    }

    /**
     * Presses a tv button
     * @return the string of tv shows in netflix
     */
    public String pressTVButton() {
        String str = "Netflix TV Shows:\n";
        for(int i = 0; i < tvShows.length; i++) {
            str += "- " + tvShows[i] + "\n";
        }
        return str;
    }
}
