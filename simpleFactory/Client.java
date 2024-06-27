package simpleFactory;

public class Client {
    public static void main(String[] args) {
        System.out.println("**** Simple Factory Demonstration ****");
        AnimalFactory factory = new AnimalFactory();
        Animal animal = factory.createAnimal(AnimalFactory.Type.DOG);
        animal.displayBehavior();

        animal = factory.createAnimal(AnimalFactory.Type.DOG);
        animal.displayBehavior();
    }
}
