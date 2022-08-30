package observer;

/**
 * The subject interface that is observed by the observer.
 * @author Mia Silver
 */
public interface Subject {
    public void registerObserver(Observer observer);
    public void removeObserver(Observer observer);
    public void notifyObservers(Cry cry);    
}
