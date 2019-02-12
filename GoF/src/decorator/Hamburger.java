package decorator;

/**
 * author    : gbs04229
 * Created on: Feb 12, 2019 13:53:49
 * Project   : GoF
 * File Name : Hamburger.java
 */
//ConcreteComponent
public class Hamburger extends Consumation {
    public Hamburger() {
        this.productName = "Hamburger";
    }
    @Override
    public Double getPrice() {
        return null;
    }
}
