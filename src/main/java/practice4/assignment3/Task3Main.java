package practice4.assignment3;

import practice4.assignment1.Animal;
import practice4.assignment1.Cat;
import practice4.assignment1.Dog;

public class Task3Main {
    public static void main(String[] args) {
        Animal a = new Dog();
        Animal b = new Cat();

        if (a instanceof Dog dog) {
            dog.fetchStick();
        }

        if (b instanceof Dog dog) {
            dog.fetchStick();
        }

        /* якщо закастити Dog d = (Dog) b буде клас класт екцепшн*/
    }
}
