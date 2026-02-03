package practice4.assignment1;

public class Dog extends Animal {
    public Dog() {}

    @Override
    public void speak() {
        System.out.println("I'm a dog");
    }

    public void fetchStick() {
        System.out.println("fetch stick");
    }
}
