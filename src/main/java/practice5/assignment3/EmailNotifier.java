package practice5.assignment3;

public interface EmailNotifier {
    default void send(String message) {
        System.out.println("Email: " + message);
    }
}
