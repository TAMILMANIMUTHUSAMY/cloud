package strategy;

/**
 * author    : gbs04229
 * Created on: Feb 12, 2019 18:00:34
 * Project   : GoF
 * File Name : Context.java
 */
public class Context {

    Strategy strategy;

    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    public Integer executeStrategy(Integer num1, Integer num2) {
       return strategy.doOperation(num1,num2);
    }
}
