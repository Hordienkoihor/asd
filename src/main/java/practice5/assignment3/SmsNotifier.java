package practice5.assignment3;

public interface SmsNotifier {
    default void send(String message) {
        System.out.println("Sms: " + message);
    }
}
