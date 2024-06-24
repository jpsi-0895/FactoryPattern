package FactoryMethod.Factory;

import java.lang.reflect.Method;

public class Client {
    public static void main(String[] args) {
        System.out.println("***Factory Method Pattern Demo.***");
        AnimalFactory factory;
        // Animal animal;
        // Create a tiger and display its behavior
        // using TigerFactory.
        factory = new TigerFactory();
        factory.createAndDisplayAnimal("yellow");

        // animal.displayBehavior();
        // Create a dog and display its behavior
        // using DogFactory.
        factory = new DogFactory();
        factory.createAndDisplayAnimal("white");
        animal.displayBehavior();
    }
}
