package abstractfactory;

/**
 * @author : Tamilmani
 * @version : 1.0
 * @since : 12-02-2019 22:48
 */
public abstract class AbstractFactory {
    public static final String CIRCLE = "CIRCLE";
    public static final String RECTANGLE = "RECTANGLE";
    public static final String SQUARE = "SQUARE";

    abstract Shape getShape(String type);
}
