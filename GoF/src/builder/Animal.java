package builder;

import java.util.List;

/**
 * @author : Tamilmani
 * @version : 1.0
 * @since : 12-02-2019 23:42
 */
public class Animal {
    public enum Sex {
        BAD,
        FEMALE
    }
    private String id;
    private String name;
    private String pedigreeName;
    private String owner;
    private String race;
    private String residence;
    private Boolean isVaccinated;
    private Boolean isChampion;
    private List< String > sons;
    private Animal. Sex sex;
    private Double weight;
    private Double height;


    public static final class AnimalBuilder {
        private String id;
        private String name;
        private String pedigreeName;
        private String owner;
        private String race;
        private String residence;
        private Boolean isVaccinated;
        private Boolean isChampion;
        private List< String > sons;
        private Sex sex;
        private Double weight;
        private Double height;

        private AnimalBuilder() {
        }

        public static AnimalBuilder anAnimal() {
            return new AnimalBuilder();
        }

        public AnimalBuilder withId(String id) {
            this.id = id;
            return this;
        }

        public AnimalBuilder withName(String name) {
            this.name = name;
            return this;
        }

        public AnimalBuilder withPedigreeName(String pedigreeName) {
            this.pedigreeName = pedigreeName;
            return this;
        }

        public AnimalBuilder withOwner(String owner) {
            this.owner = owner;
            return this;
        }

        public AnimalBuilder withRace(String race) {
            this.race = race;
            return this;
        }

        public AnimalBuilder withResidence(String residence) {
            this.residence = residence;
            return this;
        }

        public AnimalBuilder withIsVaccinated(Boolean isVaccinated) {
            this.isVaccinated = isVaccinated;
            return this;
        }

        public AnimalBuilder withIsChampion(Boolean isChampion) {
            this.isChampion = isChampion;
            return this;
        }

        public AnimalBuilder withSons(List<String> sons) {
            this.sons = sons;
            return this;
        }

        public AnimalBuilder withSex(Sex sex) {
            this.sex = sex;
            return this;
        }

        public AnimalBuilder withWeight(Double weight) {
            this.weight = weight;
            return this;
        }

        public AnimalBuilder withHeight(Double height) {
            this.height = height;
            return this;
        }

        public Animal build() {
            Animal animal = new Animal();
            animal.name = this.name;
            animal.residence = this.residence;
            animal.isChampion = this.isChampion;
            animal.sons = this.sons;
            animal.sex = this.sex;
            animal.owner = this.owner;
            animal.height = this.height;
            animal.pedigreeName = this.pedigreeName;
            animal.race = this.race;
            animal.weight = this.weight;
            animal.id = this.id;
            animal.isVaccinated = this.isVaccinated;
            return animal;
        }
    }
}
