package visitor;

import java.util.ArrayList;
import java.util.List;

/**
 * author    : gbs04229
 * Created on: Feb 12, 2019 18:25:07
 * Project   : GoF
 * File Name : VisitorDemo.java
 */
public class VisitorDemo {
    public static void main(String[] args) {
        List<Visitable> visitables = new ArrayList<>();

        visitables.add(new ItemSoldInPieces("CO1","Notebook", 1, 10d));
        visitables.add(new ItemSoldInWeight("CO2","Apples", 1.5d, 100d));

        Visitor visitor = new ShoppingVisitor();
        Double total = 0D ;
        for (Visitable visitable: visitables) {
            total = total + visitable.accept(visitor);
        }
        System.out.println(total);
    }
}
