package decorator;

/**
 * author    : gbs04229
 * Created on: Feb 12, 2019 13:51:17
 * Project   : GoF
 * File Name : CheeseBurger.java
 */
//ConcreteComponent
public class CheeseBurger extends Consumation {

    public CheeseBurger() {
        this.productName = "Cheese Burger";
    }

    @Override
    public Double getPrice() {
        return 2.5D;
    }
}
