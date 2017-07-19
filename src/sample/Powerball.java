package sample;

import java.util.ArrayList;
import java.util.Random;

public class Powerball implements Subject {
    private ArrayList<Observer> observers;
    private int results[];

    public Powerball(){
        observers = new ArrayList<>();
        results = new int[]{0,0,0,0,0};
    }

    @Override
    public void registerObserver(Observer o){
        observers.add(o);
    }

    @Override
    public void unregisterObserver(Observer o){
        int index = observers.indexOf(o);
        observers.remove(index);
    }

    @Override
    public void notifyAllObservers(){
        for(Observer o : observers){
            o.update(results);
        }
    }

    public void random(){
        Random generator =  new Random();

        for(int i=0; i<5; i++){
            results[i] = generator.nextInt(100)+1;
        }

        notifyAllObservers();
    }

}
