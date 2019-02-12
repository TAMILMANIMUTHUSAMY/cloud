package decorator;

import java.util.List;

/**
 * author    : gbs04229
 * Created on: Feb 12, 2019 14:01:47
 * Project   : GoF
 * File Name : Test.java
 */
public class Test {
    public static void main(String[] args) {
        Consumation cheeseBurger = new CheeseBurger();
        System.out.println(cheeseBurger.getPrice());
        System.out.println(cheeseBurger.getProductName());

        Consumation cheeseBurgerWithKetchup = new ExtraKetchupDecorator(cheeseBurger);
        System.out.println(cheeseBurgerWithKetchup.getProductName());
        System.out.println(cheeseBurgerWithKetchup.getPrice());

        Consumation cheeseBurgerWithKetchupAndMaionese = new ExtraMaioneseDecorator(cheeseBurgerWithKetchup);

        System.out.println(cheeseBurgerWithKetchupAndMaionese.getProductName());
        System.out.println(cheeseBurgerWithKetchupAndMaionese.getPrice());
    }
}
