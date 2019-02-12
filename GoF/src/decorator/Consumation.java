package decorator;

/**
 * author    : gbs04229
 * Created on: Feb 12, 2019 13:49:22
 * Project   : GoF
 * File Name : Consumation.java
 */
//Component
public abstract class Consumation {

    String productName = "";
    public String getProductName() {
        return productName;
    }
    public abstract Double getPrice();
}
