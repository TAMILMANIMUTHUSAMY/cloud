package visitor;

/**
 * author    : gbs04229
 * Created on: Feb 12, 2019 18:18:48
 * Project   : GoF
 * File Name : ItemSoldInWeight.java
 */
public class ItemSoldInWeight extends Item implements Visitable{

    private Double unitPrice;
    private Double weight;

    public ItemSoldInWeight(String code, String description, Double unitPrice, Double weight) {
        this.code = code;
        this.description = description;
        this.unitPrice = unitPrice;
        this.weight = weight;
    }

    public Double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(Double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    @Override
    public Double accept(Visitor visitor) {
        return visitor.visit(this);
    }
}
