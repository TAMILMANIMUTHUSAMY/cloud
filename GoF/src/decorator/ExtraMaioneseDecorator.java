package decorator;

/**
 * author    : gbs04229
 * Created on: Feb 12, 2019 13:57:16
 * Project   : GoF
 * File Name : ExtraMaioneseDecorator.java
 */
//ConcreteDecorator
public class ExtraMaioneseDecorator extends ExtraAdditionDecorator {

    public ExtraMaioneseDecorator(Consumation consumation) {
        this.consumation = consumation;
    }

    @Override
    public String getProductName() {
        return consumation.getProductName() + " with extra mayonnaise";
    }

    @Override
    public Double getPrice() {
        return consumation.getPrice() + 1.2D;
    }
}
