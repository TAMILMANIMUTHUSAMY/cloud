package factory;

import java.util.Arrays;

/**
 * @author : Tamilmani
 * @version : 1.0
 * @since : 12-02-2019 23:17
 */
public class FactoryDemo {
    public static void main(String[] args) {
        AnimalFactory animalFactory = new AnimalFactory();
        Arrays.stream(AnimalEnum.values()).map(animalFactory::getAnimal).map(Animal::getCall).forEach(System.out::println);
    }
}
