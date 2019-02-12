package strategy;

/**
 * author    : gbs04229
 * Created on: Feb 12, 2019 17:59:20
 * Project   : GoF
 * File Name : OperationAdd.java
 */
public class OperationAdd implements Strategy{
    @Override
    public Integer doOperation(Integer num1, Integer num2) {
        return num1 + num2;
    }
}
