package practice7.assignment1;

public class Main {
    public static void main(String[] args) {
        /*negative id*/
        try {
            Order order = new Order(-1, "email@ukr.net", 10);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        /*email without @*/
        try {
            Order order = new Order(1, "emailukr.net", 10);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        /*negative totalCents*/
        try {
            Order order = new Order(1, "email@ukr.net", -10);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        /*valid params*/
        try {
            Order order = new Order(1, "email@ukr.net", 10);
            System.out.println(order);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}

