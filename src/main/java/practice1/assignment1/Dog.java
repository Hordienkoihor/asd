package practice1.assignment1;

import java.util.Objects;

public class Dog extends Animal {
    private String breed;

    public Dog() {
        super();
    }

    public Dog(String name, String breed) {
        super(name);
        this.breed = breed;
    }

    public Dog(String name) {
        super(name);
        this.breed = "default breed";
    }

    public void bark() {
        System.out.println("Bark");
    }

    @Override
    public void eat() {
        System.out.println("Dog " + super.getName() + " is eating");
    }

    @Override
    public String toString() {
       return ("name: " + super.toString() +"\n" +"breed: " + this.breed);
    }

    @Override
    public boolean equals(Object o) {
        if (o == null) {
            return false;
        }

        if (this == o) {
            return true;
        }

        if (!(o instanceof Dog)) {
            return false;
        }

        if (!super.equals(o)) {
            return false;
        }

        return Objects.equals(breed, ((Dog) o).breed);
    }
}
