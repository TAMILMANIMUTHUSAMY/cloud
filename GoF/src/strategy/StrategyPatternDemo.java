package strategy;

/**
 * author    : gbs04229
 * Created on: Feb 12, 2019 18:01:54
 * Project   : GoF
 * File Name : StrategyPatternDemo.java
 */
public class StrategyPatternDemo {
    public static void main(String[] args) {
        Strategy strategy = new OperationAdd();
        Context context = new Context(strategy);
        Integer result = context.executeStrategy(10, 20);
        System.out.println(result);
    }
}
