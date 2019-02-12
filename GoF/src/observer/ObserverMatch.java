package observer;

/**
 * author    : gbs04229
 * Created on: Feb 12, 2019 15:59:59
 * Project   : GoF
 * File Name : ObserverMatch.java
 */
public class ObserverMatch implements Observer {
    private String id;
    private String score;
    public ObserverMatch ( String id ) {
        this . id = id;
    }
    @Override
    public void update ( Object score ) {
        System . out . println ( "(observer-" + id + ") result:" + ( String ) score ) ;
        this . score = ( String ) score;
    }
}
