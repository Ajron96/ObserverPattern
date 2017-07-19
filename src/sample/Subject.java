package sample;

public interface Subject {
    void registerObserver(Observer o);
    void unregisterObserver(Observer o);
    void notifyAllObservers();
}
