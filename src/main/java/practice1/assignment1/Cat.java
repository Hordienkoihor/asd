package practice1.assignment1;

public class Cat extends Animal {
    private String breed;

    public Cat() {
        super();
    }

    public Cat(String name, String breed) {
        super(name);
        this.breed = breed;
    }

    @Override
    public String toString() {
       return (super.toString() + this.breed);
    }
}
