package observer;

import java.util.ArrayList;
import java.util.List;

/**
 * author    : gbs04229
 * Created on: Feb 12, 2019 15:56:03
 * Project   : GoF
 * File Name : ObservableMatch.java
 */
public class ObservableMatch {
    private String matchScore;
    List<Observer> observers = new ArrayList<>();

    public ObservableMatch ( ) {
        this . matchScore = "0-0" ;
    }

    public void addObserver ( Observer channel ) {
        // I notify the initial result as soon as an observer signs up
        channel.update ( this . matchScore ) ;
        this . observers . add ( channel ) ;
    }
    public void removeObserver ( Observer channel ) {
        this . observers . remove ( channel ) ;
    }

    public void setMatchScore ( String newScore ) {
        this . matchScore = newScore;
        for ( Observer observer: this . observers ) {
            observer. update ( this . matchScore ) ;
        }
    }

}
