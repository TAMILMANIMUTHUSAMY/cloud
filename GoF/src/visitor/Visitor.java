package visitor;

/**
 * author    : gbs04229
 * Created on: Feb 12, 2019 18:20:32
 * Project   : GoF
 * File Name : Visitor.java
 */
public interface Visitor {
    Double visit ( ItemSoldInWeight item ) ;
    Double visit ( ItemSoldInPieces item ) ;
}
