package strategy;

/**
 * author    : gbs04229
 * Created on: Feb 12, 2019 17:59:39
 * Project   : GoF
 * File Name : OperationSubstract.java
 */
public class OperationSubstract implements Strategy {
    @Override
    public Integer doOperation(Integer num1, Integer num2) {
        return num1 - num2;
    }
}
