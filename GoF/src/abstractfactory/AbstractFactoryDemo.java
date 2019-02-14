package abstractfactory;

/**
 * @author : Tamilmani
 * @version : 1.0
 * @since : 12-02-2019 22:55
 */
public class AbstractFactoryDemo {
    public static void main(String[] args) {
        AbstractFactory abstractFactory = new ShapeFactory();
        abstractFactory.getShape(AbstractFactory.CIRCLE).draw();
        abstractFactory.getShape(AbstractFactory.SQUARE).draw();
        abstractFactory.getShape(AbstractFactory.RECTANGLE).draw();
    }
}
