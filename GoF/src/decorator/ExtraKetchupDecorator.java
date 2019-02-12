package decorator;

/**
 * author    : gbs04229
 * Created on: Feb 12, 2019 13:59:56
 * Project   : GoF
 * File Name : ExtraKetchupDecorator.java
 */
//ConcreteDecorator
public class ExtraKetchupDecorator extends ExtraAdditionDecorator {

    public ExtraKetchupDecorator(Consumation consumation) {
        this.consumation = consumation;
    }
    @Override
    public String getProductName() {
        return consumation.getProductName() + " with extra ketchup";
    }

    @Override
    public Double getPrice() {
        return consumation.getPrice() + 1.5d;
    }
}
