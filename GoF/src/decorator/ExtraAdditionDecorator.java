package decorator;

/**
 * author    : gbs04229
 * Created on: Feb 12, 2019 13:54:56
 * Project   : GoF
 * File Name : ExtraAdditionDecorator.java
 */
//Decorator
public abstract class ExtraAdditionDecorator extends Consumation {

    Consumation consumation;

    @Override
    public abstract String getProductName();
}
