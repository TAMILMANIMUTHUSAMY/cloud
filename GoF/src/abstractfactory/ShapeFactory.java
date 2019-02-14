package abstractfactory;

/**
 * @author : Tamilmani
 * @version : 1.0
 * @since : 12-02-2019 22:47
 */
public class ShapeFactory extends AbstractFactory{

    @Override
    Shape getShape(String type) {
        switch (type) {
            case CIRCLE:
                return new Circle();
            case RECTANGLE:
                return new Rectangle();
            case SQUARE:
                return new Square();
        }
        return null;
    }
}
