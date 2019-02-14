package factory;

/**
 * @author : Tamilmani
 * @version : 1.0
 * @since : 12-02-2019 23:13
 */
public class AnimalFactory {

    public AnimalFactory() {
    }

    public Animal getAnimal(AnimalEnum type) {
        switch (type) {
            case Cat:
                return new Cat();
            case Dog:
                return new Dog();
        }
        return null;
    }
}
