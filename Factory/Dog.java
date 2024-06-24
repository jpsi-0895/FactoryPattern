
package FactoryMethod.Factory;

public class Dog implements Animal {

    public Dog() {
        System.out.println("\n A dog is created.");
    }

    public void displayBehavior() {
        System.out.println("It says: Bow-Wow");
        System.out.println("It prefers barking.");
    }
}
