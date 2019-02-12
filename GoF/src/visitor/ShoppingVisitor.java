package visitor;

/**
 * author    : gbs04229
 * Created on: Feb 12, 2019 18:23:12
 * Project   : GoF
 * File Name : ShoppingVisitor.java
 */
public class ShoppingVisitor implements Visitor {

    @Override
    public Double visit(ItemSoldInWeight item) {
        return item.getWeight() * item.getUnitPrice();
    }

    @Override
    public Double visit(ItemSoldInPieces item) {
        return item.getNumberOfPieces() * item.getUnitPrice();
    }
}
