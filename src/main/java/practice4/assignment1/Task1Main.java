package practice4.assignment1;

public class Task1Main {
    public static void main(String[] args) {
        Animal[] animals = {new Dog(), new Cat(), new Dog()};

        for (Animal animal : animals) {
            animal.speak();
        }
    }
}
