package practice1.assignment1;

import java.util.Objects;

/**
 * class representing animal
 */
public class Animal {
    /*string name*/
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Animal() {
        this.name = "default";
    }

    @Override
    public String toString() {
        return name;
    }

    public void eat() {
        System.out.println("Animal " + name + " is eating");
    }

    public static void feed(Animal animal) {
        System.out.println("feeding " + animal.getName());

        if (animal instanceof Dog) {
            ((Dog) animal).bark();
        }
    }

    @Override
    public boolean equals(Object o) {
        if (o == null) {
            return false;
        }

        if (this == o) {
            return true;
        }

        if (!(o instanceof Animal)) {
            return false;
        }

        return Objects.equals(name, ((Animal) o).name);
    }


}
