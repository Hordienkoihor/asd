package practice1.assignment3;


import practice1.assignment1.Animal;
import practice1.assignment1.Dog;

public class Main {
    public static void main(String[] args) {
        Animal animal = new Dog("dog");
        Animal animal2 = new Animal("not a dog");

        animal.eat();
        System.out.println();
        Animal.feed(animal);
        System.out.println();
        Animal.feed(animal2);

    }
}
