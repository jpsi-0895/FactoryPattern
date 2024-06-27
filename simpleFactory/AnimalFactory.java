package simpleFactory;

public class AnimalFactory {
    public enum Type {DOG, TIGER};
    public Animal createAnimal(Type animalType) {
        Animal animal = null;
        if (animalType.equals(Type.DOG)) {
            animal = new Dog();
        } else if (animalType.equals(Type.TIGER)) {
            animal = new Tiger();
        }

        return animal;
    }
}
