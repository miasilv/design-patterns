package state;

public class TV {
    private State HomeState;
    private State NetflixState;
    private State HuluState;
    private State state;

    public TV() {

    }

    public String pressHomeButton() {
        return null;
    }

    public String pressNetflixButton() {
        return null;
    }

    public String pressHuluButton() {
        return null;
    }

    public String pressMovieButton() {
        return null;
    }

    public String pressTVButton() {
        return null;
    }

    public void setState(State state) {
        this.state = state;
    }

    public State getHomeState() {
        return HomeState;
    }

    public State getNetflixState() {
        return NetflixState;
    }

    public State getHuluState() {
        return HuluState;
    }
}
