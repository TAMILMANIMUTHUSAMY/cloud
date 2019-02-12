package visitor;

/**
 * author    : gbs04229
 * Created on: Feb 12, 2019 18:19:25
 * Project   : GoF
 * File Name : ItemSoldInPieces.java
 */
public class ItemSoldInPieces extends Item implements Visitable {
    private Double unitPrice;
    private Integer numberOfPieces;

    public ItemSoldInPieces(String code, String description, Integer numberOfPieces, Double unitPrice) {
        this.code = code;
        this.description = description;
        this.unitPrice = unitPrice;
        this.numberOfPieces = numberOfPieces;
    }

    public Double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(Double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public Integer getNumberOfPieces() {
        return numberOfPieces;
    }

    public void setNumberOfPieces(Integer numberOfPieces) {
        this.numberOfPieces = numberOfPieces;
    }

    @Override
    public Double accept(Visitor visitor) {
        return visitor.visit(this);
    }
}
