package observer;

import java.util.Observable;

/**
 * author    : gbs04229
 * Created on: Feb 12, 2019 16:01:12
 * Project   : GoF
 * File Name : Test.java
 */
public class Test {

    public static void main(String[] args) {
        ObservableMatch match = new ObservableMatch();
        Observer observer1 = new ObserverMatch("1");
        Observer observer2 = new ObserverMatch("2");
        Observer observer3 = new ObserverMatch("3");
        match.addObserver(observer1);
        match.addObserver(observer2);
        match.addObserver(observer3);

        match.setMatchScore("0-10");


    }
}
